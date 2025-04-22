package com.camel.tutorial.impl;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class SimpleRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer:my-timer")
		.process(new SimpleProcessor())
		.transform().constant("Hello Pramod")
		.to("log:my-log");
		
	}

}
