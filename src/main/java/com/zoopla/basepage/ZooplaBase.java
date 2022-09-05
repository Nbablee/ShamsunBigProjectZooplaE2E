package com.zoopla.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZooplaBase {
	public ZooplaBase() {
		
	try {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/config/Config.properties");
		prop.load(ip);

	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}}

	
	
	
	
public static WebDriver driver;
public static void initialization() {
	//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
}
}
