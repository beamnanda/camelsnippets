package com.apollo.dialysis;

import org.apache.camel.builder.RouteBuilder;

public class DialysisVMRouter extends RouteBuilder {
	
	
    @Override
    public void configure() throws Exception {
	
	//from("file:C:/inputFolder?noop=true").to("file:C:/outputFolder");
	
	
	from("timer://myTimer?period=10000")
    .setBody()
    .simple("Hello World Camel fired at ")
    .to("stream:out");
    
    
    
	
    }
}
