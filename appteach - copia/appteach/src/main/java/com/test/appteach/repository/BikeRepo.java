package com.test.appteach.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.appteach.model.Bike;

@Repository
public interface BikeRepo extends JpaRepository <Bike, Integer>
{

}
