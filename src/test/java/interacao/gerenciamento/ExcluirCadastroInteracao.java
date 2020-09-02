package interacao.gerenciamento;

import paginas.gerenciamento.ExcluirCadastroPagina;

public class ExcluirCadastroInteracao extends ExcluirCadastroPagina {

    public void clicarBotaoGerenciamentoLogin() {
        botaoGerenciamentoLogin.click();
    }

    public void clicarListarClientes() {
        botaoClientes.click();
    }

    public void buscarClienteNome(String nome){
        buscarCliente.sendKeys(nome);
    }

    public void clicarBotaoExcluir(){
        botãoExcluir.click();
    }


}
