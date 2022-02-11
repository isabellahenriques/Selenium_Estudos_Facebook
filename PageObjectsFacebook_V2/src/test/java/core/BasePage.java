package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static core.DriverFactory.getDriver;

public class BasePage {
    //escrever
    public void escrever(By by, String texto) {
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(texto);
    }

    public void escrever(String name, String texto) {
        escrever(By.name(name), texto);
    }

    //Obter Textos
    public String obterTexto(By by) {
        return getDriver().findElement(by).getAttribute("value");
    }

    public String obterTexto(String name) {
        return obterTexto(By.name(name));
    }

    //Combobox
    public void selecionarCombo(String id, String valor) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }

    public String obterValorCombo(String id) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        return combo.getFirstSelectedOption().getText();
    }

    public void selecionarComboGenero(String name, String valor) {
        WebElement element = getDriver().findElement(By.name(name));
        Select combo = new Select(element);
        combo.selectByValue(valor);
    }

    //RadioButton
    public void clicarRadio(String xpath) {
        getDriver().findElement(By.xpath(xpath)).click();
    }

    public boolean isRadioMarcado(String xpath){
        return getDriver().findElement(By.xpath(xpath)).isSelected();
    }

} //Não Apagar
