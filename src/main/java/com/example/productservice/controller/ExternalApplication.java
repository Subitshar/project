package com.example.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalApplication {
	@GetMapping("/weather")
	public String getWeather(@RequestParam("city") String city) {
		String url = "http://api.weatherstack.com/current?access_key=7c10aeb59ae16949a1e1850b207b2a53&query="+city;
		RestTemplate restTemplate = new RestTemplate();
		String weatherData = restTemplate.getForObject(url, String.class);
		return weatherData;
	}

}
