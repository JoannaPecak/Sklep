package sklep;

public class Gotowka implements Platnosc {
    @Override
    public boolean zaplac(double kwota){
        System.out.println("Przyjmuje gotoweczke");
        return true;
    }
}
