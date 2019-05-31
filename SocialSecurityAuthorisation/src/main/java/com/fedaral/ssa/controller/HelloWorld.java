package com.fedaral.ssa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
@GetMapping("/")
public String get() {
	return "hii i am form hello world";
}

}
