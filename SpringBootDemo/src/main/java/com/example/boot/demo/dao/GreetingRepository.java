package com.example.boot.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.boot.demo.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Integer> {

}
