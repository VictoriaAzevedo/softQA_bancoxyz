package paginas.gerenciamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExcluirCadastroPagina {

    @FindBy(xpath = "//button[text()='Bank Manager Login']")
    protected WebElement botaoGerenciamentoLogin;

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    protected WebElement botaoClientes;

    @FindBy(tagName = "input")
    protected WebElement buscarCliente;

    @FindBy(xpath = "//button[text()='Delete']")
    protected WebElement botãoExcluir;
}
