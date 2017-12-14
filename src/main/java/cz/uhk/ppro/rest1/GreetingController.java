package cz.uhk.ppro.rest1;

import cz.uhk.ppro.rest1.model.Greeting;
import cz.uhk.ppro.rest1.model.Student;
import cz.uhk.ppro.rest1.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return greetingService.createGreeting(name);
    }

    @PostMapping("/save")
    public void saveStudent(@RequestBody  Student s) {
        System.out.println("Student: " + s.getName());
    }
}