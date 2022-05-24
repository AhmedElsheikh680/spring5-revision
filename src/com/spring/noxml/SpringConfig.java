package com.spring.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
//@ComponentScan("com.spring.noxml")
public class SpringConfig {
	
	@Bean
	public MasterInterface myMasterInterface() {
		return new Master(mySportInterface());
	}
	
	@Bean
	public SportInterface mySportInterface() {
		return new Sport();
	}
	

}
