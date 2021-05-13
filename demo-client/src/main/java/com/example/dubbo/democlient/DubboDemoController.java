package com.example.dubbo.democlient;

import com.example.dubbo.api.demo.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljj
 * @version sprint 42
 * @className DubboDemoController
 * @description
 * @date 2021-05-13 16:13:24
 */
@RestController
@RequestMapping("/dubbo/test")
public class DubboDemoController {
    @Reference
    private DemoService demoService;
    @PostMapping("/sayHello")
    public void sayHello(){
        System.out.println(demoService.helloWorld());
    }
}
