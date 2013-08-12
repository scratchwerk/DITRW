package com.ditrw.game.users;

public class Player extends BaseUser{

	
	public final static String NO_HS_DIPLOMA = "No High School Diploma";
	public final static String HS_DIPLOMA = "High School Diploma";
	public final static String COLLEGE_ACCEPTED = "Accepted to College";
	public final static String COLLEGE_ENROLLED = "Enrolled in College";
	public final static String COLLEGE_DEGREE = "Bachelors";
	public final static String ADVANCED_DEGREE = "Advanced Degree";
	
	public final static String MISDEMENOR = "Misdemenor";
	public final static String FELONY = "Felony";
	
	private int householdIncome = 0;
	private int numOfKids = 0;
	private boolean married = false;
	private int travelPasses = 4;
	private int GEDScore = 0;
	private String education = NO_HS_DIPLOMA;
	private int bankBalance = 50;
	private int salary = 0;
	private boolean employed = false;
	private boolean insured = false;
	private boolean hospitalized = false;
	private String prisonRecord = "No Record";
	private boolean scholarship = false;
	
	private int utilBillAmt = 0;
	private int homeBillAmt = 0;
	private int foodBillAmt = 0;
	private int daycareBillAmt = 0;
	private int tuitionBillAmt = 0;
	
	private boolean utilBillActive = false;
	private boolean homeBillActive = false;
	private boolean foodBillActive = false;
	private boolean daycareBillActive = false;
	private boolean tuitionBillActive = false;
	
	private int utilBalance = 0;
	private int homeBalance = 0;
	private int foodBalance = 0;
	private int daycareBalance = 0;
	private int tuitionBalance = 0;
	
	private int semestersCompleted = 0;
	private int gradePoints = 0;
	private String gradePointAverage = "";
	
	private int startRank = 0;
	
	private int totalScore = 0;
	private int totalBills = 0;
	
	private int boardPosition = 0;
	private int numOfAs = 0;
	
	
	
	
	public Player(int id, int householdIncome, int numOfKids, boolean married,
			int travelPasses, String education, int bankBalance, int salary, boolean isEmployed) {
		super();
		//this.setId(id);
		this.householdIncome = householdIncome;
		this.numOfKids = numOfKids;
		this.married = married;
		this.travelPasses = travelPasses;
		this.education = education;
		this.bankBalance = bankBalance;
		this.salary = salary;
		this.employed = isEmployed;
	}


	


	public Player(){
		super();
	}


	public int getHouseholdIncome() {
		return householdIncome;
	}


	public void setHouseholdIncome(int householdIncome) {
		this.householdIncome = householdIncome;
	}


	public int getNumOfKids() {
		return numOfKids;
	}


	public void setNumOfKids(int numOfKids) {
		this.numOfKids = numOfKids;
	}


	public boolean isMarried() {
		return married;
	}


	public void setMarried(boolean married) {
		this.married = married;
	}


	public int getTravelPasses() {
		return travelPasses;
	}


