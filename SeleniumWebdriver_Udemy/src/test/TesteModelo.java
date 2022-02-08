import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCadastro {
    WebDriver driver;

    @Before
    public void preCondicao() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\isabellaSzrajbman\\Documents\\MeusProjetos\\SeleniumWebdriver_Udemy\\drivers\\chromedriver97\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
        driver.manage().window().maximize(); // maximiza a janela do navegador.
    }

    @After
    public void posCondicao() {
        driver.quit();
    }

    @Test
    public void testeNome() {

    }


}
