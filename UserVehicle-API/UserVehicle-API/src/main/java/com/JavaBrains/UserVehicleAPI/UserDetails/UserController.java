package com.JavaBrains.UserVehicleAPI.UserDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{
	@Autowired
	private UserService userService;
	
		//To get all the user details
		@RequestMapping("/users")
		public List<UserDetail> getAllUserDetails()
		{
			return userService.getAllUserDetails();
		}
		
		//To get the user by Id
		@RequestMapping("/user/{userId}")
		public UserDetail getUserById(@PathVariable int userId)
		{
			return userService.getUserById(userId);
		}
		
		//To insert a new User
		@RequestMapping(method = RequestMethod.POST, value = "/user")
		public void addUserDetails(@RequestBody UserDetail obj)
		{
			userService.addUserDetails(obj);
		}
		
		//To update a User Details for a given Id
		@RequestMapping(method = RequestMethod.PUT, value = "/user/{userId}")
		public void updateUserById(@PathVariable int userId, @RequestBody UserDetail obj)
		{
			userService.updateUserById(userId,obj);
		}
		
		//To delete a User detail
		@RequestMapping(method = RequestMethod.DELETE, value = "/user/{userId}")
		public void deleteUserDetail(@PathVariable int userId)
		{
			userService.deleteUserDetail(userId);
		}
}
