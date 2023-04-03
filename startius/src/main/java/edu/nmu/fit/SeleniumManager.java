package edu.nmu.fit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.validation.SchemaFactory;
import java.awt.*;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.jar.JarException;
import java.util.logging.Handler;

public class SeleniumManager {
    String getName(WebElement webElement) {
        webElement.findElements(By.tagName("a"));
        return "";
    }

    int getPrice(WebElement webElement) {
        return 0;
    }

    List<WebElement> getHairDryers() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        WebElement webElement = driver.findElement(By.xpath("//ul[@class='catalog-grid ng-star-inserted']"));
        List<WebElement> webElementList = webElement.findElements(By.tagName("li"));
        return webElementList;
    }
}







// https://bt.rozetka.com.ua/ua/hairdryers/c81227/regim=s-ionizatsiey;sort=cheap/