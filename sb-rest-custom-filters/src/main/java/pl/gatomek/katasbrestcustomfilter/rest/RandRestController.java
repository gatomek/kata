package pl.gatomek.katasbrestcustomfilter.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandRestController {

    @GetMapping( "/rand")
    public Integer getRand() {
        Random rand = new Random();
        int value = rand.nextInt(100);
        return value;
    }
}
