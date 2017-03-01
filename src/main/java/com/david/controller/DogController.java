package com.david.controller;

import com.david.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author David
 * @since 2/28/17.
 */
@RestController
@RequestMapping("/dogs")
public class DogController {

    @Autowired
    private DogService dogService;

    @RequestMapping("/")
    public Map<String, List<String>> getDogs() {
        return dogService.getDogs();
    }
}
