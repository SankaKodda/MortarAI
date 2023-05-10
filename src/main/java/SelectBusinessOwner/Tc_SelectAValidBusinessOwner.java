package SelectBusinessOwner;

public class Tc_SelectAValidBusinessOwner extends SelectBusinessOwnerSteps{
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        report.createReport("Login.tc_SelectAValidBusinessOwner");
        login();
        searchACustomer();
        clickOnToGoTOPortal();
        signOut();
        reportEnd();
    }
}
