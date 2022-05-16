Feature: Search the testim.io page the information required about your dream journey to space


  Scenario Outline: Search the testim.io page the information your next destination Tayabamba
    Given I visit the test page
    When I search in the application for a value with this information of traveler
      | ID   | departing   | returning   | adults   | children   | expectedResult   |
      | <ID> | <departing> | <returning> | <adults> | <children> | <expectedResult> |
    Then I verify the information required for the successful case

    Examples:
      | ID | departing   | returning   | adults | children | expectedResult |
      | 1  | 16 May 2022 | 20 May 2022 | 2      | 1        | Babahoyo      |

  Scenario Outline: Search the testim.io page the information your next destination Jupiter
    Given I visit the test page
    When I search in the application for a value with this information of traveler
      | ID   | departing   | returning   | adults   | children   | expectedResult   |
      | <ID> | <departing> | <returning> | <adults> | <children> | <expectedResult> |
    Then I verify the information required for the alternate case

    Examples:
      | ID | departing   | returning   | adults | children | expectedResult |
      | 2  | 22 May 2022 | 25 May 2022 | 2      | 4        | Jupiter        |