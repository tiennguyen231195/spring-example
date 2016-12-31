package com.demo.domain;

public class Language {
	
	private String id;
	private String english;
	private String vietnamese;
	
	public Language() {
	}

	public Language(String id, String english, String vietnamese) {
		super();
		this.id = id;
		this.english = english;
		this.vietnamese = vietnamese;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getVietnamese() {
		return vietnamese;
	}

	public void setVietnamese(String vietnamese) {
		this.vietnamese = vietnamese;
	}

}
