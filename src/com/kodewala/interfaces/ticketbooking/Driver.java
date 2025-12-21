package com.kodewala.interfaces.ticketbooking;

public class Driver {

	public static void main(String[] args) {
		ITicket user = new User();
		user.book(5);
		user.book(6);
		user.book(7);
		user.cancle();

		ITicket agent = new Agents();
		agent.book(3);
	}

}
