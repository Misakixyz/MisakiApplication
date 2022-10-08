package com.misaki.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "misaki-producer", fallback = MisakiProducerHystrix.class)
public interface MisakiProducerService {
    @RequestMapping("/hello")
    public String hello();
}
