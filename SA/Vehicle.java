package SA;

public abstract class Vehicle {
    int maxPassenger;
    int currentPassenger;
    int currentSpeed;
    int gasAmount;
    int fare;
    boolean driving;

    public Vehicle(int maxPassenger, int fare, int gasAmount) {
        this.maxPassenger = maxPassenger; // 최대 승객
        this.currentPassenger = 0; // 현재 승객
        this.currentSpeed = 0; // 현재 속도
        this.gasAmount = gasAmount; // 주유량
        this.fare = fare; // 요금
        this.driving = true;
    }

    abstract void addPassenger(int count);  // 승객 증가 추상 메서드
    abstract void changeState();
    void startDrive() {
        boolean driving = true;
        System.out.println("운행 시작합니다.");
    }
    int getGasAmount(){
        return gasAmount;
    }
    int addGas(int gas){
        gasAmount += gas;
        return getGasAmount();
    }
    int minusGas(int gas){
        gasAmount -= gas;
        return getGasAmount();
    }
    void changeSpeed(int speed) {
        if (gasAmount < 10){
            System.out.println("주유량을 확인해 주세요");
            changeState();
        }else {
            if (speed < 0) {
                currentSpeed += speed;
                System.out.println("속도 감소 : " + currentSpeed);
            } else {
                currentSpeed += speed;
                System.out.println("속도 증가 : " + currentSpeed);
            }
        }
    }

}
