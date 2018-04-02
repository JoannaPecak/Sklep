package sklep;

public class Main {
    public static void main(String[] args) {
        Article produkt = new Article(3, "Mleko", "Mleko t³uste 3.5%", 3.5);
        out.println(produkt.toString());
        out.println(produkt.getCounter());

    }
}
