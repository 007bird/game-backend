package tw.com.live.game_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hello() {
		return "Hello Spring Boot";
	}
	
	@GetMapping("/hamster")
	public String hamster() {
		return "倉鼠萬歲!";
	}
}
