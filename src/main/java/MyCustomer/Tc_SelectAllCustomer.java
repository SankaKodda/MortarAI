package MyCustomer;

import MyCustomer.MyCustomerSteps.MyCustomer_QuickFilterCheckSteps;

public class Tc_SelectAllCustomer extends MyCustomer_QuickFilterCheckSteps {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        login();
        searchACustomer();
        clickOnToGoTOPortal();
        clickMyCustomer();
        Thread.sleep(5000);
        hoverOnAllCustomer();
        selectAllCustomer();
        signOut();

    }
}
