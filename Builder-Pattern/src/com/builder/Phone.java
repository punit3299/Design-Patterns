package com.builder;

public class Phone {

	private String os;
	private String processor;
	private int battery;
	private int memory;
	private int ram;

	public Phone(String os, String processor, int battery, int memory, int ram) {
		super();
		this.os = os;
		this.processor = processor;
		this.battery = battery;
		this.memory = memory;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", battery=" + battery + ", memory=" + memory + ", ram="
				+ ram + "]";
	}

}
