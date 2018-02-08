package com.fdmgroup.robotest;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.robot.RobotApplePicker;

public class RobotApplePickerTest {

	private RobotApplePicker princess;

	@Before
	public void setUp() throws Exception {
		princess = new RobotApplePicker();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void doesRobotApplePickerHave0Apples_WhenWeDontSetApplesTest() {
		assertTrue(princess.getNumApplesPicked()==0);
	}

	@Test
	public void doesRobotApplePickerReturn1Apple_WhenWePickOneAppleTest() {
		princess.PickApples(1);
		assertTrue(princess.getNumApplesPicked()==1);
	}
	
	@Test
	public void doesRobotApplePickerHave100Apples_WhenWeSetItToHave100ApplesTest() {
		princess.setNumPickApples(100);
		assertTrue(princess.getNumApplesPicked()==100);
	}



}
