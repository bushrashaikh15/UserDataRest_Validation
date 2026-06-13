package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.models.User;
import com.example.demo.models.UserProjection;

@RepositoryRestResource(excerptProjection = UserProjection.class)
//projections works only on findAll()
//http://localhost:8080/users

//to fetch the single record with projection
//http://localhost:8080/uers/2?projection=userProjection
public interface UserRepository extends JpaRepository<User,Integer> {
	
	
	// http://localhost:8080/users/search/findByEmail?email=bushra@gmail.com
	@RestResource(path="byemail")
	// http://localhost:8080/users/search/byemail?email=bushra@gmail.com
	public Optional<User> findByEmail(String email);
	
	
	// http://localhost:8080/users/search/findByMobile?mobile=8828163513
	public Optional<User> findByMobile(String mobile);
	
	
	// http://localhost:8080/users/search/findByEmailAndPassword?email=sarah@gmail.com&password=sarah@123
	public Optional<User> findByEmailAndPassword(String email, String password);
	
	// http://localhost:8080/users/search/findAllByUsernameContaining?username=h
	public List<User> findAllByUsernameContaining(String username);
	
	// http://localhost:8080/users/search/findAllByIdLessThan?id=3
	public List<User> findAllByIdLessThan(int id);
	
	// http://localhost:8080/users/search/findAllByIdBetween?id1=2&id2=3
	public List<User> findAllByIdBetween(int id1, int id2);

}
