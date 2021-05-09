import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest {

    // deklarisanje promenjive driver
    public static WebDriver driver;

    // izvrsava se pre testa vise kao setUp
    @Before
    //metoda koja se setupuje
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @After
    public void tearDown(){
       // zatvaranje taba
        //driver.close();
        //zatvaranje pretrazivaca
        //driver.quit();

    }

    @Test
    public void firstTest(){
        driver.get("https://www.yahoo.com/");
        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();


    }

    // obavezno ocistiti polja pre nego sto se bilo sta upise u polje
    @Test
    public void secondTest(){
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Beograd");
        //Keys je biblioteka za dugmad ENTER ALT DELETE ITD. sendKeys(Keys.NESTO VELIKIM SLOVIMA);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.navigate().back();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Nis");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Test
    public void googleTest (){
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Ada ciganlija");
        //driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).click();
        //driver.findElement(By.cssSelector("div.L3eUgb:nth-child(2) div.o3j99.ikrT4e.om7nvf:nth-child(3) div:nth-child(1) div.A8SBwf:nth-child(1) div.FPdoLc.tfB0Bf:nth-child(4) center:nth-child(1) > input.gNO89b")).click();
        //driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Gmail")).click();

    }

}
