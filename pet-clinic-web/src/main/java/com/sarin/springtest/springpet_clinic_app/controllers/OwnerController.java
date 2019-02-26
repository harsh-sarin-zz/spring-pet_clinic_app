package com.sarin.springtest.springpet_clinic_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Harsh Sarin
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners() { return "owners/index"; }
}
