package com.budak.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Samet BUDAK
 * @since
 */
@Component
@Profile("english")
public class GreetingServiceEnImpl implements GreetingService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
