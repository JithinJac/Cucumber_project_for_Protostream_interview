package protostreamPackage.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;
    @Given("^I am on the \"([^\"]*)\"$")
    public void i_am_on_the(String url)  {
     WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
     driver.get(url);

    }

    @When("^I click on Login option$")
    public void i_click_on_Login_option() {
        driver.findElement(By.xpath("/html/body/div/div/a")).click();
     driver.findElement(By.xpath("//*[@id=\"navbar-content\"]/div/div/div/div[1]/button")).click();
     driver.manage().window().maximize();
    }

    @When("^I enter valid user name as \"([^\"]*)\"$")
    public void i_enter_valid_user_name_as(String username){
driver.findElement(By.xpath("/html/body/app-root/app-login-access/div/div/div/div/div[2]/form/div[1]/input")).sendKeys(username);
    }

    @When("^I enter valid password as \"([^\"]*)\"$")
    public void i_enter_valid_password_as(String password) {
driver.findElement(By.xpath("/html/body/app-root/app-login-access/div/div/div/div/div[2]/form/div[2]/input")).sendKeys(password);
    }

    @When("^I click on Login button$")
    public void i_click_on_Login_button(){
driver.findElement(By.xpath("/html/body/app-root/app-login-access/div/div/div/div/div[2]/form/button")).click();
    }

    @Then("^I should be navigated to the corridordigital Dashboard page successfully$")
    public void i_should_be_navigated_to_the_corridordigital_Dashboard_page_successfully()  {
String actualTitle=driver.findElement(By.xpath("/html/body/app-root/app-menu/nav/div/ul/li[1]/a")).getText();
String expectedTitle="HOME";
        Assert.assertEquals(actualTitle, expectedTitle);
        //driver.quit();

    }



}
