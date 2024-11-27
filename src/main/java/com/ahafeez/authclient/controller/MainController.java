package com.ahafeez.authclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oidclient")
public class MainController {
		@GetMapping()
		 String fnGetAccountDetail(){
			return "Hello From Spring Boot OIDC Client";
		}
}
