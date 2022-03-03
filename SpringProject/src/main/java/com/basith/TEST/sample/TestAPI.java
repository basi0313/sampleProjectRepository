package com.basith.TEST.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/TEST")
public class TestAPI {

	Logger log = LoggerFactory.getLogger(TestAPI.class);	
	
	@GetMapping("getAPI")
	public String checking() {
		log.info("ERROR OCCURRED");
		return "successfully";
	}
	
}
