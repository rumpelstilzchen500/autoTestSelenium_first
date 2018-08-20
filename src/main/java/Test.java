import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = getInitFirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://www.bing.com");
        WebElement field = driver.findElement(By.id("sb_form_q"));
        field.sendKeys("selenium");

        WebElement button = driver.findElement(By.name("go"));
        button.click();

        List <WebElement> list = driver.findElements(By.className("b_algo"));
        System.out.println(list.size());

        List <WebElement> elements = driver.findElements(By.tagName("li"));
        System.out.println(elements.size());

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();

    }

    public static WebDriver getInitFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver",Test.class.getResource("geckodriver.exe").getPath());
        return new FirefoxDriver();
    }
}
