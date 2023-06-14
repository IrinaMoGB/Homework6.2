package Homework6;

import Homework6.AbstractTest;
import hw6.pages.HomePage;
import hw6.panels.AuthPanel;
import org.junit.jupiter.api.Test;

public class Authorization extends AbstractTest {
    @Test
    void test() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnElement(homePage.getLoginButtonHeader());

        AuthPanel authPanel = new AuthPanel(getEventDriver());
        authPanel
                .inputLogin(authPanel.getLogin())
                .inputPassword(authPanel.getPassword())


    }
}
