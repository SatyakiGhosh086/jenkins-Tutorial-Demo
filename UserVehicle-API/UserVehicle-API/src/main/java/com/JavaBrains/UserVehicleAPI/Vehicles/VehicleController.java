package com.JavaBrains.UserVehicleAPI.Vehicles;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.JavaBrains.UserVehicleAPI.UserDetails.UserDetail;


@RestController
public class VehicleController 
{
	@Autowired
	private VehicleService vehicleService;
	
	@RequestMapping("/vehicles")
	public List<Vehicle> getAllEmployees()
	{
		return vehicleService.getAllVehicles();
	}
	
	@RequestMapping("/user/{userId}/vehicles")
	public List<Vehicle> getVehiclesByUserId(@PathVariable int userId)
	{
		return vehicleService.getVehiclesByUserId(userId);
	}
	
	@RequestMapping("/user/{userId}/vehicle/{vehicleId}")
	public Vehicle getVehicleById(@PathVariable int vehicleId)
	{
		return vehicleService.getVehicleById(vehicleId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/user/{userId}/vehicle")
	public void addVehicle(@PathVariable int userId,@RequestBody Vehicle ob)
	{
		ob.setUserDetail(new UserDetail(userId,"",null));
		vehicleService.addVehicle(userId, ob);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/user/{userId}/vehicle/{vehicleId}")
	public void updateVehicleById(@PathVariable int userId,@PathVariable int vehicleId,@RequestBody Vehicle ob)
	{
		ob.setUserDetail(new UserDetail(userId,"",null));
		vehicleService.updateVehicleById(vehicleId, ob);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/user/{userId}/vegicle/{vehicleId}")
	public void deleteVehicle(int vehicleId)
	{
		vehicleService.deleteVehicle(vehicleId);
	}
}
