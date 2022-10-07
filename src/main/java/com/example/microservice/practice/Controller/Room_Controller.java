package com.example.microservice.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.practice.Bean.HotelRoom;
import com.example.microservice.practice.Repository.RoomRepository;
import com.example.microservice.practice.service.RoomService;

@RestController
public class Room_Controller {
	
	@Autowired
	private RoomRepository roomrepo;
	
	@Autowired
	private RoomService roomService;
	
	@GetMapping("/roomDetails")
	public List<HotelRoom> list()
    {
		return roomService.allRooms();
	}
}
