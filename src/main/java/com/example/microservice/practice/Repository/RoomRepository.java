package com.example.microservice.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.microservice.practice.Bean.HotelRoom;

public interface RoomRepository extends JpaRepository<HotelRoom,String> {

}
