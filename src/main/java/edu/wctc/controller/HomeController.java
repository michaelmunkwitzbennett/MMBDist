package edu.wctc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }

    @RequestMapping("/searcher")
    public String showSearcher() {
        return "searcher";
    }

    @RequestMapping("/search")
    public String showSearch() {
        return "list2";
    }

    @RequestMapping("/list")
    public String showList() {
        return "list2";
    }

    @RequestMapping("/detail")
    public String showDetail() {
        return "detail";
    }

    @RequestMapping("/errors")
    public String handleErrors(HttpServletRequest request, Model theModel)
    {
        int httpErrorCode = (Integer)request.getAttribute("javax.servlet.error.status_code");

        String userFriendlyMessage = "Something went wrong!";

        switch(httpErrorCode){
            case 404:
                userFriendlyMessage = "404! Page not found...";
                break;
            case 500:
                userFriendlyMessage = "500! Our Mistake...";
                break;
        }

        theModel.addAttribute("errorMessage", userFriendlyMessage);

        return "errors";
    }
}
