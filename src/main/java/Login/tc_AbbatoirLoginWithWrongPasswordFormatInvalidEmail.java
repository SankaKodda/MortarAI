package Login;

public class tc_AbbatoirLoginWithWrongPasswordFormatInvalidEmail extends LoginSteps{
    public static void main(String[] args) throws InterruptedException {
        wrongPasswordFormatInvalidEmail();
    }

    private static void wrongPasswordFormatInvalidEmail() throws InterruptedException {
        report.createReport("Login.tc_AbbatoirLoginWithWrongPasswordFormatInvalidEmail");
        openBrowser();
        enterInvalidEmail();
        enterWrongPasswordFormat();
        clickSignIn();
        /*clickUserDropdown();
        clickSignOut();
        closeDrive();*/
        reportEnd();
    }

}
