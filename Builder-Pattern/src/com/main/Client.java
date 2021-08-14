package com.main;

import com.builder.Phone;
import com.builder.PhoneBuilder;

public class Client {
	public static void main(String[] args) {

		PhoneBuilder phoneBuilder = new PhoneBuilder();
		Phone phone = phoneBuilder.setOs("Android").setMemory(64).getPhone();
		System.out.println(phone);
	}
}
