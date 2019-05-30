package com.budak.service;

import org.springframework.stereotype.Component;

/**
 * @author Samet BUDAK
 * @since
 */
@Component
public interface GreetingService {

    String sayHello(String name);
}
