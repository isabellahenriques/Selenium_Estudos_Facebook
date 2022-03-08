package core;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.FacebookPage;

import java.io.File;
import java.io.IOException;

import static core.DriverFactory.getDriver;

public class BaseTest {
    private FacebookPage page = new FacebookPage();

    @Rule
    public TestName testName = new TestName();

    @Before
    public void preCondicao() {
        getDriver().navigate().to("https://www.facebook.com/");
        page = new FacebookPage();

        WebElement btNovaConta = getDriver().findElement(By.xpath("//a[.='Criar nova conta']"));
        btNovaConta.click();

        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
    }

    @After
    public void posCondicao() throws IOException {
        //Screenshot da tela
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File fotoTela = ss.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(fotoTela,new File("target" + File.separator + "screenshot" +
                File.separator + testName.getMethodName() + ".jpg"));

        //Fechar o navegador
        DriverFactory.killDriver();
    }
}
