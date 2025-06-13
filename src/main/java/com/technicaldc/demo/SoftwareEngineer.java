package com.technicaldc.demo;

public class SoftwareEngineer {
	private Integer id;
	private String name;
	private String techStack;

	public SoftwareEngineer() { }

	public SoftwareEngineer(Integer id, String name, String techStack) {
		this.id = id;
		this.name = name;
		this.techStack = techStack;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTechStack() {
		return techStack;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}

}
