package paginas.cliente;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositarContaPagina {

    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    protected WebElement botaoDepositar;

    @FindBy(tagName = "input")
    protected WebElement valorDeposito;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement botaoEnviarDeposito;

    @FindBy(xpath = "//span[@ng-show='message']")
    protected WebElement mensagemSucesso;
}
