package com.sxl.sbm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author SxL
 *         Created on 2018/6/6.
 *
 * 业务处理Controller
 */
@Controller
@RequestMapping("/example")
public class ExampleController {
    private Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @GetMapping("/**")
    @ResponseBody
    private Map<String, Object> getMapping(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>(16);

        /*
                 逻辑处理
         */

        return modelMap;
    }

    @PostMapping("/**")
    @ResponseBody
    private Map<String, Object> postMapping(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>(16);

        /*
                 逻辑处理
         */

        return modelMap;
    }

    @PutMapping("/**")
    @ResponseBody
    private Map<String, Object> putMapping(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>(16);

        /*
                 逻辑处理
         */

        return modelMap;
    }

    @DeleteMapping("/**")
    @ResponseBody
    private Map<String, Object> deleteMapping(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>(16);

        /*
                 逻辑处理
         */

        return modelMap;
    }
}
