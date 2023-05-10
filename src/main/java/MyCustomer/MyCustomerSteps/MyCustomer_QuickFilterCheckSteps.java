package MyCustomer.MyCustomerSteps;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class MyCustomer_QuickFilterCheckSteps extends MyCustomerSteps {

    public static void hoverOnAllCustomer(){
        try {

            // Click on All Customer
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.id("my-customer"))).perform();

            report.test.log(LogStatus.PASS, "Clicked on My customer successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Clicked on My Customer Unsuccessfully ");
        }
    }

    public static void selectAllCustomer() {
        try {
            // Click on All Customer
            driver.findElement(By.id("my-customer")).click();
            report.test.log(LogStatus.PASS, "Clicked on My customer successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Clicked on My Customer Unsuccessfully ");
        }
    }

    public static void selectMyTopSpenders() {
        try {
            // Click on All Customer
            driver.findElement(By.xpath("(//label[@for='top_spender'])[2]")).click();
            report.test.log(LogStatus.PASS, "Clicked on My customer successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Clicked on My Customer Unsuccessfully ");
        }
    }
    public static void hoverOnMyTopSpenders(){
        try {

            // Click on All Customer
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.id("top_spender"))).perform();

            report.test.log(LogStatus.PASS, "Clicked on My customer successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Clicked on My Customer Unsuccessfully ");
        }
    }
}
