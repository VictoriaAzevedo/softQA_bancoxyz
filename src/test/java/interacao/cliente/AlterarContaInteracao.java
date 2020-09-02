package interacao.cliente;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import paginas.cliente.AlterarContaPagina;

public class AlterarContaInteracao extends AlterarContaPagina {

    public void selecionarConta(String numeroConta){
        Select combo = new Select(selecaoConta);
        combo.selectByVisibleText(numeroConta);
    }

    public String numeroContaSelecionada(){
        String [] st = informacoesConta.getText().split(",");
        return st[0];
    }

}
