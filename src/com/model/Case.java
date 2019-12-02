package com.model;

public class Case {
	
	private int x;
	private char y;
	private boolean isCheked;
		
	public Case(int x, char y, boolean isCheked) {
		super();
		this.x = x;
		this.y = y;
		this.isCheked = isCheked;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public char getY() {
		return y;
	}
	public void setY(char y) {
		this.y = y;
	}

	public boolean isCheked() {
		return isCheked;
	}
	public void setCheked(boolean isCheked) {
		this.isCheked = isCheked;
	}
	@Override
	public String toString() {
		return "Case [x=" + x + ", y=" + y + "]";
	}
	
	
	

}
