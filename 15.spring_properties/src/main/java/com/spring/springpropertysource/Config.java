package com.spring.springpropertysource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//Note: If we don't use @Configuration in the POJO, then we need to add 
//@Configuration
@ConfigurationProperties("my")
@Component
public class Config {

	  private List<String> servers = new ArrayList<String>();

	    public List<String> getServers() {
	        return this.servers;
	    }

		public void setServers(List<String> servers) {
			this.servers = servers;
		}
	    
}
