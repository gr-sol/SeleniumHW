package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty(
            "webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        /*ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments();*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://crm.geekbrains.space/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]//li[@class=\"dropdown first\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/ul/li[4]/a/span")).click(); //  перешел в контактные лица
        driver.findElement(By.xpath("//div[@class=\"pull-left btn-group icons-holder\"]/a")).click(); // нажал создать контакт
        driver.findElement(By.xpath("//fieldset[@class=\"form-horizontal\"]/div/div[1]//input[@name=\"crm_contact[lastName]\"]")).sendKeys("Иванов");
        driver.findElement(By.xpath("//fieldset[@class=\"form-horizontal\"]/div/div[2]/div[2]/input[@name=\"crm_contact[firstName]\"]")).sendKeys("Иван");
        driver.findElement(By.xpath("//div[@class=\"company-container\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[2]/div")).click();
        driver.findElement(By.xpath("//div[@class=\"responsive-cell responsive-cell-no-blocks\"]//input[@name=\"crm_contact[jobTitle]\"]")).sendKeys("Охранник");
        driver.findElement(By.xpath("//div[@class=\"navigation clearfix navbar-extra navbar-extra-right\"]/div/div[2]/div/div[4]/button")).click();



    }
}
