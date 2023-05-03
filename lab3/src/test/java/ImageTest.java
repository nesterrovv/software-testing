import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImageTest {
    private Utils utils;

    @BeforeEach
    public void setUp() {
        utils = new Utils();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/rotate.csv", numLinesToSkip = 1)
    public void imageRotationTest(String link, String deg) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://fastpic.ru/my.php");
        assertTrue(utils.rotatateImage(webDriver, link, deg));
        webDriver.quit();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/reduce.csv", numLinesToSkip = 1)
    public void imageReduceTest(String link, String size){
        WebDriver webDriver = new ChromeDriver();
        assertTrue(utils.reduceImage(webDriver, link, size));
        webDriver.quit();
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/links.csv", numLinesToSkip = 1)
    public void imageJPEGTest(String link){
        WebDriver webDriver = new ChromeDriver();
        assertTrue(utils.intoJPEG(webDriver, link));
        webDriver.quit();
    }

    @Test
    public void imagePosterTest(){
        //WebDriver webDriver = new ChromeDriver();
        WebDriver webDriver = new FirefoxDriver(new FirefoxOptions().setProfile(new FirefoxProfile()));
        assertTrue(utils.intoPoster(webDriver,"https://se.ifmo.ru/documents/1609903/1613524/photo_2021-09-17_16-48-03.jpg/b7b6321c-ecd3-934b-fa89-9bcf168f4660?t=1631886833093"));
        webDriver.quit();
    }
}
