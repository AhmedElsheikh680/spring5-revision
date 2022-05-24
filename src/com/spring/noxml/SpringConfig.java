package com.spring.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan("com.spring.noxml")
@PropertySource("classpath:data.properties")
public class SpringConfig {
	
//	@Bean
//	public MasterInterface myMasterInterface() {
//		return new Master(mySportInterface());
//	}
//	
//	@Bean
//	public SportInterface mySportInterface() {
//		return new Sport();
//	}
	

}
