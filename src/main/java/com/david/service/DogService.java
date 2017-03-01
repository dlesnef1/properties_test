package com.david.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author David
 * @since 2/28/17.
 */
@Service
public class DogService {

    @Value("${names}")
    private String names;

    @Resource(name = "dogs")
	private Map<String, List<String>> dogs;

	public Map<String, List<String>> getDogs() {

        return dogs;
    }
}
