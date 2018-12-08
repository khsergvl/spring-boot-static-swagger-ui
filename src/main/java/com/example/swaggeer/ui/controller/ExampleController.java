package com.example.swaggeer.ui.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*
 * This is sample controller to represent swagger-ui work
 */
@RestController
public class ExampleController {

    @RequestMapping(method = GET, path = "/power-of-two", produces = APPLICATION_JSON_VALUE)
    public Map<String, Double> getPowerOfTwo(@RequestParam double i) {
        return ImmutableMap.of("Initial value", i, "Power of two", Math.pow(2, i));
    }
}
