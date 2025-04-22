package com.camel.tutorial.impl;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.LoggerFactory;

public class SimpleProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
			org.slf4j.Logger logger = LoggerFactory.getLogger(SimpleProcessor.class);
			logger.info("Processing message.");
	}

}
