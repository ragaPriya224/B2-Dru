package io.sagePractice.springbootconfigDemo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.sagePractice.springbootconfigDemo.config.UserConfig;

@RestController
public class ConfigDemoController {
	
	
	@Value("${my.greeting}")
	private String myGreetingValue;
	
	@Value("${db.username}")
	private String dbUserDetail;
	
//	@Value("${my.list.values}")
//	private List<String> myValues;
//	
//	@Value("#{${db.details}}")
//	private Map<String, String> dbDetails;
//	
//	@Value("${app.name}")
//	private String appName;
	
	@Autowired
	private UserConfig userconfig;
	
//	@Autowired
//	private Environment environment;
//	
	@RequestMapping("/greeting")
	public String sayGreeting() {
//		userconfig.get
		return myGreetingValue +dbUserDetail;
//				+ appName + dbDetails+ userconfig.getRole() + environment;
	}

}
