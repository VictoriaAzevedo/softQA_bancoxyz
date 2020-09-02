package paginas.cliente;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClienteGeralPagina {

    @FindBy(xpath = "//div[@class='center']")
    protected WebElement informacoesConta;
}
