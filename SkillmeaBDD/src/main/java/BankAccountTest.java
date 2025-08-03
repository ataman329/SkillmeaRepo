import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    BankAccount prvniBankovniUcet;
    BankAccount druhyBankovniUcet;

    @Given("Uzivatel ma ucet s {int} Kc")
    public void uzivatelMaUcetSKc(int pocatecniZustatek) {
        prvniBankovniUcet = new BankAccount(pocatecniZustatek);
    }

    @When("Uzivatel vybere {int} Kc")
    public void uzivatelVybereKc(int castkaVyberu) {
        prvniBankovniUcet.withdraw(castkaVyberu);
    }

    @And("Uzivatel prevede na ucet {int} Kc")
    public void uzivatelPrevedeNaUcetKc(int castkaPrevodu) {
        prvniBankovniUcet.transfer(castkaPrevodu);
    }

    @Then("Uzivatel ma zustatek na uctu {int} Kc")
    public void uzivatelMaZustatekNaUctuKc(int konecnyZustatek) {
        assertEquals(konecnyZustatek, prvniBankovniUcet.getAccountBalance());
    }

    @Then("Operace byla zamitnuta pri pokusu o vyber castky {int} Kc")
    public void operaceBylaZamitnutaPriPokusuOVyberCastkyKc(int castkaVyberu) {
        //assertFalse(prvniBankovniUcet.withdraw(castkaVyberu));
        assertEquals((false), prvniBankovniUcet.withdraw(castkaVyberu));
    }

    @And("Uzivatel ma druhy ucet s {int} Kc")
    public void uzivatelMaDruhyUcetSKc(int pocatecniZustatek) {

    }

    @When("Uzivatel prevede z prvniho uctu na druhy {int} Kc")
    public void uzivatelPrevedeZPrvnihoUctuNaDruhyKc(int castkaPrevodu) {
        prvniBankovniUcet.withdraw(castkaPrevodu);
        druhyBankovniUcet.transfer(castkaPrevodu);
    }

    @And("Uzivatel prevede z druheho uctu na prvni {int} Kc")
    public void uzivatelPrevedeZDruhehoUctuNaPrvniKc(int castkaPrevodu) {
        druhyBankovniUcet.withdraw(castkaPrevodu);
        prvniBankovniUcet.transfer(castkaPrevodu);
    }

    @And("Uzivatel ma na druhem uctu {int} Kc")
    public void uzivatelMaNaDruhemUctuKc(int konecnyZustatek) {
        assertEquals(konecnyZustatek, druhyBankovniUcet.getAccountBalance());
    }
}