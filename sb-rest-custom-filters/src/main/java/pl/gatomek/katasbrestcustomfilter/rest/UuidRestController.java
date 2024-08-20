package pl.gatomek.katasbrestcustomfilter.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UuidRestController {

    @GetMapping( "/uuid" )
    public UUID getUuid(@RequestParam( required = false) Integer v) {
        return UUID.randomUUID();
    }
}
