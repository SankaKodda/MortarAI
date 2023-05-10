package SelectBusinessOwner;

import Login.LoginSteps;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;

public class SelectBusinessOwnerSteps extends LoginSteps {
    public static void searchACustomer(){
        //Search a Customer
        try {
            driver.findElement(By.id("search")).clear();
            driver.findElement(By.id("search")).sendKeys("testdevint03");
            report.test.log(LogStatus.PASS, "Searched a User Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "DSearched User Unsuccessfully");
        }

    }
     public static void clickOnToGoTOPortal(){
        try {
            // Click Go to Portal
            driver.findElement(By.xpath("(//button[@class='btn btn-primary portal-go edit-button ml-1 ng-tns-c194-0'])[1]")).click();
//            driver.findElement(By.xpath("//img[@class='dropdown-toggle ng-star-inserted']")).click();

            report.test.log(LogStatus.PASS, "Clicked Go To Portal Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Clicked Go To Portal Unsuccessfully");
        }
    }
}
