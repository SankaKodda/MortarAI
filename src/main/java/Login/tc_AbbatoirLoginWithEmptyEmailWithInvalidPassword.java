package Login;

public class tc_AbbatoirLoginWithEmptyEmailWithInvalidPassword extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        emptyEmailWithInvalidPassword();
    }

    private static void emptyEmailWithInvalidPassword() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithEmptyEmailWithInvalidPassword");
        openBrowser();
        keepBlankEmail();
        enterInvalidPassword();
        clickSignIn();
        /*clickUserDropdown();
        clickSignOut();
        closeDrive();*/
        reportEnd();
    }

}
