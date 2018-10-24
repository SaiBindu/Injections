package com.cg.speingdemotwo.service;

import java.util.List;

public class Mobile {
  int mobileId;
  String mobileName;
  double mobPrice;
  
  //Constructor Injection
  /*public Mobile(int mobileId, String mobileName,double mobPrice) {
	super();
	this.mobileId = mobileId;
	this.mobileName = mobileName;
	this.mobPrice  = mobPrice;
}*/
  
  
  
  List<Inventory> invent;//collection with all the object injection
  
  
  public List<Inventory> getInvent() {
	return invent;
}


public void setInvent(List<Inventory> invent) {
	this.invent = invent;
}


public int getMobileId() {
	return mobileId;
}


public void setMobileId(int mobileId) {
	this.mobileId = mobileId;
}


public String getMobileName() {
	return mobileName;
}


public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}


public double getMobPrice() {
	return mobPrice;
}


public void setMobPrice(double mobPrice) {
	this.mobPrice = mobPrice;
}

/*
public Inventory getInvent() {
	return invent;
}


public void setInvent(Inventory invent) {
	this.invent = invent;
}*/


public void printMobileDetails() {
	  System.out.println("Id is  " +mobileId+" Name is  " +mobileName+"with price   "+mobPrice);
	  //System.out.println(" Mobile count is "+invent.mobileCount+" Mobile company "+invent.mobileCompany);
	  for(Inventory in: invent) {
		  System.out.println(" Mobile count is "+in.mobileCount+" Mobile company "+in.mobileCompany);

	  }
  }
  
  


}
