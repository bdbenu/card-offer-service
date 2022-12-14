/**
 * Copyright 2022. Lena Bank Pvt ltd.All rights resrved.
* You should not disclose the information outside 
 */
package com.keybank.offers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author 91955 at Dec 6, 2022
 *
 *
 */
@Component
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.keybank.offers.controller"))
				.paths(PathSelectors.regex("/.*")).build();
	}

}
