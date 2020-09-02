package paginas.cliente;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HistoricoMovimentacoesPagina {

    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    protected WebElement botaoTransacoes;

    @FindBy(xpath = "(//button[@class='btn'])[2]")
    protected WebElement botaoReset;

    @FindBy(xpath = "//button[text()='Back']")
    protected WebElement botaoVoltar;
}
