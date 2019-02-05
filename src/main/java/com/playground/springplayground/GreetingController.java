package com.playground.springplayground;

import java.util.concurrent.atomic.AtomicLong;

import com.playground.springplayground.db.entities.MagicPoint;
import com.playground.springplayground.db.repository.MagicPointRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    MagicPointRepository magicPointRepository;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {

        MagicPoint magicPoint = magicPointRepository.getAllByDescription("Abc");
        log.info(magicPoint.getDescription());
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}