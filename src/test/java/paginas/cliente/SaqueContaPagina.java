package paginas.cliente;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaqueContaPagina {

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    protected WebElement botaoSaque;

    @FindBy(tagName = "input")
    protected WebElement valorSaque;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement botaoEnviarSaque;

    @FindBy(xpath = "//span[@ng-show='message']")
    protected WebElement mensagemRetorno;

}
