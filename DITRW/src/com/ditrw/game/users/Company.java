package com.ditrw.game.users;

public class Company {
	
	
	private int companyID = 0;
	private int numOfPartTimeJobs = 0;
	private int numOfNoHSJobs = 0;
	private int numOfNoDegreeJobs = 0;
	private int numOfDegreeJobs = 0;
	private int numOfAdvancedJobs = 0;
	
	private int availPartTimeJobs = 0;
	private int availNoHSJobs = 0;
	private int availNoDegreeJobs = 0;
	private int availDegreeJobs = 0;
	private int availAdvancedJobs = 0;
	
	private int totalJobs = 0;
	private int totalAvail = 0;
	
	public int getCompanyID() {
		return companyID;
	}
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	
	public int getNumOfPartTimeJobs() {
		return numOfPartTimeJobs;
	}
	public void setNumOfPartTimeJobs(int numOfPartTimeJobs) {
		this.numOfPartTimeJobs = numOfPartTimeJobs;
	}
	public int getNumOfNoHSJobs() {
		return numOfNoHSJobs;
	}
	public void setNumOfNoHSJobs(int numOfNoHSJobs) {
		this.numOfNoHSJobs = numOfNoHSJobs;
	}
	public int getNumOfNoDegreeJobs() {
		return numOfNoDegreeJobs;
	}
	public void setNumOfNoDegreeJobs(int numOfNoDegreeJobs) {
		this.numOfNoDegreeJobs = numOfNoDegreeJobs;
	}
	public int getNumOfDegreeJobs() {
		return numOfDegreeJobs;
	}
	public void setNumOfDegreeJobs(int numOfDegreeJobs) {
		this.numOfDegreeJobs = numOfDegreeJobs;
	}
	public int getNumOfAdvancedJobs() {
		return numOfAdvancedJobs;
	}
	public void setNumOfAdvancedJobs(int numOfAdvancedJobs) {
		this.numOfAdvancedJobs = numOfAdvancedJobs;
	}
	public int getAvailPartTimeJobs() {
		return availPartTimeJobs;
	}
	public void setAvailPartTimeJobs(int availPartTimeJobs) {
		this.availPartTimeJobs = availPartTimeJobs;
	}
	public int getAvailNoHSJobs() {
		return availNoHSJobs;
	}
	public void setAvailNoHSJobs(int availNoHSJobs) {
		this.availNoHSJobs = availNoHSJobs;
	}
	public int getAvailNoDegreeJobs() {
		return availNoDegreeJobs;
	}
	public void setAvailNoDegreeJobs(int availNoDegreeJobs) {
		this.availNoDegreeJobs = availNoDegreeJobs;
	}
	public int getAvailDegreeJobs() {
		return availDegreeJobs;
	}
	public void setAvailDegreeJobs(int availDegreeJobs) {
		this.availDegreeJobs = availDegreeJobs;
	}
	public int getAvailAdvancedJobs() {
		return availAdvancedJobs;
	}
	public void setAvailAdvancedJobs(int availAdvancedJobs) {
		this.availAdvancedJobs = availAdvancedJobs;
	}
	public int getTotalJobs() {
		return numOfAdvancedJobs+numOfDegreeJobs+numOfNoDegreeJobs+numOfNoHSJobs+numOfPartTimeJobs;
	}
	public void setTotalJobs(int totalJobs) {
		this.totalJobs = totalJobs;
	}
	public int getTotalAvail() {
		return availAdvancedJobs+availDegreeJobs+availNoDegreeJobs+availNoHSJobs+availPartTimeJobs;
	}
	public void setTotalAvail(int totalAvail) {
		this.totalAvail = totalAvail;
	}
	
	
	
	
	

}
