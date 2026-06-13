package com.example.demo.models;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = {User.class})
public interface UserProjection {
	
 public int getId();
 public String getUsername();
 public String getMobile();
 public String getEmail();

}