package testes.gerenciamento;

import interacao.gerenciamento.ExcluirCadastroInteracao;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import utils.InstaciarDrive;

public class ExcluirCadastroTeste extends InstaciarDrive {


    ExcluirCadastroInteracao excluirCadastro = PageFactory.initElements(driver, ExcluirCadastroInteracao.class);

    @Test
    public void excluirCadastroSucesso(){
        excluirCadastro.clicarBotaoGerenciamentoLogin();
        esperarSegundos();
        excluirCadastro.clicarListarClientes();
        excluirCadastro.buscarClienteNome("Harry");
        excluirCadastro.clicarBotaoExcluir();


        //Assert.assertEquals();
    }

}
