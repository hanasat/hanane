package com.model;

import java.util.ArrayList;
import java.util.List;

public class Boat {
		
	private int length;//nombre de cases
    private Case head;//tete du boat
    private Case end;//queue du boat
    private Direction direction;
    private List<Case> caseList = new ArrayList<Case>();

	/* contsructor   */

	
    public Boat(int length, Case head, Case end, Direction direction) {
		super();
		this.length = length;
		this.head = head;
		this.end = end;
		this.direction = direction;
	}

		/* Getters and setters   */
		
		public Case getHead() {
			return head;
		}
		
		public void setHead(Case head) {
			this.head = head;
		}

		public Case getEnd() {
			return end;
		}

		public void setEnd(Case end) {
			this.end = end;
		}

		
	public Direction getDirection() {
			return direction;
		}

		public void setDirection(Direction direction) {
			this.direction = direction;
		}

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	/* to string */
	@Override
	public String toString() {
		return "Boat [length=" + length + ", status=" + ", position=" +  "]";
	}

	




}
