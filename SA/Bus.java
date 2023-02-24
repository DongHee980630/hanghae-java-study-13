package SA;

public class Bus extends Vehicle{
    int busNumber = 1;



    public Bus(int maxPassenger, int fare, int gasAmount) {
        super(maxPassenger, fare, gasAmount);
    }
    public void BusNumber() {
        busNumber = (int)(Math.random()*100+1); //고유번호 랜덤으로 부여
        System.out.println( busNumber + "번 버스 생성");
    }
    void changeState() {
        driving = !driving;
        if (gasAmount < 10) {
            System.out.println("주유가 필요합니다.");
            return;
        }
        if(driving == false){
            System.out.println("차고지행");
        }else {
            System.out.println("운행 중");
        }
    }

    @Override
    void addPassenger(int count) {
        if (!driving) {
            System.out.println("운행 중이 아닙니다.");
            return;
        }
        int totalPassenger = currentPassenger + count;
        if (totalPassenger > maxPassenger){
            System.out.println("최대 승객수를 초과");
            return;
        }
        currentPassenger = totalPassenger;
        System.out.println("탑승 승객 수 :" +count);
        System.out.println("잔여 승객 수 :" + (maxPassenger- totalPassenger));
        System.out.println("현재 승객수 :" + totalPassenger);
        System.out.println("요금 : " + count * fare);
    }

}
