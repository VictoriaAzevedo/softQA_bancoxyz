package paginas.cliente;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogarClientePagina {

    @FindBy(xpath = "//button[text()='Customer Login']")
    protected WebElement botaoLoginCliente;

    @FindBy(id = "userSelect")
    protected WebElement selecionarCliente;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement botaoLogin;

    @FindBy(xpath = "//strong[text()=' Welcome ']")
    protected WebElement mensagemLogin;

}
