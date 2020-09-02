package testes.gerenciamento;

import interacao.gerenciamento.AbrirContaInteracao;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import utils.InstaciarDrive;

public class AbrirContaTeste extends InstaciarDrive {

    AbrirContaInteracao abrirConta = PageFactory.initElements(driver, AbrirContaInteracao.class);

    @Test
    public void novaContaSucesso(){
        abrirConta.clicarBotaoGerenciamentoLogin();
        esperarSegundos();
        abrirConta.clicarBotaoAbrirConta();
        abrirConta.selecionarCliente("Hermoine Granger");
        abrirConta.selecionarMoeda("Dollar");
        abrirConta.clicarBotaoEnviar();



        //Assert.assertEquals();
    }


}
