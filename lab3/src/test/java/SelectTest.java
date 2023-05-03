import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelectTest {
    private Utils utils;

    public void link(WebDriver webDriver) {
        // check with correct link
        assertTrue(utils.addImageByLink(webDriver, "https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-47-38.jpg/9e46f3ad-99b0-0859-19fa-59607987d591?t=1631886833419"));
        // check with incorrect link
        assertFalse(utils.addImageByLink(webDriver, "https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-47-54.jpg/2d9cbf3c-4214-4598-3b17-b59c7bb0539e?t=1631886833476"));
        webDriver.quit();
    }

    public void upload(WebDriver webDriver){
        assertTrue(utils.addImageByUpload(webDriver, "/home/nesterrovv/university/software-testing/lab3/src/test/resources/tsopa.jpg"));
        webDriver.quit();
    }

    @BeforeEach
    public void setUp() {
        utils = new Utils();
    }

    @Test
    public void linkTest(){
        link(new ChromeDriver());
        //link(new FirefoxDriver());
    }

    @Test
    public void uploadTest(){
        //upload(new ChromeDriver());
        upload(new FirefoxDriver(new FirefoxOptions().setProfile(new FirefoxProfile())));
    }
}
