import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*
        RodinnyDum dumNovaku = new RodinnyDum();
        dumNovaku.pocetOken = 10;
        dumNovaku.rozloha = 458.5f;
        dumNovaku.pocetPoschodi = 2;
        float cenaDomuNovaku = dumNovaku.vypocetCenyDomu(1800);

        RodinnyDum dumZajicu = new RodinnyDum();
        dumZajicu.pocetOken = 8;
        dumZajicu.rozloha = 236.3f;
        dumZajicu.pocetPoschodi = 3;
        float cenaDomuZajicu = dumZajicu.vypocetCenyDomu(0);

        System.out.println(cenaDomuNovaku + cenaDomuZajicu);
        */

        /*RodinnyDum dumPetru = new RodinnyDum( 458.5f, 2);
        float cenaDomuPetru = dumPetru.vypocetCenyDomu(1500);
        System.out.println(cenaDomuPetru);

        Obchod globus = new Obchod(1250.5f, 2, 25, 4);
        System.out.println(globus.vypocetCenyStavby());*/

        Pes alik = new Pes("Buldog", "Hneda", 15f, true);
        alik.vydejZvuk("Haf");
        alik.vydejZvuk("Vrrr");
        alik.vydejZvuk("Ahoj ja jsem pes");

        Stavba stavba = new Stavba();

    }
}