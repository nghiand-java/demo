package com.example.demo.service.impl;

import com.example.demo.domain.model.Demo;
import com.example.demo.domain.repository.DemoRepository;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoRepository demoRepository;

    @Override
    public void saveDemo() {
        Demo demo = new Demo();
        demo.setName("nghia");
        demo.setAge(123);
        demoRepository.save(demo);
    }
}
