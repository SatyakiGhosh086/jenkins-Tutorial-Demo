package com.JavaBrains.UserVehicleAPI.UserDetails;

import org.springframework.data.repository.CrudRepository;

public interface UserDetailRepository extends CrudRepository<UserDetail,Integer>
{
	public UserDetail findByUserId(int userId);
}
