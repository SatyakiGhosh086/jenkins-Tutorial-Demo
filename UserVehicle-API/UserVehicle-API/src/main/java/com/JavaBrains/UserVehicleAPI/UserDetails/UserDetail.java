package com.JavaBrains.UserVehicleAPI.UserDetails;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.JavaBrains.UserVehicleAPI.Vehicles.Vehicle;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class UserDetail 
{
	@Id
	private int userId;
	private String userName;

	@JsonFormat(shape = Shape.STRING , pattern="dd-mm-yyyy")
	private Date userDOB;
	@OneToMany(mappedBy = "userDetail",fetch = FetchType.EAGER)
	@JsonManagedReference
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getUserDOB() {
		return userDOB;
	}
	public void setUserDOB(Date userDOB) {
		this.userDOB = userDOB;
	}
	
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	public UserDetail() {
		super();
	}
	public UserDetail(int userId, String userName, Date userDOB) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userDOB = userDOB;
	}
	
		
}
