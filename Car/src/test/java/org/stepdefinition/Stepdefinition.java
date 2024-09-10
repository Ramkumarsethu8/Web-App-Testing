package org.stepdefinition;

import java.util.List;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.pom.Pom;

import io.cucumber.java.en.*;

public class Stepdefinition extends LibGlobal {
	@Given("User is on hyndai book a car page")
	public void userIsOnHyndaiBookACarPage() {

		launchbrowser("chrome");
		maximizewindow();
		implicitWait(20);
		getUrl("https://clicktobuy.hyundai.co.in/#/bookACar?modelCode=0Y");

	}

	@When("User Select Model {string} and Select Fuel type {string} and Variant {string} and Exterior Colour {string} and Interior Colour {string}")
	public void userSelectModelAndSelectFuelTypeAndVariantAndExteriorColourAndInteriorColour(String model,
			String fuelType, String Variant, String exteriorColour, String interiorColour) {

		Pom p = new Pom();

		selectOptionByText(p.getModel(), " New Verna ");
		selectOptionByText(p.getFuelType(), " Petrol");
		selectOptionByText(p.getVariant(), " VERNA 1.5 MPi MT EX ");
		selectOptionByText(p.getExteriorColor(), " Abyss Black Pearl ");
		selectOptionByText(p.getInteriorColor(), " CREAM BEIGE ");

	}

	@When("User Select Dealer State")
	public void userSelectDealerState() {

		Pom p = new Pom();

		List<WebElement> dealerState = getOptions(p.getDealerState());
		for (int k = 0; k < dealerState.size(); k++) {

			String dealerStateText = dealerState.get(k).getText();
			selectOptionByText(p.getDealerState(), dealerStateText);
			List<WebElement> dealerCity = getOptions(p.getDealerCity());
			for (int i = 0; i < dealerCity.size(); i++) {
				String text = dealerCity.get(i).getText();
				selectOptionByText(p.getDealerCity(), text);

				List<WebElement> dealerName = getOptions(p.getDealerName());
				for (int j = 0; j < dealerName.size(); j++) {

					String dealerNameText = dealerName.get(j).getText();
					if (!dealerNameText.equals("Dealer Name")) {
						System.out.println(dealerNameText);
						selectOptionByText(p.getDealerName(), dealerNameText);

						System.out.println(getText(p.getPrintDealerName()));
					}

				}
			}

		}

	}

}
