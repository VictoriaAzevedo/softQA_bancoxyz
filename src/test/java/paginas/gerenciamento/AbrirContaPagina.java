package paginas.gerenciamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbrirContaPagina {

    @FindBy(xpath = "//button[text()='Bank Manager Login']")
    protected WebElement botaoGerenciamentoLogin;

    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    protected WebElement botaoAbrirConta;

    @FindBy(id="userSelect")
    protected WebElement selecaoCliente;

    @FindBy(id="currency")
    protected WebElement selecaoMoeda;

    @FindBy(xpath = "//button[text()='Process']")
    protected WebElement botaoEnviar;


}
