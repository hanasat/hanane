package com.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {

	public static void main(String[] args) {
		
		System.out.println("***************LAUNCH THE GAME*******************");
		System.out.println("Construction boeat");
		Case c1 = new Case('B',1);
		Case c2 = new Case('B',3);
		Case c3 = new Case('E',5);
		
		
		//c2.setStatus(StatusCase.ISCHECKED);
		
		Boat boat1 = new Boat(c1,Direction.SOUTH,Model.BATTLESHIP);
		Boat boat2 = new Boat(c2,Direction.WEST,Model.CRUISER);
		Boat boat3 = new Boat(c3,Direction.EAST,Model.SUBMARINE);
		
		//liste des bateaux
		List<Boat> boatList = new ArrayList<Boat>();
		
		//liste des casesStatus
		Map<Case,StatusCase> listCaseOccupe = new HashMap<Case,StatusCase>();
		listCaseOccupe.put(c1, StatusCase.ISCHECKED);
		listCaseOccupe.put(c2, StatusCase.ISCHECKED);
		listCaseOccupe.put(c3, StatusCase.ISCHECKED);
		WireRack wireRack = new WireRack(listCaseOccupe, boatList);
		wireRack.getBoatList().add(boat2);
		wireRack.getBoatList().add(boat1);
		wireRack.getBoatList().add(boat3);
		
		//placer bateaux
		wireRack.placeBoat(boat1);
		wireRack.placeBoat(boat2);
		wireRack.placeBoat(boat3);
		//afficher la grilles
		wireRack.afficherGrille();
		wireRack.getListCaseChecked();
		wireRack.getBoatList().get(1).BoatSunk();
			
		//la liste des case occuper de la grille
		
		//remplir la lsite des case occupés
	 // faire couler que des case occupé
	//voir si un bateau est couler (si toute les case sont coulés)
	
	}

}
