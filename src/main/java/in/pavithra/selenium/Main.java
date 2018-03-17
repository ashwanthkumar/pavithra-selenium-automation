package in.pavithra.selenium;

import in.pavithra.selenium.utils.Utils;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver",
                "webdriver/chromedriver_" + Utils.webdriverSuffix());

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://github.com");
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
