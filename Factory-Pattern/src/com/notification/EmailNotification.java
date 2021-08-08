package com.notification;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Notifying through Email");
	}

}
