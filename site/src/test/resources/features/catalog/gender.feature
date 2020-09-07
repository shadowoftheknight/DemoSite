Feature: Gender

  Scenario: Customer search for merchandise by gender keyword(s)
    Given I have logged in
    When I search for female merchandise
    Then I should be shown the following merchandise:
      | Product                             | Manufacturer    | Description   |
      | Hawt Like a Habanero Shirt (Women's)| The Heat Clinic | Yes           |
      | Heat Clinic Hand-Drawn (Women's)    | The Heat Clinic | Yes           |
      | Heat Clinic Mascot (Women's)        | The Heat Clinic | No            |