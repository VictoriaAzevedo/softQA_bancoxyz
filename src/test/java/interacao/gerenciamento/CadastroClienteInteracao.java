package interacao.gerenciamento;

import org.openqa.selenium.Alert;
import paginas.gerenciamento.CadastroClientePagina;
import utils.InstaciarDrive;

public class CadastroClienteInteracao extends CadastroClientePagina {


    public void clicarGerenciamentoLogin(){
        botaoGerenciamentoLogin.click();
    }

    public void clicarAdicionarCliente(){
        botaoAdicionarCliente.click();
    }

    public void informarNomeCliente(String nome){
        campoNome.sendKeys(nome);
    }

    public void informarSobrenomeCliente(String sobrenome){
        campoSobrenome.sendKeys(sobrenome);
    }

    public void informarCepCliente(String cep){
        campoCep.sendKeys(cep);
    }

    public void salvarCadastro(){
        botãoSalvar.click();
    }

    public String retornarMensagemAlerta(){
        Alert alerta = InstaciarDrive.getDriver().switchTo().alert();
        String[] mensagemAlerta = alerta.getText().split(":");
        alerta.accept();
        return mensagemAlerta[0];
    }


}
