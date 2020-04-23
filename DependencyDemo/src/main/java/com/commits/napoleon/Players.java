package com.commits.napoleon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Players {
	private int id;
	private String name;
	private String opening;
	
	@Autowired
	private Pieces pieceDetail;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOpening() {
		return opening;
	}
	public void setOpening(String opening) {
		this.opening = opening;
	}
	
	public void display() {
		System.out.println("Players Object Returned Successfully");
		pieceDetail.piece();
	}
	
	
	public Pieces getPieceDetail() {
		return pieceDetail;
	}
	public void setPieceDetail(Pieces pieceDetail) {
		this.pieceDetail = pieceDetail;
	}
}
