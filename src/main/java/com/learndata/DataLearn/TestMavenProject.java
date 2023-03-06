package com.learndata.DataLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMavenProject {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\PROJECT\\DataLearn\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
		
	}

}
