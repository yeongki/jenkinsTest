package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SeleniumTest {

	@LocalServerPort
    private int port;
        
    private WebDriver driver;
    
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver.exe"); // 다운받은 ChromeDriver 위치를 넣어줍니다.
        driver = new ChromeDriver(); // Driver 생성
    }
    
    @After
    public void tearDown(){
        driver.quit();  // Driver 종료
    }
      
    @Test
    public void testToDoController() {
        String url = "http://localhost:" + port + "/todo/add";
        String resultUrl = "http://localhost:" + port + "/todo/5";
        
        driver.get(url);
        WebElement id = driver.findElement(By.id("id"));
        WebElement summary = driver.findElement(By.id("summary"));
        WebElement button = driver.findElement(By.id("add-button"));
        
        id.sendKeys("5");
        summary.sendKeys("12345");
        assertThat(summary.getAttribute("value")).isEqualTo("12345");
        button.click();
        //driver.findElement(By.xpath("//button[@id='add-button']")).click();
        
        new WebDriverWait(driver, 5000);
//        
       // WebElement resultId = driver.findElement(By.id("result-id"));
        
        //WebElement resultSummary = driver.findElement(By.id("result-summary"));
        WebElement resultSummary = driver.findElement(By.id("result-summary"));
        String testStr = resultSummary.getAttribute("innerHTML");
        
        //assertThat(resultId.getText()).isEqualTo("5");
       assertThat(resultSummary.getAttribute("value")).isEqualTo("12345");
//        
      /*  driver.get(resultUrl);
        
        WebElement summary2 = driver.findElement(By.id("summary"));
        
        assertThat(summary2.getText()).isEqualTo("12345");*/
    }

}
