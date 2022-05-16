package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) {

 // ...Exercise1...
// Create a new class under Q1 create main method
// Set Path
// Create chrome driver
// Maximize the window
// Open google home page https://www.google.com/.
// On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
// Navigate forward to amazon
// Refresh the page
// Close/Quit the browser
// And last step : print "all ok" on console

        // Set Path
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        // Create chrome driver
        WebDriver driver = new ChromeDriver();
        // Maximize the window
        driver.manage().window().maximize();

        // Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");

        driver.navigate().to("https://www.amazon.com/");

        // On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
        driver.navigate().back();

        // Navigate forward to amazon
        driver.navigate().forward();

        // Refresh the page
        driver.navigate().refresh();

        driver.close();

        System.out.println("all ok");

    }
}
