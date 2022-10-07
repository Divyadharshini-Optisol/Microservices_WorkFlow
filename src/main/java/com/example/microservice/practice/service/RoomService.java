package com.example.microservice.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.microservice.practice.Bean.HotelRoom;
import com.example.microservice.practice.Repository.RoomRepository;

@Component
public class RoomService {
	
	@Autowired
	private RoomRepository roomrepo;

	
	public List<HotelRoom> allRooms() 
	{
		List<HotelRoom>roomList=roomrepo.findAll();
		return roomList;
	}
	
}
