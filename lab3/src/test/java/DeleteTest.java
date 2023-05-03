import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteTest {
    private Utils utils;

    @BeforeEach
    public void setUp() {
        utils = new Utils();
    }

    private void delete(WebDriver webDriver){
        webDriver.get("https://fastpic.ru/my.php");
        webDriver.manage().window().setSize(new Dimension(968, 824));
        int firstLength = webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size();
        // add pictures to the cart if it is empty
        if (firstLength == 0) {
            utils.addImageByLink(webDriver, "https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-47-54.jpg/2d9cbf3c-4214-4598-3b17-b59c7bb0539e?t=1631886833476");
            utils.addImageByLink(webDriver, "https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-47-38.jpg/9e46f3ad-99b0-0859-19fa-59607987d591?t=1631886833419");
            utils.addImageByLink(webDriver, "https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-48-03.jpg/b7b6321c-ecd3-934b-fa89-9bcf168f4660?t=1631886833093");
        }
        webDriver.get("https://fastpic.ru");
        webDriver.findElement(By.xpath("//table[@id=\'headermenu\']/tbody/tr/td/div/a[5]/div/div[4]")).click();
        int secondLength = webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size();
        System.out.println(secondLength);
        // remove one picture
        webDriver.findElement(By.xpath("//form[@id='manage-form']/div[2]/div/label/input")).click();
        webDriver.findElement(By.id("delete_checked")).click();
        assertEquals(secondLength - 1, webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size());
        // remove all pictures
        if (webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size() == 0) {
            utils.addImageByLink(webDriver, "https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-47-54.jpg/2d9cbf3c-4214-4598-3b17-b59c7bb0539e?t=1631886833476");
            utils.addImageByLink(webDriver, "https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-47-38.jpg/9e46f3ad-99b0-0859-19fa-59607987d591?t=1631886833419");
            utils.addImageByLink(webDriver, "https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-48-03.jpg/b7b6321c-ecd3-934b-fa89-9bcf168f4660?t=1631886833093");
        }
        webDriver.get("https://fastpic.ru/my.php");
        webDriver.findElement(By.xpath("//a[contains(text(),\'[ выбрать всё ]\')]")).click();
        webDriver.findElement(By.xpath("//a[contains(text(),\'[ удалить выбранное ]\')]")).click();
        assertEquals(0, webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size());
        webDriver.quit();
    }

    @Test
    public void deleteTest() {
        //delete(new ChromeDriver());
        delete(new FirefoxDriver(new FirefoxOptions().setProfile(new FirefoxProfile())));
    }
}
