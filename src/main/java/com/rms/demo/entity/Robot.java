package com.rms.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "robots")
public class Robot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "robot_name", nullable = false)
	private String robotName;

	@Column(name = "robot_location")
	private String robotLocation;

	public Robot() {

	}

	public Robot(String robotName, String robotLocation) {
		super();
		this.robotName = robotName;
		this.robotLocation = robotLocation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRobotName() {
		return robotName;
	}

	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}

	public String getRobotLocation() {
		return robotLocation;
	}

	public void setRobotLocation(String robotLocation) {
		this.robotLocation = robotLocation;
	}

}
