package org.pom;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends LibGlobal{
	
	public Pom() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//select[@id='inputmodel-01']")
	private WebElement model;
	@FindBy(xpath="//select[@id='inputfuel-01']")
	private WebElement fuelType;
	@FindBy(xpath="//select[@id='inputvrnt-01']")
	private WebElement variant;
	@FindBy(xpath="//select[@id='inputext-01']")
	private WebElement exteriorColor;
	@FindBy(xpath="//select[@id='inputinter-01']")
	private WebElement interiorColor;
	@FindBy(xpath="//select[@id='state-01']")
	private WebElement dealerState;
	@FindBy(xpath="//select[@id='dealer-city-01']")
	private WebElement dealerCity;
	@FindBy(xpath="//select[@id='bookacardelar']")
	private WebElement dealerName;
	@FindBy(xpath="//div[@class='tit ico-bullet']")
	private WebElement printDealerName;
	public WebElement getModel() {
		return model;
	}
	public WebElement getFuelType() {
		return fuelType;
	}
	public WebElement getVariant() {
		return variant;
	}
	public WebElement getExteriorColor() {
		return exteriorColor;
	}
	public WebElement getInteriorColor() {
		return interiorColor;
	}
	public WebElement getDealerState() {
		return dealerState;
	}
	public WebElement getDealerCity() {
		return dealerCity;
	}
	public WebElement getDealerName() {
		return dealerName;
	}
	public WebElement getPrintDealerName() {
		return printDealerName;
	}

}
