package interacao.cliente;

import paginas.cliente.ClienteGeralPagina;

public class ClienteGeralInteracao extends ClienteGeralPagina {

    public String informacoesConta(int informacao){
        String [] st = informacoesConta.getText().split(",");
        return st[informacao];
    }
}
