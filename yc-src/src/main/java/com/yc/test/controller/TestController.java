package com.yc.test.controller;

import com.yc.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService test;

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    @ResponseBody
    public HashMap getUser(@RequestParam("id") int id) {
        return test.getUser(id);
    }
}
