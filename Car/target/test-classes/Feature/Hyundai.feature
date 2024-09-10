Feature: Verify Hyundai Book a Car page

  Scenario: Validate book a car with different state and cities
    Given User is on hyundai book a car page
    When User Select Model " New Verna " and Select Fuel type " Petrol" and Variant " VERNA 1.5 MPi MT EX " and Exterior Colour " Abyss Black Pearl " and Interior Colour " CREAM BEIGE "
    And User Select Dealer State
