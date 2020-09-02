package paginas.gerenciamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroClientePagina {

    @FindBy(xpath = "//button[text()='Bank Manager Login']")
    protected WebElement botaoGerenciamentoLogin;

    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    protected WebElement botaoAdicionarCliente;

    @FindBy(xpath = "//input[@ng-model='fName']")
    protected WebElement campoNome;

    @FindBy(xpath = "//input[@ng-model='lName']")
    protected  WebElement campoSobrenome;

    @FindBy(xpath = "//input[@ng-model='postCd']")
    protected  WebElement campoCep;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement botãoSalvar;
}
