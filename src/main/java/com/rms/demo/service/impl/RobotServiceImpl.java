package com.rms.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rms.demo.entity.Robot;
import com.rms.demo.repository.RobotRepository;
import com.rms.demo.service.RobotService;

// Define service class
@Service
public class RobotServiceImpl implements RobotService {

	private RobotRepository robotRepository;

	public RobotServiceImpl(RobotRepository robotRepository) {
		super();
		this.robotRepository = robotRepository;
	}

	@Override
	public List<Robot> getRobotList() {
		// Return a list of students
		return robotRepository.findAll();
	}

	@Override
	public Robot addRobot(Robot robot) {
		return robotRepository.save(robot);
	}

	@Override
	public Robot getRobotById(Long id) {

		return robotRepository.findById(id).get();
	}

	@Override
	public Robot updateRobot(Robot robot) {
		return robotRepository.save(robot);
	}

	@Override
	public void deleteRobot(Long id) {
		robotRepository.deleteById(id);
		
	}

}
