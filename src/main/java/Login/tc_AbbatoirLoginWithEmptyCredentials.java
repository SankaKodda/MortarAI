package Login;


public class tc_AbbatoirLoginWithEmptyCredentials extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        keepCredentialsEmpty();

    }

    private static void keepCredentialsEmpty() throws InterruptedException {
        openBrowser();
        report.createReport("Login.tc_AbbatoirLoginWithEmptyCredentials");
        keepBlankEmail();
        keepBlankPassword();
        clickSignIn();
        /*clickUserDropdown();
        clickSignOut();
        closeDrive();*/
        reportEnd();

    }
}


