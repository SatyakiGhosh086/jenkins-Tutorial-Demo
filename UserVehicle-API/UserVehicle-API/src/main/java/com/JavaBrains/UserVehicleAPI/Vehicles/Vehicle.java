package com.JavaBrains.UserVehicleAPI.Vehicles;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.JavaBrains.UserVehicleAPI.UserDetails.UserDetail;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Vehicle 
{
	@Id
	private int vehicleId;
	private String vehicleName;
	private String registration;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	private UserDetail userDetail;

	public Vehicle(int vehicleId, String vehicleName, String registration, UserDetail userDetail) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.registration = registration;
		this.userDetail = userDetail;
	}

	public Vehicle() {
		super();
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	
	
	
	
}
