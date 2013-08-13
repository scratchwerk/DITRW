package com.ditrw.game.users;


public class BaseUser {
	
	private int id;
	private String username;
	private String password;
	
	private int organizationID;
	//private Role role;
	
private String gender;
	
	private String firstName = "";
	private String lastName = "";
	private int grade;
	private String organization = "";
	private String school = "";

	public BaseUser(){
		this.id = 53;
		this.gender = "male";
		this.firstName = "Ronnie";
		this.lastName="King";
		this.grade = 12;
		this.organization = "Mentoring Families and Kids";
		this.school = "Twin Lakes High";
		
	}

	public BaseUser(int id, String gender, String firstName, String lastName,
			int grade, String organization, String school) {
		super();
		this.id = id;
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.organization = organization;
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getOrganizationID() {
		return organizationID;
	}
	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
	}

	
	
	
	
}
