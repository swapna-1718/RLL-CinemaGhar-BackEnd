package com.cinemaGhar1.service;

import java.util.List;

import com.cinemaGhar1.dao.entity.Ticket;

public interface TicketService 
{
	public List<Ticket> getTicketByNumber(Long ticketId) ;
	public List<Ticket> getAllTickets() ;
	public List<Ticket> getLastInsertedTicket();

}