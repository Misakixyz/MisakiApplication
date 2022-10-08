package com.misaki.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHelloController {

    private MisakiProducerService misakiProducerService;

    public FeignHelloController(MisakiProducerService misakiProducerService) {
        this.misakiProducerService = misakiProducerService;
    }

    @RequestMapping("/feign/call")
    public String call() {
        // 像调用本地服务一样
        return misakiProducerService.hello();
    }

}