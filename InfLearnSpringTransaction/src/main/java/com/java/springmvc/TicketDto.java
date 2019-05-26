package com.java.springmvc;

public class TicketDto {

	private String consumerId;
	private Integer amount;
	
	public TicketDto(String consumerId, Integer amount) {
		this.consumerId = consumerId;
		this.amount = amount;
	}
	
	
	public String getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
}
