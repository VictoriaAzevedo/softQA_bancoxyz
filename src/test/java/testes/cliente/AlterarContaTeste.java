package testes.cliente;

import interacao.cliente.AlterarContaInteracao;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import utils.ClienteUtils;
import utils.InstaciarDrive;

public class AlterarContaTeste extends InstaciarDrive {

    ClienteUtils clienteUtils = new ClienteUtils();
    AlterarContaInteracao alterarConta = PageFactory.initElements(driver, AlterarContaInteracao.class);

    @Test
    public void alterarContaSucesso(){
        clienteUtils.logarContaClienteFixo();
        alterarConta.selecionarConta("1002");

        Assert.assertEquals("Account Number : 1002 ", alterarConta.numeroContaSelecionada());

    }
}
