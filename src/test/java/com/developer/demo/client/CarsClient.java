package com.developer.demo.client;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

public class CarsClient {
        public static void main(String[] args) {
            RestTemplate restTemplate = new RestTemplate();
            String url = "http://localhost:8080/cars";

            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            System.out.println(response.getBody());
        }
    }




