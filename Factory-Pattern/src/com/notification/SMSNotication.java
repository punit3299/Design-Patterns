package com.notification;

public class SMSNotication implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Notifying through SMS");
	}

}