	public void setTravelPasses(int travelPasses) {
		this.travelPasses = travelPasses;
	}


	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
	}


	public int getBankBalance() {
		return bankBalance;
	}


	public void setBankBalance(int bankBalance) {
		this.bankBalance = bankBalance;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public boolean isEmployed() {
		return employed;
	}


	public void setEmployed(boolean employed) {
		this.employed = employed;
	}


	public String getPrisonRecord() {
		return prisonRecord;
	}


	public void setPrisonRecord(String prisonRecord) {
		this.prisonRecord = prisonRecord;
	}


	public boolean isInsured() {
		return insured;
	}


	public void setInsured(boolean insured) {
		this.insured = insured;
	}


	public boolean isHospitalized() {
		return hospitalized;
	}


	public void setHospitalized(boolean hospitalized) {
		this.hospitalized = hospitalized;
	}


	public int getGEDScore() {
		return GEDScore;
	}


	public void setGEDScore(int gEDScore) {
		GEDScore = gEDScore;
	}


	public boolean isScholarship() {
		return scholarship;
	}


	public void setScholarship(boolean scholarship) {
		this.scholarship = scholarship;
	}


	public int getUtilBillAmt() {
		return utilBillAmt;
	}


	public void setUtilBillAmt(int utilBillAmt) {
		this.utilBillAmt = utilBillAmt;
	}


	public int getHomeBillAmt() {
		return homeBillAmt;
	}


	public void setHomeBillAmt(int homeBillAmt) {
		this.homeBillAmt = homeBillAmt;
	}


	public int getFoodBillAmt() {
		return foodBillAmt;
	}


	public void setFoodBillAmt(int foodBillAmt) {
		this.foodBillAmt = foodBillAmt;
	}


	public int getDaycareBillAmt() {
		return daycareBillAmt;
	}


	public void setDaycareBillAmt(int daycareBillAmt) {
		this.daycareBillAmt = daycareBillAmt;
	}


	public int getTuitionBillAmt() {
		return tuitionBillAmt;
	}


	public void setTuitionBillAmt(int tuitionBillAmt) {
		this.tuitionBillAmt = tuitionBillAmt;
	}


	public boolean isUtilBillActive() {
		return utilBillActive;
	}


	public void setUtilBillActive(boolean utilBillActive) {
		this.utilBillActive = utilBillActive;
	}


	public boolean isHomeBillActive() {
		return homeBillActive;
	}


	public void setHomeBillActive(boolean homeBillActive) {
		this.homeBillActive = homeBillActive;
	}


	public boolean isFoodBillActive() {
		return foodBillActive;
	}


	public void setFoodBillActive(boolean foodBillActive) {
		this.foodBillActive = foodBillActive;
	}


	public boolean isDaycareBillActive() {
		return daycareBillActive;
	}


	public void setDaycareBillActive(boolean daycareBillActive) {
		this.daycareBillActive = daycareBillActive;
	}


	public boolean isTuitionBillActive() {
		return tuitionBillActive;
	}


	public void setTuitionBillActive(boolean tuitionBillActive) {
		this.tuitionBillActive = tuitionBillActive;
	}


	public int getUtilBalance() {
		return utilBalance;
	}


	public void setUtilBalance(int utilBalance) {
		this.utilBalance = utilBalance;
	}


	public int getHomeBalance() {
		return homeBalance;
	}


	public void setHomeBalance(int homeBalance) {
		this.homeBalance = homeBalance;
	}


	public int getFoodBalance() {
		return foodBalance;
	}


	public void setFoodBalance(int foodBalance) {
		this.foodBalance = foodBalance;
	}


	public int getDaycareBalance() {
		return daycareBalance;
	}


	public void setDaycareBalance(int daycareBalance) {
		this.daycareBalance = daycareBalance;
	}


	public int getTuitionBalance() {
		return tuitionBalance;
	}


	public void setTuitionBalance(int tuitionBalance) {
		this.tuitionBalance = tuitionBalance;
	}


	public int getSemestersCompleted() {
		return semestersCompleted;
	}


	public void setSemestersCompleted(int semestersCompleted) {
		this.semestersCompleted = semestersCompleted;
	}


	public int getGradePoints() {
		return gradePoints;
	}


	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}
	
	public void setGradePointAverage(String avg){
		this.gradePointAverage = avg;
	}
	
	public String getGradePointAverage(){
		int gpa = 0;
		if(this.semestersCompleted > 0){
			gpa = this.gradePoints / this.semestersCompleted;
		}
		
		String result = "";
		if(this.semestersCompleted < 1){
			result = "none";
		}else if(gpa < 60){
			result = "F";
		}else if(gpa < 70){
			result = "D";
		}else if(gpa < 80){
			result = "C";
		}else if(gpa < 90){
			result = "B";
		}else if(gpa < 60){
			result = "A";
		}
		
		return result;
	}


	public int getStartRank() {
		return startRank;
	}


	public void setStartRank(int startRank) {
		this.startRank = startRank;
	}


	public int getTotalScore() {
		return totalScore;
	}


	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}


	public int getTotalBills() {
		return totalBills;
	}


	public void setTotalBills(int totalBills) {
		this.totalBills = totalBills;
	}
	
	
	
	
	
	
}
