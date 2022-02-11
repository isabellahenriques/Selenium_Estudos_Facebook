package core;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

import static core.DriverFactory.getDriver;

public class BaseTest {
    @Rule
    public TestName testName = new TestName();

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
