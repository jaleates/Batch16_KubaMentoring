package lambda_test;

import Utils.BrowersUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.TreeMap;

public class Test3 {
    @Test
    public void tablepagionnameandphone(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions Options=new ChromeOptions();
        Options.addArguments("--remote-allow-origin=*");
        WebDriver driver=new ChromeDriver(Options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.lambdatest.com/selenium-playground");
        WebElement tablepagion= driver.findElement(By.linkText("Table Pagination"));
        tablepagion.click();
        WebElement box= driver.findElement(By.xpath("//select[@class='form-control']"));
        BrowersUtils.selectBy(box,"5000","value");
        List<WebElement> allNAmes=driver.findElements(By.xpath("//tr//td[2]"));
        List<WebElement> allPhone=driver.findElements(By.xpath("//tr//td[4]"));
        TreeMap<String,Long> map=new TreeMap<>();
        for(int i=0;i<allNAmes.size();i++){
            map.put(BrowersUtils.getText(allNAmes.get(i)),Long.valueOf(BrowersUtils.getText(allPhone.get(i)).replace("-","")));

        }
        System.out.println("map = "+ map);
    }
    }

