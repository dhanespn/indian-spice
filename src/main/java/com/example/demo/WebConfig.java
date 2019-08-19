package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
	@ComponentScan(basePackages = "com.example.demo")

	public class WebConfig implements WebMvcConfigurer {
	    @Bean
	    public ClassLoaderTemplateResolver yourTemplateResolver() {
	        ClassLoaderTemplateResolver configurer = new ClassLoaderTemplateResolver();
	        configurer.setPrefix("static/");
	        configurer.setSuffix(".html");
	        configurer.setTemplateMode(TemplateMode.HTML);
	        configurer.setCharacterEncoding("UTF-8");
	        configurer.setOrder(0);  // this is important. This way spring //boot will listen to both places 0 and 1
	        configurer.setCacheable(false);
	        configurer.setCheckExistence(true);
	        return configurer;
	    }
	    
	/*
	 * @Bean public BCryptPasswordEncoder passwordEncoder() { BCryptPasswordEncoder
	 * bCryptPasswordEncoder = new BCryptPasswordEncoder(); return
	 * bCryptPasswordEncoder; }
	 */
	}
