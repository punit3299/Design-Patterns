package com.client;

import com.composite.Composite;
import com.composite.Language;
import com.composite.Leaf;

public class Client {
	public static void main(String[] args) {
		Language f1 = new Leaf("Angular");
		Language f2 = new Leaf("React");
		Language b1 = new Leaf("Spring");
		Language b2 = new Leaf("Django");
		Language b3 = new Leaf("Node.js");

		Composite fs = new Composite("Full Stack");
		Composite f = new Composite("Frontend");
		Composite b = new Composite("Backend");
		
		f.addLanguage(f1);
		f.addLanguage(f2);
		
		b.addLanguage(b1);
		b.addLanguage(b2);
		
		fs.addLanguage(f);
		fs.addLanguage(b);
		
		fs.showName();
	}
}
