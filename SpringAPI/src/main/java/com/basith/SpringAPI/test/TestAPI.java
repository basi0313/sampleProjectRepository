package com.basith.SpringAPI.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestAPI {
	private static final Logger logger = LogManager.getLogger(TestAPI.class);

	TestBean bean = new TestBean();

	@GetMapping("check")
	public String test() {
		logger.info("log4j logger testing completings log file testing also completed");
		return "working 1";
	}

	@GetMapping("check2")
	public String test2() {
		bean.setTestName("");
		return "working 2";
	}

}
