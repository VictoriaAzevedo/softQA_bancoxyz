package interacao.cliente;

import paginas.cliente.SaqueContaPagina;

public class SaqueContaInteracao extends SaqueContaPagina {

    public void clicarSaque(){
        botaoSaque.click();
    }

    public void informarValorSaque(String valor){
        valorSaque.sendKeys(valor);
    }

    public void clicarRealizarSaque(){
        botaoEnviarSaque.click();
    }

    public String retornarMensagem(){
        return mensagemRetorno.getText();
    }
}
