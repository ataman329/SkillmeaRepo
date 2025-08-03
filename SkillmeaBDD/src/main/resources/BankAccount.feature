Feature: BankAccount

  Scenario: Prevod z a na ucet
    Given Uzivatel ma ucet s 1000 Kc
    When Uzivatel vybere 500 Kc
    And Uzivatel prevede na ucet 1500 Kc
    Then Uzivatel ma zustatek na uctu 2000 Kc

    Scenario: Prevod z uctu
      Given Uzivatel ma ucet s 10000 Kc
      When Uzivatel vybere 1500 Kc
      Then Uzivatel ma zustatek na uctu 8500 Kc

  Scenario: Vyber vice penez nez je na uctu
    Given Uzivatel ma ucet s 1000 Kc
    When Uzivatel vybere 500 Kc
    Then Operace byla zamitnuta pri pokusu o vyber castky 500 Kc
    And Uzivatel ma zustatek na uctu 500 Kc

  Scenario: Prevod mezi vice ucty
    Given Uzivatel ma ucet s 1000 Kc
    And Uzivatel ma druhy ucet s 2000 Kc
    When Uzivatel prevede z prvniho uctu na druhy 1000 Kc
    And Uzivatel prevede z druheho uctu na prvni 500 Kc
    Then Uzivatel ma zustatek na uctu 500 Kc
    And Uzivatel ma na druhem uctu 2500 Kc

Scenario Outline: Prevod z a na ucet - vice moznosti
  Given Uzivatel ma ucet s <zustatekNaUctu> Kc
  When Uzivatel vybere <castkaVyberu> Kc
  And Uzivatel prevede na ucet <castkaPrevodu> Kc
  Then Uzivatel ma zustatek na uctu <finalniZustatekNaUctu> Kc

  Examples:
    | zustatekNaUctu | castkaVyberu | castkaPrevodu | finalniZustatekNaUctu |
    | 10000          | 5000         | 15000         | 20000                 |
    | 1000           | 500          | 1500          | 2000                  |
    | 300            | 200          | 500           | 600                   |
