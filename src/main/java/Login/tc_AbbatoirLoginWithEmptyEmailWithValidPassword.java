package Login;

public class tc_AbbatoirLoginWithEmptyEmailWithValidPassword extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        loginWithEmptyEmailWithValidPassword();

    }

    private static void loginWithEmptyEmailWithValidPassword() throws InterruptedException {
        report.createReport("tc_AbbatoirLoginWithEmptyEmailWithValidPassword");
        openBrowser();
        keepBlankEmail();
        enterValidPassword();
        clickSignIn();
        /*clickUserDropdown();
        clickSignOut();
        closeDrive();*/
        reportEnd();

    }

}
