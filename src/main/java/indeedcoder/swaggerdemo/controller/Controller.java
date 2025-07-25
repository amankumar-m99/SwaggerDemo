package indeedcoder.swaggerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}

	@GetMapping("/say/{msg}")
	public String sayMsg(@PathVariable String msg) {
		return msg;
	}
}
