package com.misaki.consumer.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHelloController {

    private MisakiProducerService misakiProducerService;

    public FeignHelloController(@Qualifier("com.misaki.consumer.controller.MisakiProducerService") MisakiProducerService misakiProducerService) {
        this.misakiProducerService = misakiProducerService;
    }

    @RequestMapping("/feign/call")
    public String call() {
        // 像调用本地服务一样
        return misakiProducerService.hello();
    }

}