package utils;

import interacao.cliente.ClienteGeralInteracao;
import interacao.cliente.LogarClienteInteracao;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ClienteUtils extends InstaciarDrive{

    LogarClienteInteracao loginCliente = PageFactory.initElements(driver, LogarClienteInteracao.class);
    ClienteGeralInteracao cliente = PageFactory.initElements(driver, ClienteGeralInteracao.class);

   //public void logarConta(){
   //    loginCliente.clicarLoginCliente();
   //    esperarSegundos();
   //    loginCliente.selecionarNomeCliente(nomeClientes());
   //    loginCliente.clicarLogin();
   //}

    public void logarConta(){
        loginCliente.clicarLoginCliente();
        esperarSegundos();
        loginCliente.selecionarNomeCliente("Hermoine Granger");
        loginCliente.clicarLogin();
    }

    public int verificarSaldoTotal(){
        String informacao = cliente.informacoesConta(1);
        String [] st = informacao.split(":");
        return Integer.parseInt(st[1].trim());

    }

    public String gerarValorSaqueMenorSaldo(){
        Random random = new Random();
        int valorMaximo = verificarSaldoTotal();
        int valorSaque = (int)(random.nextInt(valorMaximo - 1)+1);
        return Integer.toString(valorSaque);
    }

    public String gerarValorSaqueMaiorSaldo(){
        int valorMaximo = verificarSaldoTotal();
        int valorSaque = valorMaximo + 1;
        return Integer.toString(valorSaque);
    }

    public String gerarValorDeposito(){
        Random random = new Random();
        int valorDeposito = (int)(random.nextInt(900 - 1)+1);
        return Integer.toString(valorDeposito);
    }

   public String nomeClientes(){
        Random random = new Random();
        List<String> nomes = Arrays.asList("Hermoine Granger", "Harry Potter", "Ron Weasly", "Albus Dumbledore", "Neville Longbottom");
        int nomeSorteado = (int)(random.nextInt(nomes.size() - 0) +0);
        return nomes.get(nomeSorteado);
   }

   public String valorSaldoAtualizadoDeposito(String valorDepositado, int saldoTotal){
        int saldoAtual = saldoTotal;
        int valor = Integer.valueOf(valorDepositado);

        return Integer.toString(saldoAtual + valor);
   }

    public String valorSaldoAtualizadoSaque(String valorDepositado, int saldoTotal){
        int saldoAtual = saldoTotal;
        int valor = Integer.valueOf(valorDepositado);

        return Integer.toString(saldoAtual - valor);
    }


}
