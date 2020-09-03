package testes.cliente;

import interacao.cliente.DepositarContaInteracao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import utils.ClienteUtils;
import utils.InstaciarDrive;

public class DepositarContaTeste extends InstaciarDrive {

    ClienteUtils clienteUtils = new ClienteUtils();
    DepositarContaInteracao depositarConta = PageFactory.initElements(driver, DepositarContaInteracao.class);

    @Before
    public void incializar(){
        clienteUtils.logarContaClienteFixo();
        depositarConta.clicarDeposito();
    }

    @Test
    public void depositarContaSucesso(){
        clienteUtils.esperarSegundos();
        depositarConta.informarValorDeposito(clienteUtils.gerarValorDeposito());
        depositarConta.clicarRealizarDeposito();
        Assert.assertEquals("Deposit Successful", depositarConta.mensagemDepositoSucesso());
    }

    @Test
    public void verificarValorDepositadoConta(){
        String valorDepositar = clienteUtils.gerarValorDeposito();
        int saldoAtual = clienteUtils.verificarSaldoTotalAtual();
        depositarConta.informarValorDeposito(valorDepositar);
        depositarConta.clicarRealizarDeposito();
        Assert.assertEquals(clienteUtils.valorSaldoAtualizadoDeposito(valorDepositar, saldoAtual), Integer.toString(clienteUtils.verificarSaldoTotalAtual()));
    }

    @Test
    public void depositarValorNegativo(){
        int saldoAtual = clienteUtils.verificarSaldoTotalAtual();
        depositarConta.informarValorDeposito("-1");
        depositarConta.clicarRealizarDeposito();
        Assert.assertEquals(Integer.toString(saldoAtual), Integer.toString(clienteUtils.verificarSaldoTotalAtual()));
    }

}
