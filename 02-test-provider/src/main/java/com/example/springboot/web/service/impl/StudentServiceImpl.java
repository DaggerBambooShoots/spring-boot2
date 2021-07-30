package com.example.springboot.web.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.springboot.web.service.StudentService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 35000)
public class StudentServiceImpl implements StudentService {

    @Override
    public String test() {
        return "test";
    }
}
