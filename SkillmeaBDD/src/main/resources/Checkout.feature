Feature: Checkout

  Scenario: Nakup bananu
    Given cena "bananu" je 10 kc
    When koupim "banany" v poctu 5
    Then celkova cena nakupniho kosiku je 50 kc

  Scenario: Nakup bananu a jablek
    Given cena "banany" je 5 kc
    And cena "jablek" je 20 kc
    When koupim "banany" v poctu 2
    When  koupim "jablek" v poctu 2
    Then celkova cena nakupniho kosiku je 70 kc

  Scenario Outline: Nakup bananu a jablek
    Given cena "banany" je <cenaBananu> kc
    And cena "jablek" je <cenaJablek> kc
    When koupim "banany" v poctu <pocetBananu>
    And koupim "jablek" v poctu <pocetJablek>
    Then celkova cena nakupniho kosiku je <celkovaCena> kc

    Examples:
      | cenaBananu | cenaJablek | pocetBananu | pocetJablek | celkovaCena |
      | 20         | 15         | 3           | 2           | 90          |


  Scenario: Nakup