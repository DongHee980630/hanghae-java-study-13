package S.A;

public class TaxiMain extends Taxi{
    public TaxiMain(int maxPassenger, int fare, int gasAmount) {
        super(maxPassenger, fare, gasAmount);
    }

    public static void main(String[] args) {
        Taxi taxi = new Taxi(4,3000,100);
        Taxi taxi2 = new Taxi(4, 3000, 100);
        taxi.TaxiNumber();
        taxi2.TaxiNumber();
        taxi.startDrive();
        System.out.println("주유량 : " + taxi.getGasAmount());
        taxi.changeState();
        taxi.board(2,"서울역",2);
        System.out.println("주유량 : " + taxi.minusGas(80));
        taxi.pay();
        taxi.board(5,"가산디지철단지", 10);
        taxi.board(3,"구로디지철단지역", 12);
        System.out.println("주유량 : " + taxi.minusGas(20));
        taxi.pay();
        taxi.changeState();

    }
}
