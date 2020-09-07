Feature: Gender Filter

  Scenario: Customer filter for merchandise by gender keyword(s)
    Given I have access in
    When I filter for female merchandise
    Then I should see the following merchandise:
      | Product                             | Manufacturer    | Description   |
      | Hawt Like a Habanero Shirt (Women's)| The Heat Clinic | Yes           |
      | Heat Clinic Hand-Drawn (Women's)    | The Heat Clinic | Yes           |
      | Heat Clinic Mascot (Women's)        | The Heat Clinic | No            |