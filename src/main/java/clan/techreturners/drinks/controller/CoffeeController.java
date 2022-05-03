package clan.techreturners.drinks.controller;

import clan.techreturners.drinks.model.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class CoffeeController {
    private AtomicInteger id = new AtomicInteger();

    @GetMapping(value = "/coffeelover")
    public String coffeeLover() {
        return "I like coffee!";
    }

    @GetMapping(value = "/coffee")
    public Coffee coffee(@RequestParam(value = "name", defaultValue = "latte") String name) {
        return new Coffee(id.incrementAndGet(), name);
    }
}
