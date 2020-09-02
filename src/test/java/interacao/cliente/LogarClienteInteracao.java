package interacao.cliente;

import org.openqa.selenium.support.ui.Select;
import paginas.cliente.LogarClientePagina;

public class LogarClienteInteracao extends LogarClientePagina {

    public void clicarLoginCliente(){
        botaoLoginCliente.click();
    }

    public void selecionarNomeCliente(String nome){
        Select combo = new Select(selecionarCliente);
        combo.selectByVisibleText(nome);
    }

    public void clicarLogin(){
        botaoLogin.click();
    }

    public String mensagemLogin(){
        return mensagemLogin.getText();
    }


}
