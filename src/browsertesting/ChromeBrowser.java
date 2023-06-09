package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args){
        //Opening Browser version
        String baseUrl ="https://opensource-demo.orangehrmlive.com";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current url
        driver.getCurrentUrl();
        System.out.println("Current URL:" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page Source:"+ driver.getPageSource());

        //Give implicit wait to driver before find the email field element
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.name("username")).sendKeys("Admin");

        //Find the password field element
        driver.findElement(By.name("password")).sendKeys("admin123");

        //Close the Browser
        driver.close();
    }


}

