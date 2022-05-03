package clan.techreturners.drinks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {

    @GetMapping(value ="/coffeelover")
    public String coffeeLover() {
        return "I like coffee!";
    }
}