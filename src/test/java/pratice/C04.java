package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {

    public static void main(String[] args) throws InterruptedException {

        // ...Exercise4...
// Navigate to  https://testpages.herokuapp.com/styled/index.html
// Click on  Calculate under Micro Apps
//    Type any number in the first input
//    Type any number in the second input
// Click on Calculate
// Get the result
// Print the result

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get(" https://testpages.herokuapp.com/styled/index.html");

        // Click on  Calculate under Micro Apps
        driver.findElement(By.id("calculatetest")).click();

        //    Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("20");
        Thread.sleep(700);

        //    Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("30");
        Thread.sleep(700);

        // Click on Calculate
        driver.findElement(By.id("calculate")).click();
        Thread.sleep(700);

        // Print the result
        System.out.println(driver.findElement(By.id("answer")).getText());

        driver.close();

 }
}
