package com.kodewala.interfaces.ticketbooking;

public class User implements ITicket {

	@Override
	public void book(int num) {
		if (num > MAX_TICKETS) {
			System.out.println("not allowed above 6 tickets");
		} else {
			System.out.println("User.book()");
		}

	}

	@Override
	public void cancle() {
		System.out.println("User.cancle()");

	}

	@Override
	public void search() {
		System.out.println("User.search()");

	}

}
