/*
 * Copyright 2017 Motorola Solutions, Inc.
 * All Rights Reserved.
 * Motorola Solutions Confidential Restricted
 */
package pl.paweljedrzejewski.recipelist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndex(){
        System.out.println("Some text to display");
        return "index";
    }
}
