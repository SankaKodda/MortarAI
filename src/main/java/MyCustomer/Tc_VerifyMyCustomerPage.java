package MyCustomer;

import MyCustomer.MyCustomerSteps.MyCustomerSteps;

public class Tc_VerifyMyCustomerPage extends MyCustomerSteps {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        login();
        searchACustomer();
        clickOnToGoTOPortal();
        clickMyCustomer();
        signOut();
    }
}
