package com.ibc.springbootproject.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//@Controller
//@ResponseBody
@RestController

//@RequestMapping("/ibc")
public class HelloController {

    //@RequestMapping(value = "/ibc",method = RequestMethod.GET)
    @GetMapping("/ibc")
    public String hello()
    {
        return "Hello world";
    }
    //@RequestMapping(value="/ibc",method=RequestMethod.POST)
   /* @PostMapping
    public String ibcController(int id)
    {
        return "this is "+id;
    }*/
}
