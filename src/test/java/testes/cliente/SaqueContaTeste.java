package testes.cliente;

import interacao.cliente.SaqueContaInteracao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import utils.ClienteUtils;
import utils.InstaciarDrive;

public class SaqueContaTeste extends InstaciarDrive {

    ClienteUtils clienteUtils = new ClienteUtils();
    SaqueContaInteracao saqueConta = PageFactory.initElements(driver, SaqueContaInteracao.class);

    @Before
    public void inicializar(){
        clienteUtils.logarContaClienteFixo();
        saqueConta.clicarSaque();
    }

    @Test
    public void sacarValorPermitido(){
        saqueConta.informarValorSaque(clienteUtils.gerarValorSaqueMenorSaldo());
        saqueConta.clicarRealizarSaque();
        Assert.assertEquals("Transaction successful", saqueConta.retornarMensagem());
    }

    @Test
    public void verificarSaldoAposSaque(){
        int saldoAtual = clienteUtils.verificarSaldoTotalAtual();
        String valorSaque = clienteUtils.gerarValorSaqueMenorSaldo();
        saqueConta.informarValorSaque(valorSaque);
        saqueConta.clicarRealizarSaque();
        Assert.assertEquals(clienteUtils.valorSaldoAtualizadoSaque(valorSaque, saldoAtual), Integer.toString(clienteUtils.verificarSaldoTotalAtual()));
    }

    @Test
    public void sacarValorAcimaSaldo(){
        saqueConta.informarValorSaque(clienteUtils.gerarValorSaqueMaiorSaldo());
        saqueConta.clicarRealizarSaque();
        Assert.assertEquals("Transaction Failed. You can not withdraw amount more than the balance.", saqueConta.retornarMensagem());
    }


}
