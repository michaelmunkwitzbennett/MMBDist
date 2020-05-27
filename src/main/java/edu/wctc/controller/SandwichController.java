package edu.wctc.controller;

import edu.wctc.entity.Sandwich;
import edu.wctc.service.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {

    @Autowired
    private SandwichService sandwichService;

    @GetMapping("/showAddSandwichForm")
    public String showAddSandwichForm(Model theModel)
    {
        Sandwich theSandwich = new Sandwich();

        theModel.addAttribute("aSandwich", theSandwich);

        return "sandwich-form";
    }

    @GetMapping("/showUpdateSandwichForm")
    public String showUpdateSandwichForm(@RequestParam("sandwichId") int theId, Model theModel)
    {
        Sandwich theSandwich = sandwichService.getSandwich(theId);

        theModel.addAttribute("aSandwich", theSandwich);

        return "sandwich-form";
    }

    @RequestMapping("/list")
    public String listSandwiches(Model theModel)
    {
        List<Sandwich> sandwichList = sandwichService.getSandwiches();

        theModel.addAttribute("sandwiches", sandwichList);

        return "list2";
    }

    @PostMapping("/save")
    public String saveSandwich(@Valid @ModelAttribute("aSandwich") Sandwich theSandwich, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "sandwich-form";
        }

        sandwichService.saveSandwich(theSandwich);
        return "redirect:/sandwich/list";
    }

    @GetMapping("/delete")
    public String deleteDonut(@RequestParam("sandwichId") int theId)
    {
        sandwichService.deleteSandwich(theId);

        return "redirect:/sandwich/list";
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder)
    {
        StringTrimmerEditor ste = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, ste);
    }

    @GetMapping("/search")
    public String search(@RequestParam("searchTerm") String theSearchTerm, Model theModel)
    {
        List<Sandwich> matchingSandwiches = sandwichService.getSandwichesByName(theSearchTerm);

        theModel.addAttribute("sandwiches", matchingSandwiches);

        return "list2";
    }

}
