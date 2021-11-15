package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver wd;

	@FindBy(id="radiobutton_0")
	private WebElement select;
	
	@FindBy(id="continue")
	private WebElement con;

	public Select_Hotel(WebDriver wd2) {
		this.wd = wd2;
		PageFactory.initElements(wd, this);
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getCon() {
		return con;
	}
}