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
    public void incializarTestes(){
        clienteUtils.logarConta();
        depositarConta.clicarDeposito();
    }

    @Test
    public void depositarContaSucesso(){
        depositarConta.informarValorDeposito(clienteUtils.gerarValorDeposito());
        depositarConta.clicarRealizarDeposito();

        Assert.assertEquals("Deposit Successful", depositarConta.mensagemDepositoSucesso());
    }

    @Test
    public void verificarValorDepositadoConta(){
        String valorDepositar = clienteUtils.gerarValorDeposito();
        int saldoAtual = clienteUtils.verificarSaldoTotal();
        depositarConta.informarValorDeposito(valorDepositar);
        depositarConta.clicarRealizarDeposito();

        Assert.assertEquals(clienteUtils.valorSaldoAtualizadoDeposito(valorDepositar, saldoAtual), Integer.toString(clienteUtils.verificarSaldoTotal()));
    }

    @Test
    public void depositarValorNegativo(){
        int saldoAtual = clienteUtils.verificarSaldoTotal();
        depositarConta.informarValorDeposito("-1");
        depositarConta.clicarRealizarDeposito();

        Assert.assertEquals(Integer.toString(saldoAtual), Integer.toString(clienteUtils.verificarSaldoTotal()));
    }

}
