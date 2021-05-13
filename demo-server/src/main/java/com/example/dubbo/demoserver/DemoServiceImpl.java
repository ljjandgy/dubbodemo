package com.example.dubbo.demoserver;

import com.example.dubbo.api.demo.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author ljj
 * @version sprint 42
 * @className DemoServiceImpl
 * @description
 * @date 2021-05-13 15:52:03
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String helloWorld() {
        return "hello dubbo";
    }
}
