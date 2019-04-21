package com.java.springboard.dto;

import java.sql.Timestamp;

// 데이터베이스의 내용을 객체로 만드는 클래스 
public class BoardDto {

	private int bId;
	private String bName;
	private String bTitle;
	private String bContent;
//	private Timestamp bDate;
	private String bDate;
	private int bHit;
	private int bGroup;
	private int bStep;
	private int bIndent;
	
	public BoardDto() {
		
	}
	
	public BoardDto(int bId, String bName,String bTitle,String bContent,
			String bDate, int bHit, int bGroup, int bStep,int bIndent ) {
		this.bId = bId;
		this.bName = bName;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate; 
		this.bHit= bHit; 
		this.bGroup = bGroup;
		this.bStep = bStep;
		this.bIndent = bIndent;
	}
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	public int getbHit() {
		return bHit;
	}
	public void setbHit(int bHit) {
		this.bHit = bHit;
	}
	public int getbGroup() {
		return bGroup;
	}
	public void setbGroup(int bGroup) {
		this.bGroup = bGroup;
	}
	public int getbStep() {
		return bStep;
	}
	public void setbStep(int bStep) {
		this.bStep = bStep;
	}
	public int getbIndent() {
		return bIndent;
	}
	public void setbIndent(int bIndent) {
		this.bIndent = bIndent;
	}
	

}
