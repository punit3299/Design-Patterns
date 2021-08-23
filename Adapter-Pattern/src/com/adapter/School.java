package com.adapter;

public class School {
	public static void main(String[] args) {

		Pen pen = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setPen(pen);
		aw.writeAssignment("Writing the Assignment...");

	}
}
