package com.commits.napoleon;

import org.springframework.stereotype.Component;

@Component
public class Pieces {
	private int pieceId;
	private String pieceName;
	
	public int getPieceId() {
		return pieceId;
	}
	public void setPieceId(int pieceId) {
		this.pieceId = pieceId;
	}
	public String getPieceName() {
		return pieceName;
	}
	public void setPieceName(String pieceName) {
		this.pieceName = pieceName;
	}

	public void piece() {
		System.out.println("Completed");
	}
}
