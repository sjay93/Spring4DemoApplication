package com.yash.springpemapp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Email sender and other beans are incorporated at the service level so we will declare here.
 */
@Configuration
@ComponentScan(basePackages = {"com.yash"})
public class SpringRootConfig {
}
