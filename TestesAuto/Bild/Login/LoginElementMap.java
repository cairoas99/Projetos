package bild.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementMap {

	protected WebElement email;
	
	protected WebElement password;
	
	@FindBy(xpath = "/html/body/div[1]/div/form/div[3]/div[2]/button")
	protected WebElement acessar;
}
