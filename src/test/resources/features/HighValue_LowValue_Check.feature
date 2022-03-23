Feature: 24H High 24H Low Check Scenario

  AUTHOR(S)               : Sefa Melek

  @Chrome
  Scenario: Check 24H High And 24H Low
    Given Go To BTC Turk Website
    When Get 24H High Value And 24H Low Value
    Then 24H High Value Is It Higher Then 24H Low Value

  @Firefox
  Scenario: Check 24H High And 24H Low
    Given Go To BTC Turk Website
    When Get 24H High Value And 24H Low Value
    Then 24H High Value Is It Higher Then 24H Low Value

