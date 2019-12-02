package com.model;

import java.util.ArrayList;
import java.util.List;

public class WireRack {
	
	private List<Case> caseList = new ArrayList<Case>();
	private List<Boat> boatList = new ArrayList<Boat>();
	
	public List<Case> getCaseList() {
		return caseList;
	}
	public void setCaseList(List<Case> caseList) {
		this.caseList = caseList;
	}
	public List<Boat> getBoatList() {
		return boatList;
	}
	public void setBoatList(List<Boat> boatList) {
		this.boatList = boatList;
	}
	
	public void putBoat(Boat b) {
		
		
		
	}
	@Override
	public String toString() {
		return "WireRack [caseList=" + caseList + ", boatList=" + boatList + "]";
	}
	
	
		
}
