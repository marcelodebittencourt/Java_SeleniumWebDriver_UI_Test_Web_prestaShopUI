package uitest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class PrestaShopTest {

    private WebDriver driver;

    @BeforeEach
    public void preCondicoes() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void posCondicoes() {
        driver.quit();
    }

    @Test
    public void abrePaginaInicial() {
        HomePage homePage = new HomePage(driver);

        homePage.carregaPaginaInicial();

        assertThat(homePage.obterTituloDaPaginaWeb(), is("Loja de Teste"));
        assertThat(homePage.obterTextoElemento_textoPopularProducts(), is("POPULAR PRODUCTS"));
        assertThat(homePage.obterTextoElemento_textoCustomTextBlock(), is("CUSTOM TEXT BLOCK"));

    }

}
