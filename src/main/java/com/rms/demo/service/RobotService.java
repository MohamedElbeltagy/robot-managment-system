package com.rms.demo.service;
import java.util.List;

import com.rms.demo.entity.Robot;

// Methods' prototypes connection
public interface RobotService {
	
	// Return a list of robots
	List<Robot> getRobotList();
	Robot addRobot(Robot robot);
	Robot getRobotById(Long id);
	Robot updateRobot(Robot robot);
	void deleteRobot(Long id);
}
