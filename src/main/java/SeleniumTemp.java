
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hallur
 */
public class SeleniumTemp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hallur\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/MarioPizzaWeb/index.jsp");
        
        driver.findElement(By.id("pepperoni")).click();
      
     
    }
}
