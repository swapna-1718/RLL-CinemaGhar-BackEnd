package com.cinemaGhar1.dao.api;

import java.util.List;

import com.cinemaGhar1.dao.entity.Ticket;


public interface TicketDao 
{
	public List<Ticket> getTicketByNumber(Long ticketId);
	public List<Ticket> getAllTickets();
	public List<Ticket> getLastInsertedTicket();

}