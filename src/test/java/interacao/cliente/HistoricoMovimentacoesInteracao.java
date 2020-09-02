package interacao.cliente;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import paginas.cliente.HistoricoMovimentacoesPagina;

public class HistoricoMovimentacoesInteracao extends HistoricoMovimentacoesPagina {

    public void clicarBotaoTransacoes(){
        botaoTransacoes.click();
    }

    public void clicarBotaoReset(){
        botaoReset.click();
    }

    public void clicarBotaoVoltar(){
        botaoVoltar.click();
    }

}
