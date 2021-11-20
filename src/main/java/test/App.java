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
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]//span[text()='Проекты']")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/ul/li[4]/a/span")).click();
        driver.findElement(By.xpath("//div[@class=\"pull-left btn-group icons-holder\"]/a")).click();
        driver.findElement(By.xpath("//input[@name=\"crm_project[name]\"]")).sendKeys("Наименование");
        driver.findElement(By.xpath("//a[@class=\"select2-choice select2-default\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[2]/div")).click();
        driver.findElement(By.xpath("//div[@class=\"responsive-cell crm-block responsive-cell-no-blocks\"]//div[@class=\"select2-container select2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[1]/div")).click();
        driver.findElement(By.xpath("//fieldset[@class=\"form-horizontal\"]/div[2]/div[5]/div[2]/div")).click();
        driver.findElement(By.xpath("//fieldset[@class=\"form-horizontal\"]/div[2]/div[5]/div[2]/div/select/option[2]")).click(); //выбор подразделения
        driver.findElement(By.xpath("//fieldset[@class=\"form-horizontal\"]/div[2]/div[6]/div[2]/div")).click();
        driver.findElement(By.xpath("//fieldset[@class=\"form-horizontal\"]/div[2]/div[6]//select/option[4]")).click(); // выбор куратора
        driver.findElement(By.xpath("//fieldset[@class=\"form-horizontal\"]/div[2]/div[7]/div[2]/div")).click();
        driver.findElement(By.xpath("//fieldset[@class=\"form-horizontal\"]/div[2]/div[7]/div[2]/div/select/option[3]")).click(); //выбор руководителя
        driver.findElement(By.xpath("//fieldset[@class=\"form-horizontal\"]/div[2]/div[8]/div[2]/div")).click();
        driver.findElement(By.xpath("//fieldset[@class=\"form-horizontal\"]/div[2]/div[8]/div[2]/div/select/option[3]")).click(); //выбор администратора
        driver.findElement(By.xpath("//fieldset[@class=\"form-horizontal\"]/div[2]/div[9]/div[2]/div")).click();
        driver.findElement(By.xpath("//fieldset[@class=\"form-horizontal\"]/div[2]/div[9]/div[2]/div/select/option[3]")).click(); // выбор менеджера
        driver.findElement(By.xpath("//div[@class=\"pull-right\"]/div/div[4]")).click();  // нажимаю Сохранить и выйти
       // driver.quit();

    }
}
