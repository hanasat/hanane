package com.model;

public class Case {
	
	private int x;
	private char y;
	private StatusCase status;
	
	public Case(char y, int x) {
		super();
		this.x = x;
		this.y = y;
		this.status =StatusCase.ISFREE;;
	}
	public Case( char y, int x, StatusCase statusCase) {
		super();
		this.x = x;
		this.y = y;
		this.status =statusCase.ISFREE;
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

	public StatusCase getStatus() {
		return status;
	}

	public void setStatus(StatusCase status) {
		this.status = status;
	}

	
	public void afficherCase() {
		System.out.print("["+y+x+"]");
	}
	

	public boolean checkCoordonee() {
		boolean ok=false;
		if(this.getX()>11 || this.getX()<0)
		{
			System.out.println("invalid value for "+this.getX());
			return ok;
		}else if(this.getY()<'A' || this.getY()>'J')
		{
			System.out.println("invalid value for "+this.getY());
			return ok;
		}
		return ok;
	}
	

}
