package src;

class StaticMethod7_1{
    int num1, num2;

    static int add(int num1, int num2){
        System.out.println();
        System.out.println("매개변수로 입력 받은 num1, num2 확인");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println();
        System.out.println("num1 + num2 = " + (num1 + num2));
        return num1 + num2; //return 필수 void가 아니기때문에
    }
}
class StaticMethod7_1Main{
    public static void main(String[] args) {
        StaticMethod7_1 methodTest = new StaticMethod7_1();
        methodTest.num1 = 10;
        methodTest.num2 = 20;
        // 클래스이름.메서드이름() 방식으로 static 메서드를 호출
        StaticMethod7_1.add(methodTest.num1, methodTest.num2);
    }
}
class InstMethod7_1{
    int num1, num2; //인스턴스 변수
    static int num3 = 100; //클래스 변수

    int add(int num1, int num2){
        System.out.println();
        System.out.println("매개변수로 입력 받은 num1, num2 확인");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("this.num1 = " + this.num1);
        System.out.println("매개변수 이자 지역변수 num1 = " + num1);

        return num1 + num2;
    }
}

class InstMethod7_1Main{
    public static void main(String[] args) {
        InstMethod7_1 methodTest = new InstMethod7_1();
        methodTest.num1 = 10;
        methodTest.num2 = 20;

        System.out.println("result : " + methodTest.add(methodTest.num1, methodTest.num2));
    }
}

class Overloading8_1{
    int add(int a, int b){
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    long add(long a, long b){
        System.out.println("long add(long a, long b)");
        return a + b;
    }
    long add(long a, int b) {
        System.out.println("long add(long a, int b)");
        return a + b;
    }
    long add(int a, long b) {
        System.out.println("long add(int a, long b)");
        return a + b;
    }
}

class Overloading8_1Main{
    public static void main(String[] args) {
        Overloading8_1 test = new Overloading8_1();
        System.out.println(test.add(10,20));
        System.out.println(test.add(13L,17L));
        System.out.println(test.add(5L,10));
        System.out.println(test.add(12,23L));
        System.out.println();
        test.add(10,20);
    }
}
class Tv9_1{
    boolean power;
    int channel;
    String color;
    long price;
    public Tv9_1(){
        power = false;
        channel = 1;
    }
    public Tv9_1(String color, long price){
        power = false;
        channel = 1;
        this.color = color;
        this.price = price;
    }

    void power(){
        power = !power;
        if (power){
            System.out.println("전원 ON");
        }else {
            System.out.println("전원 OFF");
        }
    }
    void channelUp(){
        channel++;
        System.out.println("채널 증가");
    }
    void channelDown(){
        channel--;
        System.out.println("채널 감소");
    }
}
class Tv9_1Main{
    public static void main(String[] args) {
        Tv9_1 tv = new Tv9_1();
        System.out.println("기본 생성자 TV : ");
        tv.power();

        Tv9_1 extv = new Tv9_1("보라색", 3456789);
        System.out.println("오버로딩 생성자 TV :");
        extv.power();
        System.out.println(extv.color);
        System.out.println(extv.price);


    }
}
class Tv10_1{
    boolean power;
    int channel;
    String color;
    long price;

    public Tv10_1(){
        this.power = false;
        this.channel = 1;
    }

    public Tv10_1(String color, long price){
        this.power = false;
        this.channel = 1;
        this.color = color;
        this.price = price;
    }
    void power(){
        this.power = !power;
        if (this.power){
            System.out.println("전원 ON");
        }else {
            System.out.println("전원 OFF");
        }
    }
    void channelUp(){
        channel++;
        System.out.println("채널 증가");
    }
    void channelDown(){
        channel--;
        System.out.println("채널 감소");
    }
     Tv10_1 changeColor(String color){
        this.color = color;
        System.out.println("색깔 변경 완료!");
        return this;
    }
}
class Tv10_1Main{
    public static void main(String[] args) {
        Tv10_1 tv = new Tv10_1();
        System.out.println("기본 생성자 tv:");
        tv.power();

        Tv10_1 extv = new Tv10_1("보라색",3456789);
        System.out.println("오버로딩 생성자 :");
        extv.power();
        System.out.println("색깔 : " + extv.color);
        System.out.println("가격 : " + extv.price);
        System.out.println();

        extv.changeColor("파랑색");
        System.out.println(extv.color);

    }
}
class Tv10_2 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    public Tv10_2() {
        this.power = false;
        this.channel = 1;
    }

    //  오버로딩 한 생성자 - 매장 진열 용 일 경우에는 가격과 색깔의 초기화가 필요합니다.
    public Tv10_2(String color, long price) {
        // 아래 초기화 내용은 위에 기본생성자와 완전히 똑같습니다.
        // 이럴 때 this() 를 사용합니다.
        // this.power = false;
        // this.channel = 1;

        this(); // 기본 생성자를 호출합니다.
        // Tv10_2() // 이렇게는 불가능 합니다!

        this.color = color;
        this.price = price;

        // this(); // 생성자 호출은 반드시 첫 줄에서만 가능합니다.
    }

    // 기능 : 메서드 선언
    void power() {  // 전원 기능
        this.power = !power;
        if (this.power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() { // 채널 증가
        this.channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { // 채널 감소
        this.channel--;
        System.out.println("채널 감소");
    }

    // 색깔을 수정하고 자기 자신을 반환하는 메서드
    Tv10_2 changeColor(String color) { // 반환 타입으로 자기자신인 Tv 선언
        this.color = color;
        System.out.println("색깔 변경 완료!");
        return this; // this 는 자기 자신을 가리키는 참조변수!
    }

}

class Tv10_2Main {
    public static void main(String[] args) {
        // 기본 초기화된 Tv10_2 생성
        Tv10_2 tv = new Tv10_2();
        System.out.print("기본 생성자 Tv10_2: ");
        tv.power();

        // 진열 용 Tv10_2 생성
        Tv10_2 exTv = new Tv10_2("보라색", 3456789);
        System.out.print("오버로딩 생성자 Tv10_2: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);
        System.out.println();

        // 진열 용 Tv10_2 의 색깔을 수정하고 수정된 객체를 참조변수에 저장하겠습니다.
        Tv10_2 exTvThis = exTv.changeColor("파란색");
        // 색깔이 변경된 Tv의 주소가 저장된 참조변수 exTvThis 를 사용하여 변경된 색깔 확인
        System.out.println("색깔이 변경되었는지 확인 exTvThis.color : " + exTvThis.color);
        // 당연히 exTv 이걸로 확인해도 색깔이 변경되어 있습니다.
        System.out.println("exTv.color = " + exTv.color);
    }
}

//명시적 초기화 (=)
class Tv11_1 {
    boolean power = false;    // 기본형 변수의 초기화
    int channel = 1;          // 기본형 변수의 초기화
//    Audio audi = new Audio(); // 참조형 변수의 초기화, 참조형은 객체주소 or null 로 초기화!!
    // 참조형의 기본값은 null 입니다!!
}

//초기화 블럭
class Tv11_2 {
    static boolean power;
    int channel;

    // 클래스 초기화 블럭
    static
    {
        power = false;
    }

    // 인스턴스 초기화 블럭
    {
        channel = 1;
    }
}

//생성자 초기화
class Tv11_3 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    Tv11_3() {
        this.power = false;
        this.channel = 1;
    }
}