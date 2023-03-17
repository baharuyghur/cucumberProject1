package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[contains(@id,'search-query')]")
    public WebElement searchBox;
    
    @FindBy(xpath = "//button[contains(@class,'search-input-btn')]")
    public WebElement searchButton;
    
    

}
