package testes.gerenciamento;

import interacao.gerenciamento.CadastroClienteInteracao;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import utils.InstaciarDrive;

public class CadastroClienteTeste extends InstaciarDrive {
    CadastroClienteInteracao cadastrarCliente = PageFactory.initElements(driver, CadastroClienteInteracao.class);


    @Test
    public void cadastrarClienteSucesso(){
        cadastrarCliente.clicarGerenciamentoLogin();
        esperarSegundos();
        cadastrarCliente.clicarAdicionarCliente();
        cadastrarCliente.informarNomeCliente("Bob");
        cadastrarCliente.informarSobrenomeCliente("Marley");
        cadastrarCliente.informarCepCliente("ABC1234");
        cadastrarCliente.salvarCadastro();


        //Assert.assertThat("Customer added successfully with customer id :");

    }




}
