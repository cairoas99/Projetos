package bild.Login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import bild.TestRule;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class LoginPage extends LoginElementMap {

	WebDriver driver;
	JavascriptExecutor js;

	public LoginPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
		driver = TestRule.getDriver();
		js = (JavascriptExecutor) driver;
	}

	public void efetuarLogin() {
		js.executeScript("document.body.style.zoom='100%'");
	}

	public void enviarEmailESenha(){
		email.sendKeys("admin@admin.com");
        password.sendKeys("admin");
		acessar.click();
	}

    private WebElement fluentWait(final By locator){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(5, TimeUnit.SECONDS)
                .pollingEvery(100, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver webDriver) {
                return webDriver.findElement(locator);
            }
        });

        return element;
    }



}
