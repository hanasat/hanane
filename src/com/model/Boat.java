package com.model;

import java.util.ArrayList;
import java.util.List;

public class Boat {
	
	private Direction direction;
	private Model model;
	private List<Case> caseList;
	private Case caseDepart;
	
	/* contsructor   */

public Boat(Case caseDepart, Direction direction, Model model) {
	super();
	this.caseDepart=caseDepart;
	this.direction = direction;
	this.caseList = new ArrayList<Case>();
	this.model = model;
	caseList.add(caseDepart);	
}
public Direction getDirection() {
	return direction;
}
public void setDirection(Direction direction) {
	this.direction = direction;
}
public Model getModel() {
	return model;
}
public void setModel(Model model) {
	this.model = model;
}
public List<Case> getCases() {
	return caseList;
}
public void setCases(List<Case> cases) {
	this.caseList = cases;
}



public List<Case> getCaseList() {
	return caseList;
}
public void setCaseList(List<Case> caseList) {
	this.caseList = caseList;
}
public Case getCaseDepart() {
	return caseDepart;
}
public void setCaseDepart(Case caseDepart) {
	this.caseDepart = caseDepart;
}
public void BoatSunk() {
	boolean checked = false;
		for(Case coordonee :this.getCases())
		{
			if (coordonee.getStatus().ISSUNK.equals(true))
			{
				System.out.println("case : "+coordonee +"est coulé");
				checked = true;
			}
		}
		
	   if(checked==false)
	   {
		   System.out.println("le bateau n'est pas coulé");
	   }else {
		   System.out.println("le bateau n'est pas coulé");
	   }
	}
@Override
public String toString() {
	return "Boat [direction=" + direction + ", model=" + model + ", caseList=" + caseList + "]";
}

public void afficherBateau()
{
	
	for(int i=0; i<this.getCaseList().size();i++)
	this.getCaseList().get(i).afficherCase();
}
//placer un bateau


}
	


	
	


