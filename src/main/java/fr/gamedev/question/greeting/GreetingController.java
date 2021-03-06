package fr.gamedev.question.greeting;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author djer1
 */
@RestController
public class GreetingController {
    /**
     * Message template. GreetingController template
     */
    private static final String TEMPLATE = "Hello, %s!";
    /**
     * AtomicLong counter id.
     */
    private final AtomicLong counter = new AtomicLong();

    /**
     * @param name name of user to greet.
     * @return the custom greeting message.
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")
    final String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}
