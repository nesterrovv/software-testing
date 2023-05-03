import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PreviewTest {
    private Utils utils;
    private int firstLength, secondLength;

    private void preview1(WebDriver webDriver) {
        webDriver.get("https://fastpic.ru/my.php");
        firstLength = webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size();
        webDriver.get("https://fastpic.ru/");
        webDriver.manage().window().setSize(new Dimension(1536, 824));
        //Надпись без размера
        utils.addImageWithPreview1(webDriver,"https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-48-03.jpg/b7b6321c-ecd3-934b-fa89-9bcf168f4660?t=1631886833093", "Genius");
        webDriver.get("https://fastpic.ru");
        webDriver.findElement(By.xpath("//table[@id=\'headermenu\']/tbody/tr/td/div/a[5]/div/div[4]")).click();
        //webDriver.get("https://fastpic.ru/my.php");
        secondLength = webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size();
        assertTrue(secondLength == firstLength + 1);

        webDriver.get("https://fastpic.ru/");
        //Размер без надписи
        utils.addImageWithPreview1(webDriver,"https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-47-38.jpg/9e46f3ad-99b0-0859-19fa-59607987d591?t=1631886833419", "100");
        webDriver.get("https://fastpic.ru");
        webDriver.findElement(By.xpath("//table[@id=\'headermenu\']/tbody/tr/td/div/a[5]/div/div[4]")).click();
        //webDriver.get("https://fastpic.ru/my.php");
        secondLength = webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size();
        assertTrue(secondLength == firstLength + 2);

        webDriver.quit();
    }

    private void preview2(WebDriver webDriver){
        webDriver.get("https://fastpic.ru/my.php");
        firstLength = webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size();
        webDriver.get("https://fastpic.ru/");
        webDriver.manage().window().setSize(new Dimension(1536, 824));
        //Размер + надпись
        utils.addImageWithPreview2(webDriver, "https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-47-54.jpg/2d9cbf3c-4214-4598-3b17-b59c7bb0539e?t=1631886833476", "Another Gosling", "150");
        webDriver.get("https://fastpic.ru");
        webDriver.findElement(By.xpath("//table[@id=\'headermenu\']/tbody/tr/td/div/a[5]/div/div[4]")).click();
        //webDriver.get("https://fastpic.ru/my.php");
        secondLength = webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size();
        assertTrue(secondLength == firstLength + 1);

        webDriver.get("https://fastpic.ru/");
        //Размер + надпись размера
        utils.addImageWithPreview2(webDriver,"https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-48-03.jpg/b7b6321c-ecd3-934b-fa89-9bcf168f4660?t=1631886833093", "", "50");
        webDriver.get("https://fastpic.ru");
        webDriver.findElement(By.xpath("//table[@id=\'headermenu\']/tbody/tr/td/div/a[5]/div/div[4]")).click();
        //webDriver.get("https://fastpic.ru/my.php");
        secondLength = webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size();
        assertTrue(secondLength == firstLength + 2);

        webDriver.quit();
    }

    private void previewEmpty(WebDriver webDriver){
        //Без надписи и размера
        webDriver.get("https://fastpic.ru/my.php");
        firstLength = webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size();
        webDriver.get("https://fastpic.ru/");
        webDriver.manage().window().setSize(new Dimension(1536, 824));
        utils.addImageWithPreviewEmpty(webDriver,"https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-47-38.jpg/9e46f3ad-99b0-0859-19fa-59607987d591?t=1631886833419");
        webDriver.get("https://fastpic.ru");
        webDriver.findElement(By.xpath("//table[@id=\'headermenu\']/tbody/tr/td/div/a[5]/div/div[4]")).click();
        //webDriver.get("https://fastpic.ru/my.php");
        secondLength = webDriver.findElements(By.xpath("//*[@id=\"manage-form\"]/div")).size();
        assertTrue(secondLength == firstLength + 1);
        webDriver.quit();
    }


    @BeforeEach
    public void setUp() {
        utils = new Utils();
    }

    @Test
    public void preview1Test(){
        preview1(new ChromeDriver());
        //preview1(new FirefoxDriver());
    }

    @Test
    public void preview2Test(){
        preview2(new ChromeDriver());
        //preview2(new FirefoxDriver());
    }

    @Test
    public void previewEmptyTest(){
        //previewEmpty(new ChromeDriver());
        previewEmpty(new FirefoxDriver(new FirefoxOptions().setProfile(new FirefoxProfile())));
    }
}
