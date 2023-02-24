package S.A;

public class BusMain extends Bus{
    public BusMain(int maxPassenger, int fare, int gasAmount) {
        super(maxPassenger, fare, gasAmount);
    }
    public static void main(String[] args) {
        Bus bus = new Bus(45,1500,100);
        Bus bus2 = new Bus(30, 1000,80);
        bus.BusNumber();
        bus2.BusNumber();
        bus.startDrive();
        bus.addPassenger(2);
        System.out.println("주유량 : " + bus.minusGas(50));
        bus.changeState();
        System.out.println("주유량 : " + bus.addGas(10));
        bus.changeState();
        bus.addPassenger(45);
        bus.addPassenger(5);
        System.out.println("주유량 : " +bus.minusGas(55));
        bus.changeState();
        System.out.println("주유량 : " +bus.addGas(60));
        bus.changeState();
        bus.changeSpeed(60);
        bus.changeSpeed(-20);

    }
}
