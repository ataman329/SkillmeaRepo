import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.Checkout;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTest {

    Checkout nakupniKosik;

    @Before
    public void nastaveniTestu(){
    }

    @Given("cena {string} je {int} kc")
    public void cenaJeKc(String nazevZbozi, int cenaZbozi) {
        nakupniKosik = new Checkout();
        nakupniKosik.addItem(nazevZbozi, cenaZbozi);
    }

    @When("koupim {string} v poctu {int}")
    public void koupimVPoctu(String nazevZbozi, int pocetZbozi) {
        nakupniKosik.scanItems(nazevZbozi, pocetZbozi);
    }

    @Then("celkova cena nakupniho kosiku je {int} kc")
    public void celkovaCenaNakupnihoKosikuJeKc(int predpokladanaCenaKosiku) {
    }
}
