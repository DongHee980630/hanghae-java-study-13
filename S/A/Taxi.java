package S.A;

public class Taxi extends Vehicle {
    String destination; // 목적지
    int distance;//목적지 까지거리
    int defaultDistance = 1; //기본 거리
    int distanceFare = 1000; // 거리당 요금
    int taxiNumber;
    int cost;
    int total;


    public Taxi(int maxPassenger, int fare, int gasAmount) {
        super(maxPassenger, fare, gasAmount);
    }



    public void TaxiNumber() {
        taxiNumber = (int)(Math.random()*100+1);
        System.out.println(taxiNumber + "번 택시 생성");
    }
    @Override
    void addPassenger(int count) {
       if (count > 4){
           System.out.println("승객 초과");
       }
        System.out.println("탑승 승객 수 :" +count);
        System.out.println("잔여 승객 수 :" + (4 - count));
    }

    @Override
    void changeState() {
        if (gasAmount < 10) {
            driving = !driving;
            System.out.println("주유가 필요합니다.");
            driving = false;
            System.out.println("상태 = 운행 불가");
        } else {
            System.out.println("상태 = 일반");
        }
    }
    void board(int count, String dest, int dis){
        if(count > 4)
            System.out.println("최대 승객 수 초과");
        else
        if (driving ==true){
           cost = fare + (distanceFare * dis);
           total += cost;
            System.out.println("기본 요금 확인 = "+fare);
            System.out.println("목적지 = " + dest);
            System.out.println("목적지까지 거리 = "+ dis+"km");
            System.out.println("지불할 요금 = "+cost);
            System.out.println("운행중");
        }
    }
    int pay() {
        System.out.println("누적 요금 = "+ total);
        if(gasAmount < 10)
            System.out.println("주유 필요");
        cost = 0;
        return total;
    }
}
