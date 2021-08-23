package com.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Language {

	private String name;

	public Composite(String name) {
		this.name = name;
	}

	List<Language> languages = new ArrayList<>();

	public void addLanguage(Language language) {
		languages.add(language);
	}

	@Override
	public void showName() {
		System.out.println(name);
		for (int i = 0; i < languages.size(); i++) {
			System.out.print(name + "->");
			languages.get(i).showName();
		}
	}

}
