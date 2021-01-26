import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HelloWorld {
    public static void main (String [] args){
        String xpathforinput= "//input[@type='text']";
        String xpathforclick= "//a[@class='searchButton]";


        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://darksky.net/");
        driver.findElement(By.xpath(xpathforinput)).clear();
        driver.findElement(By.xpath(xpathforinput)).sendKeys("new york");
        driver.findElement(By.xpath(xpathforclick)).click();

        //comment 

    }
}
