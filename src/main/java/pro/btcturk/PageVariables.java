package pro.btcturk;

import org.openqa.selenium.By;

public class PageVariables {
    public static final String BTCTURK_URL = "https://pro.btcturk.com/basit/al-sat/BTC_TRY";

    public static final By HIGH_VALUE = By.id("ex-advanced-ticker-high");
    public static final By LOW_VALUE = By.id("ex-advanced-ticker-low");
    public static final By CLICK_CHANGE_CURRENCY= By.id("ex-basic-ticker-current");
    public static final By SEARCH_PAIR= By.xpath("//input[contains(@placeholder,'Arama')]");
    public static final By FIRST_VALUE= By.xpath("//perfect-scrollbar[@class='menu-list ng-star-inserted']//div//ul//li[1]");
}
