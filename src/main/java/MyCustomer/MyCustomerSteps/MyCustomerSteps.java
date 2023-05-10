package MyCustomer.MyCustomerSteps;

import Login.LoginSteps;
import SelectBusinessOwner.SelectBusinessOwnerSteps;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;

public class MyCustomerSteps extends SelectBusinessOwnerSteps {
    protected static void clickMyCustomer(){
        try {
            // Click on User Drop Down
            driver.findElement(By.xpath("//div[@data-intercom-target='My Customers']")).click();
            report.test.log(LogStatus.PASS, "Clicked on My customer successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Clicked on My Customer Unsuccessfully ");
        }
    }
}
