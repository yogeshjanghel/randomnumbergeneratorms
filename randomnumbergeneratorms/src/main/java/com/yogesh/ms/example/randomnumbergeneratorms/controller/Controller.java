package com.yogesh.ms.example.randomnumbergeneratorms.controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("randomnumber/from/{from}/to/{to}")
	public ArrayList<Integer> generateRandomNumber(@PathVariable String from, @PathVariable String to)
	{
		ArrayList<Integer> randomNumberList =  new ArrayList<>();
		
		Random newRand = new Random();
		int number = newRand.nextInt(Integer.parseInt(from) - Integer.parseInt(to)) + Integer.parseInt(to);
		randomNumberList.add(number);
		
		return randomNumberList;
		
	}
	
}
