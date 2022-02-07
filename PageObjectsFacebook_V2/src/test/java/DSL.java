import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {

    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    //escrever
    public void escrever(By by, String texto) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(texto);
    }

    public void escrever(String name, String texto) {
        escrever(By.name(name), texto);
    }

    //Obter Textos
    public String obterTexto(By by) {
        return driver.findElement(by).getAttribute("value");
    }

    public String obterTexto(String name) {
        return obterTexto(By.name(name));
    }

    //Combobox
    public void selecionarCombo(String id, String valor) {
        WebElement element = driver.findElement(By.id(id));
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }

    public String obterValorCombo(String id) {
        WebElement element = driver.findElement(By.id(id));
        Select combo = new Select(element);
        return combo.getFirstSelectedOption().getText();
    }

    public void selecionarComboGenero(String name, String valor) {
        WebElement element = driver.findElement(By.name(name));
        Select combo = new Select(element);
        combo.selectByValue(valor);
    }

    //RadioButton
    public void clicarRadio(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public boolean isRadioMarcado(String xpath){
        return driver.findElement(By.xpath(xpath)).isSelected();
    }

} // Não apagar
