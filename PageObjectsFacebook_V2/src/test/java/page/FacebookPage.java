package page;

import core.BasePage;

public class FacebookPage extends BasePage {

    public void setNome(String nome) {
        escrever("firstname",nome);
    }

    public void setSobrenome(String sobrenome) {
        escrever("lastname", sobrenome);
    }

    public void setEmail(String email) {
        escrever("reg_email__",email);
    }

    public void setConfirmacaoEmail(String confirmacaoEmail) {
        escrever("reg_email_confirmation__",confirmacaoEmail);
    }

    public void setSenha(String senha) {
        escrever("reg_passwd__", senha);
    }

    public void setData(String data) {
        selecionarCombo("day", data);
    }

    public void setMes(String mes) {
        selecionarCombo("month", mes);
    }

    public void setAno(String ano) {
        selecionarCombo("year", ano);
    }

    public void setSexoFeminino(String feminino) {
        clicarRadio("//*[. = 'Feminino']/.//input");
    }

    public void setSexoMasculino(String masculino) {
        clicarRadio("//*[. = 'Masculino']/.//input");
    }

    public void setSexoPersonalizado(String personalizado) {
        clicarRadio("//input[@name='sex' and @value='-1']");
    }

    public void setGeneroFeminino (String value){
        selecionarComboGenero("preferred_pronoun", value);
    }

    public void setGeneroMasculino (String value){
        selecionarComboGenero("preferred_pronoun", value);
    }

    public void setGeneroNeutro (String value){
        selecionarComboGenero("preferred_pronoun", value);
    }

    public void setEscreverGenero(String genero) {
        escrever("custom_gender",genero);
    }

    //Codigos usados para fazer os asserts
    public String obterPrimeiroNomeCadastro() {
        return obterTexto("firstname");
    }

    public String obterSobrenomeCadastro() {
        return obterTexto("lastname");
    }

    public String obterEmailCadastro() {
        return obterTexto("reg_email__");
    }

    public String obterEmailConfirmacaoCadastro() {
        return obterTexto("reg_email_confirmation__");
    }

    public String obterSenhaCadastro() {
        return obterTexto("reg_passwd__");
    }

    public String obterDiaCadastro() {
        return obterValorCombo("day");
    }

    public String obterMesCadastro() {
        return obterValorCombo("month");
    }

    public String obterAnoCadastro() {
        return obterValorCombo("year");
    }

    public boolean obterSexoFemininoCadastro() {
        return isRadioMarcado("//*[. = 'Feminino']/.//input");
    }

    public boolean obterSexoMasculinoCadastro() {
        return isRadioMarcado("//*[. = 'Masculino']/.//input");
    }

    public boolean obterSexoPersonalizadoCadastro() {
        return isRadioMarcado("//input[@name='sex' and @value='-1']");
    }

    public String obterGeneroPronomeCadastro() {
        return obterTexto("preferred_pronoun");
    }

    public String obterEscritaGenero() {
        return obterTexto("custom_gender");
    }

} //Não apagar
