package com.ibc.springbootproject.contoller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayController {

    @PostMapping("/ibc")
    public String ibcController()
    {
        return "this is using PostMaping";
    }
    @PostMapping("/pv/{id}")
    public String requestId(@PathVariable("id") int id)
    {
        return "this is using PathVariable"+id;
    }
}

