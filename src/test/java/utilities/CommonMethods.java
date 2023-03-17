package utilities;
import org.openqa.selenium.WebElement;


public class CommonMethods extends PageInitializer {
	
	public void sentText(WebElement element, String text) {
       element.sendKeys(text);
    }
    
    public void click(WebElement element) {
       element.click();
    }
    public void getTitle() {
    String title=driver.getTitle();
    System.out.println(title);
    }
    public void getURL() {
    String url=driver.getCurrentUrl();
    System.out.println(url);
    }
    
    
}  
    
