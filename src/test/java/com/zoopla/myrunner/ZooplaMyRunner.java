package com.zoopla.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	plugin = {"pretty","json:target/cucumber.json"},
	features = { "./Features"},
	glue = {"com.zoopla.stepdefinition"	},
	dryRun = false,
	monochrome = true,
	tags = "@Sanity")
	
public class ZooplaMyRunner extends AbstractTestNGCucumberTests {

}
