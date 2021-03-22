package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    By textoPopularProducts = By.xpath("//*[@id=\"content\"]/section/h2");

    By textoCustomTextBlock = By.xpath("//*[@id=\"custom-text\"]/h2");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String obterTituloDaPaginaWeb() {
        return driver.getTitle();
    }

    public String obterTextoElemento_textoPopularProducts() {
        return driver.findElement(textoPopularProducts).getText();
    }

    public String obterTextoElemento_textoCustomTextBlock() {
        return driver.findElement(textoCustomTextBlock).getText();
    }

    public void carregaPaginaInicial() {
        driver.get("https://marcelodebittencourt.com/demoprestashop/");
    }

}
