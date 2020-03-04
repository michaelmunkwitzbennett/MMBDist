package edu.wctc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "search2";
    }

    @RequestMapping("/list")
    public String showList() {
        return "list2";
    }

    @RequestMapping("/detail")
    public String showDetail() {
        return "detail";
    }
}
