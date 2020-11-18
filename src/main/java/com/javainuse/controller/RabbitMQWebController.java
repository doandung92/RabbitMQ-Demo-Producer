package com.javainuse.controller;

import com.javainuse.model.Employee;
import com.javainuse.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class RabbitMQWebController {

    @Autowired
    RabbitMQSender rabbitMQSender;

    @GetMapping("/producer")
    public String producer(String name) {
        Employee emp = new Employee();
        emp.setId("1");
        emp.setName(name);
        rabbitMQSender.send(emp);
        return "Message sent to the RabbitMQ JavaInUse Successfully";
    }

}

