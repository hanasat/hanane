package com.model;

public class Game {

	public static void main(String[] args) {
		
		System.out.println("***************LAUNCH THE GAME*******************");
		System.out.println("Construction boeat");
		
		Boat boat1 = new Boat(3, new Case(8,'A',true),new Case(8,'C',true),Direction.NORTH );
		Boat boat2 = new Boat(5, new Case(2,'A',true),new Case(2,'E',true),Direction.SOUTH );
		
		WireRack wireRack = new WireRack();
		wireRack.getBoatList().add(boat1);
		wireRack.getBoatList().add(boat2);
		
		System.out.println(wireRack.getCaseList().toString());
		
		
		
		
		
		
	}

}
