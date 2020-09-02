package interacao.gerenciamento;

import paginas.gerenciamento.CadastroClientePagina;

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
}
