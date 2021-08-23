package com.composite;

public class Leaf implements Language {

	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void showName() {
		System.out.println(name);
	}
}
