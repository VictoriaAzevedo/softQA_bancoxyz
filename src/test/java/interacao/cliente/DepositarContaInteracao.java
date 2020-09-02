package interacao.cliente;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import paginas.cliente.DepositarContaPagina;

public class DepositarContaInteracao extends DepositarContaPagina {

    public void clicarDeposito(){
        botaoDepositar.click();
    }

    public void informarValorDeposito(String valor){
        valorDeposito.sendKeys(valor);
    }

    public void clicarRealizarDeposito(){
        botaoEnviarDeposito.click();
    }

    public String mensagemDepositoSucesso(){
        return mensagemSucesso.getText();
    }
}
