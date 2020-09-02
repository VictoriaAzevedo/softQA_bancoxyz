package paginas.cliente;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlterarContaPagina {

    @FindBy(id = "accountSelect")
    protected WebElement selecaoConta;

    @FindBy(xpath = "//div[@class='center']")
    protected WebElement informacoesConta;

}
