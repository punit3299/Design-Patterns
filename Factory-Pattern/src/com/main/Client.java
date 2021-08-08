package com.main;

import com.notification.Notification;
import com.notification.NotificationFactory;

public class Client {
	public static void main(String[] args) {

		NotificationFactory nfs = new NotificationFactory();
		Notification notifcation = nfs.createNotification("SMS");
		notifcation.notifyUser();

	}
}
