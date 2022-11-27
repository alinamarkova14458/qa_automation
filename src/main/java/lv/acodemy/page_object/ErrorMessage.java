package lv.acodemy.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorMessage {
    private final WebDriver driver;
    public ErrorMessage(WebDriver driver) {
        this.driver = driver;
    }
    public String errorMessage() {
        return driver.findElement(By.id(errorMessage())).getText();
    }
}
