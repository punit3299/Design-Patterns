package com.builder;

public class PhoneBuilder {

	private String os;
	private String processor;
	private int battery;
	private int memory;
	private int ram;

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public PhoneBuilder setMemory(int memory) {
		this.memory = memory;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public Phone getPhone() {
		return new Phone(os, processor, battery, memory, ram);
	}
}
