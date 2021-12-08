package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFaceBook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rinal\\IdeaProjects\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        Thread.sleep(3000);

        String title = driver.getTitle();
        System.out.println("title");
        Thread.sleep(3000);

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("E-mail")).sendKeys("testerrinpatel.gmail.com");
        Thread.sleep(3000);

        driver.findElement(By.id("Password")).sendKeys("Dasnadas2020");
        Thread.sleep(3000);

        driver.findElement(By.className("Login button")).click();
    }
}
