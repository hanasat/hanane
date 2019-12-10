package com.model;

import java.util.List;
import java.util.Map;

public class WireRack {
	
	//liste contient les case et leurs status
	private Map<Case,StatusCase> statusCaseList ;
	//liste des bateur existant dans la grille
	private List<Boat> boatList;

	
	//constructeur	
	public WireRack(Map<Case, StatusCase> statusCaseList, List<Boat> boatList) {
		super();
		this.statusCaseList = statusCaseList;
		this.boatList = boatList;
	}

	//getters & setters

	public Map<Case, StatusCase> getStatusCaseList() {
		return statusCaseList;
	}


	public void setStatusCaseList(Map<Case, StatusCase> statusCaseList) {
		this.statusCaseList = statusCaseList;
	}


	public List<Boat> getBoatList() {
		return boatList;
	}


	public void setBoatList(List<Boat> boatList) {
		this.boatList = boatList;
	}


	/*public void putBoat(Boat b) {
		 boatList.add(b);
		 System.out.println();
		
	}*/
	
	//methodes
	
	@Override
	public String toString() {
		return "WireRack [statusCaseList=" + statusCaseList.toString() + ", boatList=" + boatList.toString() + "]";
	}
	
	public void afficherGrille() {
		for(int i=0; i<this.getBoatList().size();i++)
		{
		System.out.print("\n boat"+(i+1)+" : ");
		this.getBoatList().get(i).afficherBateau();
		}
	}

	//faire couler une case
	public void sunkCase(Case c) {
		
	 c.setStatus(StatusCase.ISSUNK);
	 System.out.println("la case : "+c+" a été coulé ");
	}
	
	//placer un bateau : 
	/*
	 * si le bateau existe pas dans la listeBateau
	 * 	placerBateau:
	 * 		
	 * 
	 * */
	public void placeBoat(Boat b) {
		int x = 0;
		char y = '0';

		if(b.getCaseDepart().getStatus().equals(StatusCase.ISFREE))
		{
			if(b.getDirection().equals(Direction.NORTH))
			{
				for(int i=1;i<b.getModel().getSize();i++)
				{
					 y= (char)(b.getCaseDepart().getY()-i);
					 x = b.getCaseDepart().getX();
					Case c = new Case(y,x,StatusCase.ISCHECKED);
					if(!c.checkCoordonee())		
					b.getCaseList().add(c);
				}
			}else if(b.getDirection().equals(Direction.SOUTH))
			{
				for(int i=1;i<b.getModel().getSize();i++)
				{
					 y= (char)(b.getCaseDepart().getY()+i);
					 x = b.getCaseDepart().getX();
					Case c = new Case(y,x,StatusCase.ISCHECKED);
					if(!c.checkCoordonee())		
					b.getCaseList().add(c);
				}
				
			}else if(b.getDirection().equals(Direction.EAST))
			{
				
				for(int i=1;i<b.getModel().getSize();i++)
				{
					 y = b.getCaseDepart().getY();
					 x = b.getCaseDepart().getX()+i;
					Case c = new Case(y,x,StatusCase.ISCHECKED);
					if(!c.checkCoordonee())		
					b.getCaseList().add(c);
				}
				
			}else if(b.getDirection().equals(Direction.WEST))
			{
				for(int i=1;i<b.getModel().getSize();i++)
				{
					 y = b.getCaseDepart().getY();
					 x = b.getCaseDepart().getX()-i;
					Case c = new Case(y,x,StatusCase.ISCHECKED);
					if(!c.checkCoordonee())		
					b.getCaseList().add(c);
				}
			}
		}//si la case de depart n'est pas free
		else {
			System.out.println("impossible de placer le bateau la case de depart : "+b.getCaseDepart());
		}

	}
	
	//la liste des case occupées
	public void getListCaseChecked() {
		for(int i=0;i<this.getBoatList().size();i++)
		{
			this.statusCaseList.put(this.getBoatList().get(i).getCaseList().get(i),StatusCase.ISCHECKED);
		}
		
		System.out.println(this.statusCaseList.keySet().toString());
	

	}
		
}
