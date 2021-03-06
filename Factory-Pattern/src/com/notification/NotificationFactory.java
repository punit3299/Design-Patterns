package com.notification;

public class NotificationFactory {

	public Notification createNotification(String s) {
		if (s.equals("SMS")) {
			return new SMSNotication();
		} else if (s.equals("Email")) {
			return new EmailNotification();
		} else if (s.equals("Push")) {
			return new PushNotification();
		}
		return null;
	}
}
