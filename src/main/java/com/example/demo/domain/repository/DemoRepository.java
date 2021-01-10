package com.example.demo.domain.repository;

import com.example.demo.domain.model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo, Long> {
    Demo findById(long id);

}
