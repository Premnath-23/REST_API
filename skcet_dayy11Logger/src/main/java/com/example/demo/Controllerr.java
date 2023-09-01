package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Controllerr {
	Logger logger=LoggerFactory.getLogger(Controllerr.class);
	@GetMapping("/testfile")
	public String hi() {
		logger.trace("a TRACE message");
		logger.debug("a DEBUG message");
		logger.info("an INFO message");
		logger.warn("a WARNING message");
		logger.error("an ERROR message");
		return "Hi everyone !";
	}
}