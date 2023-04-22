package com.JavaBrains.UserVehicleAPI.Vehicles;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehicleService 
{
	@Autowired
	private VehicleRepository vehicleRepository;
	
	//To get all the vehicles
	public List<Vehicle> getAllVehicles()
	{
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicleRepository.findAll().forEach(vehicles::add);
		return vehicles;
	}
	
	//To get the vehicle by Id
	public Vehicle getVehicleById(int vehicleId)
	{
		Vehicle ob = vehicleRepository.findByVehicleId(vehicleId);
		return ob;
	}
	
	//To get all vehicles for a user Id
	public List<Vehicle> getVehiclesByUserId(int userId)
	{
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicleRepository.findByUserDetailUserId(userId).forEach(vehicles::add);
		return vehicles;
	}
	
	//To insert a new Vehicle
	public void addVehicle(int userId,Vehicle obj)
	{
		vehicleRepository.save(obj);
	}
	
	//To update a vehicle for a given Vehicle Id
	public void updateVehicleById(int vehicleId, Vehicle obj)
	{
		vehicleRepository.save(obj);
	}
	
	//To delete a vehicle
	public void deleteVehicle(int vehicleId)
	{
		vehicleRepository.deleteById(vehicleId);
	}
}
