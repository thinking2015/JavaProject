package edu.buaa.server;

import java.util.ArrayList;
import java.util.List;

public class Mapping {
	private String name;
	private List<String> urlPattern;
	
	public Mapping() {
		urlPattern = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getUlrPattern() {
		return urlPattern;
	}
	public void setUlrPattern(List<String> ulrPattern) {
		this.urlPattern = ulrPattern;
	}
}
