package com.ri.gov.ies.properties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@EnableConfigurationProperties
@ConfigurationProperties(prefix="ies")
@Component
public class ApplicationProperties {
	private Map<String, String> application = new HashMap<>();

	public Map<String, String> getApplication() {
		return application;
	}

	public void setApplication(Map<String, String> prop) {
		this.application = prop;
	}
}
