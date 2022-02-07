import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteFacebook {
    WebDriver driver;
    private DSL dsl;
    private FacebookPage page;

    @Before
    public void preCondicao() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\isabellaSzrajbman\\Documents\\MeusProjetos\\Base2_Modulo2\\PageObjectsFacebook_V2\\drivers\\chromedriver97\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();

        dsl = new DSL(driver);
        page = new FacebookPage(driver);

        WebElement btNovaConta = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
        btNovaConta.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
    }

    @After
    public void posCondicao() {
        driver.quit();
    }

    @Test
    public void cadastroFeminino(){
        page.setNome("Primeiro Nome Feminino");
        page.setSobrenome("Sobrenome Feminino");
        page.setEmail("emailfeminino@email.com.br");
        page.setConfirmacaoEmail("emailfeminino@email.com.br");
        page.setSenha("123456");
        page.setData("6");
        page.setMes("Jun");
        page.setAno("1987");
        page.setSexoFeminino("Feminino");

        Assert.assertEquals("Primeiro Nome Feminino", page.obterPrimeiroNomeCadastro());
        Assert.assertEquals("Sobrenome Feminino", page.obterSobrenomeCadastro());
        Assert.assertEquals("emailfeminino@email.com.br", page.obterEmailCadastro());
        Assert.assertEquals("emailfeminino@email.com.br", page.obterEmailConfirmacaoCadastro());
        Assert.assertEquals("123456", page.obterSenhaCadastro());
        Assert.assertEquals("6", page.obterDiaCadastro());
        Assert.assertEquals("Jun", page.obterMesCadastro());
        Assert.assertEquals("1987", page.obterAnoCadastro());
        Assert.assertTrue(page.obterSexoFemininoCadastro());
    }

    @Test
    public void cadastroMasculino(){
        page.setNome("Primeiro Nome Masculino");
        page.setSobrenome("Sobrenome Masculino");
        page.setEmail("emailmasculino@email.com.br");
        page.setConfirmacaoEmail("emailmasculino@email.com.br");
        page.setSenha("123456");
        page.setData("4");
        page.setMes("Jul");
        page.setAno("1984");
        page.setSexoMasculino("Masculino");

        Assert.assertEquals("Primeiro Nome Masculino", page.obterPrimeiroNomeCadastro());
        Assert.assertEquals("Sobrenome Masculino", page.obterSobrenomeCadastro());
        Assert.assertEquals("emailmasculino@email.com.br", page.obterEmailCadastro());
        Assert.assertEquals("emailmasculino@email.com.br", page.obterEmailConfirmacaoCadastro());
        Assert.assertEquals("123456", page.obterSenhaCadastro());
        Assert.assertEquals("4", page.obterDiaCadastro());
        Assert.assertEquals("Jul", page.obterMesCadastro());
        Assert.assertEquals("1984", page.obterAnoCadastro());
        Assert.assertTrue(page.obterSexoMasculinoCadastro());
    }

    @Test
    public void cadastroPersonalizarFeminino(){
        page.setNome("Primeiro Personalizar Feminino");
        page.setSobrenome("Sobrenome Personalizar Feminino");
        page.setEmail("emailpersonalizarfeminino@email.com.br");
        page.setConfirmacaoEmail("emailpersonalizarfeminino@email.com.br");
        page.setSenha("123456");
        page.setData("1");
        page.setMes("Set");
        page.setAno("1980");
        page.setSexoPersonalizado("Personalizado");
        page.setGeneroFeminino("1");
        page.setEscreverGenero("Teste Gênero Feminino");

        Assert.assertEquals("Primeiro Personalizar Feminino", page.obterPrimeiroNomeCadastro());
        Assert.assertEquals("Sobrenome Personalizar Feminino", page.obterSobrenomeCadastro());
        Assert.assertEquals("emailpersonalizarfeminino@email.com.br", page.obterEmailCadastro());
        Assert.assertEquals("emailpersonalizarfeminino@email.com.br", page.obterEmailConfirmacaoCadastro());
        Assert.assertEquals("123456", page.obterSenhaCadastro());
        Assert.assertEquals("1", page.obterDiaCadastro());
        Assert.assertEquals("Set", page.obterMesCadastro());
        Assert.assertEquals("1980", page.obterAnoCadastro());
        Assert.assertTrue(page.obterSexoPersonalizadoCadastro());
        Assert.assertEquals("1", page.obterGeneroPronomeCadastro());
        Assert.assertEquals("Teste Gênero Feminino", page.obterEscritaGenero());
    }

    @Test
    public void cadastroPersonalizarMasculino(){
        page.setNome("Primeiro Personalizar Masculino");
        page.setSobrenome("Sobrenome Personalizar Masculino");
        page.setEmail("emailpersonalizarmasculino@email.com.br");
        page.setConfirmacaoEmail("emailpersonalizarmasculino@email.com.br");
        page.setSenha("123456");
        page.setData("18");
        page.setMes("Abr");
        page.setAno("1985");
        page.setSexoPersonalizado("Personalizado");
        page.setGeneroMasculino("2");
        page.setEscreverGenero("Teste Gênero Masculino");

        Assert.assertEquals("Primeiro Personalizar Masculino", page.obterPrimeiroNomeCadastro());
        Assert.assertEquals("Sobrenome Personalizar Masculino", page.obterSobrenomeCadastro());
        Assert.assertEquals("emailpersonalizarmasculino@email.com.br", page.obterEmailCadastro());
        Assert.assertEquals("emailpersonalizarmasculino@email.com.br", page.obterEmailConfirmacaoCadastro());
        Assert.assertEquals("123456", page.obterSenhaCadastro());
        Assert.assertEquals("18", page.obterDiaCadastro());
        Assert.assertEquals("Abr", page.obterMesCadastro());
        Assert.assertEquals("1985", page.obterAnoCadastro());
        Assert.assertTrue(page.obterSexoPersonalizadoCadastro());
        Assert.assertEquals("2", page.obterGeneroPronomeCadastro());
        Assert.assertEquals("Teste Gênero Masculino", page.obterEscritaGenero());
    }

    @Test
    public void cadastroPersonalizarNeutro(){
        page.setNome("Primeiro Personalizar Neutro");
        page.setSobrenome("Sobrenome Personalizar Neutro");
        page.setEmail("emailpersonalizarneutro@email.com.br");
        page.setConfirmacaoEmail("emailpersonalizarneutro@email.com.br");
        page.setSenha("123456");
        page.setData("19");
        page.setMes("Dez");
        page.setAno("1989");
        page.setSexoPersonalizado("Personalizado");
        page.setGeneroNeutro("6");
        page.setEscreverGenero("Teste Gênero Neutro");

        Assert.assertEquals("Primeiro Personalizar Neutro", page.obterPrimeiroNomeCadastro());
        Assert.assertEquals("Sobrenome Personalizar Neutro", page.obterSobrenomeCadastro());
        Assert.assertEquals("emailpersonalizarneutro@email.com.br", page.obterEmailCadastro());
        Assert.assertEquals("emailpersonalizarneutro@email.com.br", page.obterEmailConfirmacaoCadastro());
        Assert.assertEquals("123456", page.obterSenhaCadastro());
        Assert.assertEquals("19", page.obterDiaCadastro());
        Assert.assertEquals("Dez", page.obterMesCadastro());
        Assert.assertEquals("1989", page.obterAnoCadastro());
        Assert.assertTrue(page.obterSexoPersonalizadoCadastro());
        Assert.assertEquals("6", page.obterGeneroPronomeCadastro());
        Assert.assertEquals("Teste Gênero Neutro", page.obterEscritaGenero());
    }

} //Não apagar
