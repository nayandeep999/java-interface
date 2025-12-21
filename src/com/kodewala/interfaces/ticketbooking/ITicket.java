package com.kodewala.interfaces.ticketbooking;

public interface ITicket {

	void search();

	void book(int num);

	void cancle();

	int MAX_TICKETS = 6;

}
