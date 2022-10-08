package com.misaki.consumer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
public class MisakiProducerHystrix implements MisakiProducerService{
    @RequestMapping("/hello")
    public String hello() {
        return "sorry, hello service call failed.";
    }
}
