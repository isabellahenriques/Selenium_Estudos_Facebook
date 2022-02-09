package page;

import core.BasePage;

public class FacebookPage extends BasePage {

    public void setNome(String nome) {
        dsl.escrever("firstname",nome);
    }

    public void setSobrenome(String sobrenome) {
        dsl.escrever("lastname", sobrenome);
    }

    public void setEmail(String email) {
        dsl.escrever("reg_email__",email);
    }

    public void setConfirmacaoEmail(String confirmacaoEmail) {
        dsl.escrever("reg_email_confirmation__",confirmacaoEmail);
    }

    public void setSenha(String senha) {
        dsl.escrever("reg_passwd__", senha);
    }

    public void setData(String data) {
        dsl.selecionarCombo("day", data);
    }

    public void setMes(String mes) {
        dsl.selecionarCombo("month", mes);
    }

    public void setAno(String ano) {
        dsl.selecionarCombo("year", ano);
    }

    public void setSexoFeminino(String feminino) {
        dsl.clicarRadio("//*[. = 'Feminino']/.//input");
    }

    public void setSexoMasculino(String masculino) {
        dsl.clicarRadio("//*[. = 'Masculino']/.//input");
    }

    public void setSexoPersonalizado(String personalizado) {
        dsl.clicarRadio("//input[@name='sex' and @value='-1']");
    }

    public void setGeneroFeminino (String value){
        dsl.selecionarComboGenero("preferred_pronoun", value);
    }

    public void setGeneroMasculino (String value){
        dsl.selecionarComboGenero("preferred_pronoun", value);
    }

    public void setGeneroNeutro (String value){
        dsl.selecionarComboGenero("preferred_pronoun", value);
    }

    public void setEscreverGenero(String genero) {
        dsl.escrever("custom_gender",genero);
    }

    //Codigos usados para fazer os asserts
    public String obterPrimeiroNomeCadastro() {
        return dsl.obterTexto("firstname");
    }

    public String obterSobrenomeCadastro() {
        return dsl.obterTexto("lastname");
    }

    public String obterEmailCadastro() {
        return dsl.obterTexto("reg_email__");
    }

    public String obterEmailConfirmacaoCadastro() {
        return dsl.obterTexto("reg_email_confirmation__");
    }

    public String obterSenhaCadastro() {
        return dsl.obterTexto("reg_passwd__");
    }

    public String obterDiaCadastro() {
        return dsl.obterValorCombo("day");
    }

    public String obterMesCadastro() {
        return dsl.obterValorCombo("month");
    }

    public String obterAnoCadastro() {
        return dsl.obterValorCombo("year");
    }

    public boolean obterSexoFemininoCadastro() {
        return dsl.isRadioMarcado("//*[. = 'Feminino']/.//input");
    }

    public boolean obterSexoMasculinoCadastro() {
        return dsl.isRadioMarcado("//*[. = 'Masculino']/.//input");
    }

    public boolean obterSexoPersonalizadoCadastro() {
        return dsl.isRadioMarcado("//input[@name='sex' and @value='-1']");
    }

    public String obterGeneroPronomeCadastro() {
        return dsl.obterTexto("preferred_pronoun");
    }

    public String obterEscritaGenero() {
        return dsl.obterTexto("custom_gender");
    }

} //Não apagar
