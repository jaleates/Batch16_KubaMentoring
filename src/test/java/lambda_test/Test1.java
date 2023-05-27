package lambda_test;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {
@Test
public void submitform(){
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.lambdatest.com/selenium-playground");
    WebElement submitform=driver.findElement(By.xpath("//a[.='Input Form Submit']"));
    submitform.click();
    WebElement name= driver.findElement(By.cssSelector("#name"));
    name.sendKeys("Jale");
    WebElement email= driver.findElement(By.cssSelector("#inputEmail4"));
    email.sendKeys("atesjale2015@gmail.com");
    WebElement password=driver.findElement(By.cssSelector("#inputPassword4"));
    password.sendKeys("jale12345");
    WebElement company=driver.findElement(By.cssSelector("#company"));
    company.sendKeys("CodeFish");
    WebElement website=driver.findElement(By.cssSelector("#websitename"));
    website.sendKeys("codefish");
    WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
    country.sendKeys("United States");
    WebElement city=driver.findElement(By.cssSelector("#inputCity"));
    city.sendKeys("st.louis");
    WebElement address=driver.findElement(By.cssSelector("#inputAddress1"));
    address.sendKeys("87645 rtyueov");
    WebElement address1=driver.findElement(By.cssSelector("#inputAddress2"));
    address1.sendKeys("6543 gsfstyk");
    WebElement state=driver.findElement(By.cssSelector("#inputState"));
    state.sendKeys("MO");
    WebElement zipcode=driver.findElement(By.cssSelector("#inputZip"));
    zipcode.sendKeys("12345");
    WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
    button.click();
    WebElement massage=driver.findElement(By.xpath("//p[@style='display: block;']"));
    Assert.assertEquals(massage.getText(),"Thanks for contacting us, we will get back to you shortly.");
    System.out.println("this one for github");

}

}