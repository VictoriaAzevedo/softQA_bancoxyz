package testes.cliente;

import interacao.cliente.HistoricoMovimentacoesInteracao;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import utils.ClienteUtils;
import utils.InstaciarDrive;

public class HistoricoMovimentacoesTeste extends InstaciarDrive {

    HistoricoMovimentacoesInteracao historicoMovimentacoes = PageFactory.initElements(driver, HistoricoMovimentacoesInteracao.class);
    ClienteUtils clienteUtils = new ClienteUtils();

    @Test
    public void excluirMovimentacoes(){
        clienteUtils.logarConta();
        historicoMovimentacoes.clicarBotaoTransacoes();
        historicoMovimentacoes.clicarBotaoReset();
        historicoMovimentacoes.clicarBotaoVoltar();

        Assert.assertEquals("0", Integer.toString(clienteUtils.verificarSaldoTotal()));

    }
}
