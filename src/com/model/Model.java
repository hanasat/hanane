package com.model;

public enum Model {
	
	CRUISER(2),
	BATTLESHIP(3),
	SUBMARINE(4);
	
	int size;
	
	private Model(int size) {
		
		this.size = size;
		
	}

	public int getSize() {
		return size;
	}

	
	
}
