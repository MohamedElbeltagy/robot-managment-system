package com.rms.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rms.demo.entity.Robot;

public interface RobotRepository extends JpaRepository<Robot, Long>{

}
