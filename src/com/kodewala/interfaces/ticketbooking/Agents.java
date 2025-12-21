package com.kodewala.interfaces.ticketbooking;

public class Agents implements ITicket {

	@Override
	public void book(int num) {
		if (num > MAX_TICKETS) {
			System.out.println("not allowed above 6 tickets");
		} else {
			System.out.println("Agents.book()");
		}

	}

	@Override
	public void cancle() {
		System.out.println("Agents.cancle()");

	}

	@Override
	public void search() {
		System.out.println("Agents.search()");

	}

}
