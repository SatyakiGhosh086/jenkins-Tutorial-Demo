package com.JavaBrains.UserVehicleAPI.UserDetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService 
{
	@Autowired
	private UserDetailRepository userRepository;
	
	//To get all the user details
	public List<UserDetail> getAllUserDetails()
	{
		List<UserDetail> userDetails = new ArrayList<UserDetail>();
		userRepository.findAll().forEach(userDetails::add);
		return userDetails;
	}
	
	//To get the user by Id
	public UserDetail getUserById(int userId)
	{
		UserDetail ob = userRepository.findByUserId(userId);
		return ob;
	}
	
	//To insert a new User
	public void addUserDetails(UserDetail obj)
	{
		userRepository.save(obj);
	}
	
	//To update a User Details for a given Id
	public void updateUserById(int userId, UserDetail obj)
	{
		userRepository.save(obj);
	}
	
	//To delete a User detail
	public void deleteUserDetail(int userId)
	{
		userRepository.deleteById(userId);
	}
}
