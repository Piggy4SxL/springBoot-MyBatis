package com.sxl.base.controller;

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
//URL路径
@RequestMapping("/example")
public class ExampleController {
    @GetMapping("/**")
    @ResponseBody
    private Map<String, Object> GetMapping(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>();

        /*
                 逻辑处理
         */

        return modelMap;
    }

    @PostMapping("/**")
    @ResponseBody
    private Map<String, Object> PostMapping(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>();

        /*
                 逻辑处理
         */

        return modelMap;
    }

    @PutMapping("/**")
    @ResponseBody
    private Map<String, Object> PutMapping(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>();

        /*
                 逻辑处理
         */

        return modelMap;
    }

    @DeleteMapping("/**")
    @ResponseBody
    private Map<String, Object> DeleteMapping(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>();

        /*
                 逻辑处理
         */

        return modelMap;
    }
}
