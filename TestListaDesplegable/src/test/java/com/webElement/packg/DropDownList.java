package com.webElement.packg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.project.pom.Base;

public class DropDownList extends Base {

	//Localizadores
	By dropDownList=By.name("adreces");
	
	public DropDownList(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String selectDropDownList() throws InterruptedException
	{
		Select selectList =new Select (findElement(dropDownList));
		Thread.sleep(5000);
		selectList.selectByVisibleText("Universitat Pompeu Fabra ");
		return getText(selectList.getFirstSelectedOption());
	}

}
