package io.alka.springBoot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*This is a controller class known by @RestController annotation and return type is always Json type
 * No need to specify explicitely.. By default @RequestMapping method type is GET so no need to specify that as well..
 * 
 * 
 */

@RestController
public class DemoController {
	
	@RequestMapping("/demo")
	public String printHi() {
		return "Welcome to SpringBoot World";
	}

}
