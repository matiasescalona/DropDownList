package com.webElement.packg;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DropDownListTest {

	private WebDriver driver;
	DropDownList ddlPage;
	
	@Before
	public void setUp() throws Exception 
	{
		ddlPage=new DropDownList(driver);
		driver=ddlPage.chromeDriverConnection();
		driver.manage().window().maximize();
		
		
	}

	@After
	public void tearDown() throws Exception 
	{
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		//Página que se va visitar
		ddlPage.visit("https://www.upf.edu/hipertextnet/numero-1/menu-select.html");
		assertEquals(ddlPage.selectDropDownList(),"Universitat Pompeu Fabra ");
	}

}
