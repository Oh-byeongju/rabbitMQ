package kosta.edu.mq.controller;

import jakarta.servlet.http.HttpServletRequest;
import kosta.edu.mq.QueueProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MQRestController {

    @Autowired
    QueueProvider queueProvider;

    @RequestMapping("/mq")
    public String requestMQ (HttpServletRequest request, String id, String name) {
        queueProvider.provide("id = " + id + ", name = " + name);
        return "mq hello";
    }
}
