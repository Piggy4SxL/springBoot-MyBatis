package com.sxl.sbm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author SxL
 *      Created on 2018/6/6.
 *
 * 页面转发Controller
 */
@Controller
@RequestMapping(value = "/frontend", method = RequestMethod.GET)
public class ExampleWebController {
    @RequestMapping(value = {"/index", "/"})
    private String index(){
        return "/frontend/index";
    }
}
