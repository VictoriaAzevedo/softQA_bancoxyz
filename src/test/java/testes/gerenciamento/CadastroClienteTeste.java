package testes.gerenciamento;

import interacao.gerenciamento.CadastroClienteInteracao;
import org.junit.Assert;
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
        Assert.assertEquals("Customer added successfully with customer id " , cadastrarCliente.retornarMensagemAlerta());

    }

    @Test
    public void cadstraClienteDuplicado(){
        cadastrarCliente.clicarGerenciamentoLogin();
        esperarSegundos();
        cadastrarCliente.clicarAdicionarCliente();
        cadastrarCliente.informarNomeCliente("Harry");
        cadastrarCliente.informarSobrenomeCliente("Potter");
        cadastrarCliente.informarCepCliente("E725JB");
        cadastrarCliente.salvarCadastro();
        Assert.assertEquals("Please check the details. Customer may be duplicate." , cadastrarCliente.retornarMensagemAlerta());

    }




}
