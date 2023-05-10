package OpenBrowser;

import Report.Report;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class OpenWeb {
    //Web driver Static
    public static WebDriver driver;
    //Report
    public static Report report = new Report();
    // Action Hover
    //public static Actions action = new Actions(driver);
    public static void main(String[] args) throws InterruptedException {
        openBrowser();

    }
    public static void openBrowser() throws InterruptedException {
        Report report = new Report();
        report.createReport("Login.tc_OpenPortalQA");
        // Open Browser
        /*System.setProperty("webdriver.chrome.driver","D:\\T2FAbattoir\\driver\\chromedriver.exe");*/
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        options.addArguments("--remote-allow-origins=*")
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        System.setProperty("webdriver.http.factory", "jdk-http-client");


        try {
            // Open URL
            //QA
//          driver.get("https://qa-portal.trade2farm.ie/login");
            //DEV
            driver.get("https://qa-portal.mortarai.com/");
//            driver.get("https://hydro2050.boroughstreetanalytics.com.au/");
            report.test.log(LogStatus.PASS,"Successfully Opened QA Portal");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Cannot load URL");
        };

        // Maximise the Browser
        driver.manage().window().maximize();
        implicitlyWaits();
        reportEnd();

    }
    public static void reportEnd(){
        report.endReporting();
    }
    //Implicitly Waits
    public static void implicitlyWaits() {
        //Implicitly Waits
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

}
