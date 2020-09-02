package paginas.cliente;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutClientePagina {

    @FindBy(xpath = "//button[@class='btn logout']")
    protected WebElement botaoLogout;

    @FindBy(tagName = "label")
    protected WebElement tituloPaginaInicial;
}
