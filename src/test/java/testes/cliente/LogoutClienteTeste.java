package testes.cliente;

import interacao.cliente.LogoutClienteInteracao;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import utils.ClienteUtils;
import utils.InstaciarDrive;

public class LogoutClienteTeste extends InstaciarDrive {

    LogoutClienteInteracao logoutConta = PageFactory.initElements(driver, LogoutClienteInteracao.class);
    ClienteUtils clienteUtils = new ClienteUtils();

    @Test
    public void realizarLogoutSucesso(){
        clienteUtils.logarContaClienteFixo();
        logoutConta.clicarBotaoLogout();

        Assert.assertEquals("Your Name :", logoutConta.tituloPaginainicial());

    }
}
