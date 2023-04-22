package com.JavaBrains.UserVehicleAPI.Vehicles;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle,Integer>
{
	public List<Vehicle> findByUserDetailUserId(int userId);
	public Vehicle findByVehicleId(int vehicle);
}
