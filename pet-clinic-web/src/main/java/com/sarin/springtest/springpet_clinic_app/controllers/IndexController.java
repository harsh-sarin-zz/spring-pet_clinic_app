package com.sarin.springtest.springpet_clinic_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Harsh Sarin
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("/oups")
    public String errorHandler() {
        return "notimplemented";
    }
}
