package com.notification;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Notifying through Push message");
	}

}
