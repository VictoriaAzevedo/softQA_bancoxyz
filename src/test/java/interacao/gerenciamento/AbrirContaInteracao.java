package interacao.gerenciamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import paginas.gerenciamento.AbrirContaPagina;

public class AbrirContaInteracao extends AbrirContaPagina {

    public void clicarBotaoGerenciamentoLogin() {
        botaoGerenciamentoLogin.click();
    }

    public void clicarBotaoAbrirConta() {
        botaoAbrirConta.click();
    }

    public void selecionarMoeda(String moeda){
        Select combo = new Select(selecaoMoeda);
        combo.selectByVisibleText(moeda);
    }

    public void selecionarCliente(String cliente){
        Select combo = new Select(selecaoCliente);
        combo.selectByVisibleText(cliente);
    }

    public void clicarBotaoEnviar(){
        botaoEnviar.click();
    }








}
