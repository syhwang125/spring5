package com.java.springmvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class TicketDao {

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void buyTicket(final TicketDto dto) {
		System.out.println("buyTicket()");
		System.out.println(" dto.getConsumerId(): " + dto.getConsumerId());
		System.out.println("dto.getAmount() : " + dto.getAmount());
		
		template.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String query = " insert into movie_card(consumerId, amount) values (?,?) ";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1,  dto.getConsumerId());
				pstmt.setInt(2,  dto.getAmount());
				return pstmt;
			}
		});
		 
		template.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String query = "insert into movie_ticket (consumerId, countnum) values (?,?)" ;
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1,  dto.getConsumerId());
				pstmt.setInt(2,  dto.getAmount());
				return pstmt;
			}
		});
		
	}
}
