

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

public static void main(String[] args) {



System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe"); //chromdriver path for executing th browser


WebDriver driver=new ChromeDriver(); //Initiating chromedriver


driver.manage().window().maximize(); //changing driver screen max min


driver.get("https://www.google.com"); //open the url in browser


driver.close();//closing the browser

}

}
