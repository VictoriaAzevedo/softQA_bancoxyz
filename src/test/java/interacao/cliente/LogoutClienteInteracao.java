package interacao.cliente;

import paginas.cliente.LogoutClientePagina;

public class LogoutClienteInteracao extends LogoutClientePagina {

    public void clicarBotaoLogout(){
        botaoLogout.click();
    }

    public String tituloPaginainicial(){
       return tituloPaginaInicial.getText();
    }

}
