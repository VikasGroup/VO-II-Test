package com.steps;

import com.titanium.core.DefaultDriver;
import com.titanium.core.DriverLuncher;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CommonSteps extends BasicTest {

	@Before
	public void before() {
		driver = new DefaultDriver(DriverLuncher.luncher());
	}

	@After
	public void after() {
		driver.close();
	}

}
