package com.budak.controller;

import com.budak.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebMethod;

/**
 * @author Samet BUDAK
 * @since
 */
@RestController
@RequestMapping(path = "/")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @RequestMapping(value = "hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable(value = "name") String name) {
        return greetingService.sayHello(name);
    }
}
