package com.springboot.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/look")
public class LookWorldController {



    @RequestMapping("/test")
    public ModelAndView helloto(Map<String, Object> model){
        model.put("now", DateFormat.getDateTimeInstance().format(new Date()));
        ModelAndView mv = new ModelAndView("hello");
        return mv;
    }


    @RequestMapping("/websocket")
    public ModelAndView websocket(Map<String, Object> model){
        ModelAndView mv = new ModelAndView("websocket");
        return mv;
    }

    @RequestMapping("/websocketcc")
    public ModelAndView ccgdfd(Map<String, Object> model){
        ModelAndView mvc = new ModelAndView("websocket");

        return mvc;
    }

}
