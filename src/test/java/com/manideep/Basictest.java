package com.manideep;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Basictest {
	    @Test
	    public void openGoogle() {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        System.out.println("Google Opened Successfully!");
	        driver.quit();
	    }
	}


