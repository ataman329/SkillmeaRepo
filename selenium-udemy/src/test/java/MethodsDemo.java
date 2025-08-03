public class MethodsDemo {
    public static void main(String[] args) {
        // metody vysvetlovacky. metody sa pouzivaju aby sa neopakovali riadky kodu
        // vsetko napisane vo vnutri bloku zlozenych zatvoriek sa spusta
        // metody sa pisu MIMO hlavneho bloku

        // na zavolanie metody getData v bloku main musime vytvorit objekt triedy - object class zvany d
        MethodsDemo d = new MethodsDemo();
        // zavolanie metody getData a objektu d cez string zvany name - teda blok textu
        String name = d.getData();
        // vytlacenie stringu name
        System.out.println(name);
        // zavolanie inej metody z Demo2
        MethodsDemo2 d1 = new MethodsDemo2();
        d1.getUserData();
        getData2();


    }

    // metoda getData MIMO main bloku
    public String getData(){
        System.out.println("Hello World");
        return "Maly je ten svet";

    }

    public static String getData2(){
        System.out.println("Hello World");
        return "Maly je ten svet";
    }
}