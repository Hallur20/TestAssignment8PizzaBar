
import java.util.ArrayList;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(MockitoJUnitRunner.class)
public class OrderTests {

    WebDriver driver;
    Order pepperoniOrder;

    Customer c1, c2;

    Employee e;

    @Mock
    ArrayList<Order> orders;

    @Given("^user navigates to http://localhost:8080/MarioPizzaWeb/index.jsp$")
    public void navigatePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hallur\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("localhost:8080/MarioPizzaWeb/");
        orders = new ArrayList<>();
    }
    @When("user picks the \"pepperoni\" pizza")
    public void pickPizza() {
        driver.findElement(By.id("pepperoni")).click();
        pepperoniOrder = new Order(2, "pepperoni", "cheese, tomato and pepperoni", 62);
        c2 = mock(Customer.class);
        when(c2.makeOrder()).thenReturn(pepperoniOrder);
    }
    @Then("user clicks \"order\"")
    public void makeOrder() {
        driver.findElement(By.id("orderBtn")).click();
        orders.add(c2.makeOrder());
        System.out.println("orders size: " + orders.size());
    }
    @Then("employee deletes order from user")
    public void deleteOrder() {
        e = mock(Employee.class);
        driver.findElement(By.id("deleteOrderBtn")).click();
        Mockito.doAnswer((customer) -> {
            if (customer.getArgument(0).equals(c2)) { //if customer wants to remove order from c2, remove it from list...
                System.out.println("removing pepperoni order...");
                orders.remove(pepperoniOrder);
            }
            return null;
        }).when(e).deleteOrder(anyObject());
        Assert.assertThat(orders.size(), CoreMatchers.equalTo(1));
        e.deleteOrder(c2);
        Assert.assertThat(orders.size(), CoreMatchers.equalTo(0));
        
    }
}
