package Login;

public class tc_AbbatoirLoginWithValidCredentials extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        validCredentials();
    }

    private static void validCredentials() throws InterruptedException {
        openBrowser();
        report.createReport("Login.tc_PortalLoginWithValidCredentials");
        enterValidEmail();
        enterValidPassword();
        clickSignIn();
        clickUserDropdown();
        clickSignOut();
        closeDrive();
        reportEnd();
    }
}
