// Medication Class
// Created in part by Cooper Mehlenbacher
// 11/22/2013
// Containes Medication Information such as: ID, Name, Cost, Side Effects.

public class Medication {

	private Integer id = "0";
	private String name = ""
	private Double cost = "-1"
	private String sideEffects = "";

	public void setID(Integer aID){
		this.id = aID;
	}

	public void setName(String aName){
		this.name = aName;
	}

	public void setCost(Double aCost){
		this.cost = aCost;
	}

	public void setSideEffects(String aSideEffects){
		this.sideEffects = aSideEffects;
	}

	public Integer getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public Double getCost() {
		return this.getCost;
	}

	public String getSideEffects() {
		return this.sideEffects;
	}

	public Medication() {
		//empty constructor
	}

	public Medication(Integer aID, String aName, Double aCost, String aSideEffects){
		this();
		this.id = aID;
		this.name = aName;
		this.cost = aCost;
		this.sideEffects = aSideEffects;
	}

	public String toString() {
		String aString = "";
		aString = "ID: " + this.id + "\n";
		aString = aString + "Name: " + this.name + "\n";
		aString = aString + "Cost: " + this.cost + "\n";
		aString = aString + "Side Effects: " + this.sideEffects + "\n";
	}

}