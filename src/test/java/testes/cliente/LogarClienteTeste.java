package testes.cliente;

import interacao.cliente.LogarClienteInteracao;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.ClienteUtils;
import utils.InstaciarDrive;

public class LogarClienteTeste extends InstaciarDrive {

    LogarClienteInteracao login = PageFactory.initElements(driver, LogarClienteInteracao.class);
    ClienteUtils clienteUtils = new ClienteUtils();

    @Test
    public void logarSucesso(){
        login.clicarLoginCliente();
        esperarSegundos();
        String nomeCliente = clienteUtils.nomeClientes();
        login.selecionarNomeCliente(nomeCliente);
        login.clicarLogin();
        Assert.assertEquals("Welcome " + nomeCliente + " !!", login.mensagemLogin());
    }

}
