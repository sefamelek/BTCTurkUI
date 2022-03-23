Feature: BTC-TRY Change to USD-TRY And 24H High 24H Low Check Scenario

  @Chrome
  Scenario: BTC-TRY Change To USDT_TRY And Check 24H High And 24H Low
    Given Go To BTC Turk Website
    And Change BTC_TRY To "USDTTRY"
    When Get 24H High Value And 24H Low Value
    Then 24H High Value Is It Higher Then 24H Low Value
    
  @Firefox
  Scenario: BTC-TRY Change To USDT_TRY And Check 24H High And 24H Low
    Given Go To BTC Turk Website
    And Change BTC_TRY To "USDTTRY"
    When Get 24H High Value And 24H Low Value
    Then 24H High Value Is It Higher Then 24H Low Value

