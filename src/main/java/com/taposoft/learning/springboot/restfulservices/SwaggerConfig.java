package com.taposoft.learning.springboot.restfulservices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	  public static final Contact DEFAULT_CONTACT = new Contact("Raghunatha Tadipatri", "www.taposoft.com", "gotoraghu@gmail.com");
	  public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("RESTful Web Services Using Spring Boot",
			  "This is the tutorial for learning RESTful Web Services using Spring Boot", "1.0", "urn:tos",
	          DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	private static final Set<String> produces = new HashSet<String>(Arrays.asList("applciation/json","application/xml"));

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(produces)
				.consumes(produces);
	}
}
