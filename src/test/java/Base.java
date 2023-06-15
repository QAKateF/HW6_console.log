import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import javax.tools.JavaCompiler;
import java.util.concurrent.TimeUnit;

public class Base {
        WebDriver wd;

        @BeforeSuite
        public void init(){
            wd = new ChromeDriver();
            wd.navigate().to("https://www.leumi.co.il/");
            wd.manage().window().maximize();
            wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        @AfterSuite
        public void tearDown(){
        wd.quit();
        }

        public void isLocator(){
            String text1 = wd.findElement(By.cssSelector("a[href=\"https://www.leumi.co.il\"]:first-child")).getText();
            System.out.println("cssSelector: " + text1);
            String text2 =wd.findElement(By.xpath("//*[text()='פרטי']")).getText();
            System.out.println("xpath: " + text2);
            String text3 = wd.findElement(By.cssSelector("a[title='פרטי']")).getText();
            System.out.println("cssSelector: " + text3);
        }

    }

