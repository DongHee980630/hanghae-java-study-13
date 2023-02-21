package src;

class Tv1_1{
    String color;
    boolean power = false;
    int channel = 1;

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

class Tv1_1Main{
    public static void main(String[] args) {
        Tv1_1 t1 = new Tv1_1();
        t1.color = "검정색";
        Tv1_1 t2 = new Tv1_1();
        t2.color = "흰색";

        System.out.println("TV1 인스턴스 색깔 = " + t1.color);
        System.out.println("TV2 인스턴스 색깔 = " + t2.color);

        t1.power();

        t2 = t1;
        System.out.println("TV1 인스턴스 색깔 = " + t1.color);
        System.out.println("TV2 인스턴스 색깔 = " + t2.color);
    }
}
class  Tv1_2{
    String color;
    boolean power = false;
    int channel = 1;
    String barand;

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

class Tv1_2Main{
    public static void main(String[] args) {
        Tv1_2[] tvArr = new Tv1_2[3];

        tvArr[0] = new Tv1_2();
        tvArr[1] = new Tv1_2();
        tvArr[2] = new Tv1_2();

        tvArr[0].color = "보라색";
        tvArr[1].color = "주황색";
        tvArr[2].color = "핑크색";

        for (int i = 0; i < tvArr.length; i++) {
            System.out.println(i+1+ "번째 Tv인스턴스 색깔:" + tvArr[i].color);
        }

        for (int i = 0; i < tvArr.length ; i++) {
            System.out.print(i + 1 +"번째 Tv인스턴스");
            tvArr[i].power();
        }
        System.out.println();
        for (int i = 0; i < tvArr.length; i++) {
            System.out.print(i+1 + "번째 Tv인스턴스의 브랜드 명 :");
            System.out.println(tvArr[i].barand);
        }
        System.out.println();

        Tv1_2 samsung = tvArr[0];
        Tv1_2 lg = tvArr[1];
        Tv1_2 apple = tvArr[2];

        samsung.barand = "samsung";
        lg.barand = "lg";
        apple.barand = "apple";

        for (int i = 0; i < tvArr.length; i++){
            System.out.print(i + 1 + "번째 Tv인스턴스의 브랜드 명 :");
            System.out.println(tvArr[i].barand);
        }
    }
}
class NoneClassTime{
    public static void main(String[] args) {
        int hour1, hour2, hour3;
        int minute1, minute2, minute3;
        int second1, second2, second3;

        int[] hour = new int[3];
        int[] minute = new int[3];
        int[] second = new  int[3];
    }
}
class Time3_1{
    int hour;
    int minute;
    int second;
}
class Time3_1Main{
    public static void main(String[] args) {
        Time3_1 t1 = new Time3_1();
        Time3_1 t2 = new Time3_1();
        Time3_1 t3 = new Time3_1();

        Time3_1[] timeArr = new Time3_1[3];
        timeArr[0] = new Time3_1();
        timeArr[1] = new Time3_1();
        timeArr[2] = new Time3_1();
    }
}
class obj4_1{
     int iv;
     static int cv;
     void method(){
         int lv;
         lv = 30;
         System.out.println("lv 지역변수 = " + lv);
     }
}
class obj4_1Main{
    public static void main(String[] args) {
        obj4_1.cv =10;
        System.out.println("objVar.cv 클래스 변수 =" + obj4_1.cv);

        obj4_1 objVar = new obj4_1();
        objVar.iv = 20;
        System.out.println("objVar.iv 인스턴스 변수 = " + objVar.iv);

        objVar.method();
    }
}
class Method5_1Main{
    public static void main(String[] args) {
        Method5_1 method = new Method5_1();

        int result  = method.add(3,5);
        System.out.println("result = " + result);
    }
}

class Method5_2{
    void gugudan(int dan){
        if (!(dan >= 2 && dan <=9)){
            System.out.println(dan + "단은 없습니다");
            return;
        }
        System.out.println(dan+ "단 시작!");
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + " = " + dan * i);
        }
        System.out.println();
    }
    boolean checkMax(int x, int y){
        if (x > y){
            return true;
        }else {

            return false;
        }
    }
}
class Method5_2Main{
    public static void main(String[] args) {
        Method5_2 method = new Method5_2();

        method.gugudan(2);
        method.gugudan(5);
        method.gugudan(10);
        method.gugudan(9);

        System.out.println("method.checkMax(10, 8) = " + method.checkMax(10,8));
        System.out.println("method.checkMax(8, 9) = " + method.checkMax(5,9));

    }
}

class Method5_3{
    static void initobj(Time3_1 time, int hour, int minute, int second){
        time.hour = hour;
        time.minute = minute;
        time.second = second;
    }
}
class Method5_3Main{
    public static void main(String[] args) {
        Time3_1 t1 = new Time3_1();
        t1.hour = 100;
        t1.minute = 20;
        t1.second = 43;

        Time3_1 t2 = new Time3_1();
        t2.hour = 22;
        t2.minute = 30;
        t2.second = 23;

        Time3_1 t3 = new Time3_1();
        t3.hour = 45;
        t3.minute = 40;
        t3.second = 52;
        System.out.println("t1.hour = " + t1.hour);
        System.out.println("t2.hour = " + t2.hour);
        System.out.println("t3.hour = " + t3.hour);
        System.out.println();

        Time3_1 t4 = new Time3_1();
        Time3_1 t5 = new Time3_1();
        Time3_1 t6 = new Time3_1();

        Method5_3.initobj(t4, 100, 20,40);
        Method5_3.initobj(t5, 22, 30,23);
        Method5_3.initobj(t6, 45, 40,52);
        System.out.println("t4.hour = " + t4.hour);
        System.out.println("t5.hour = " + t5.hour);
        System.out.println("t6.hour = " + t6.hour);

    }
}
class CallStack5_1{
    static void firstMethod(){
        System.out.println("firstMethod()");
        secondMethod();
    }
    static void secondMethod(){
        System.out.println("secondMethod()");
        thirdMethod();
    }
    static void thirdMethod(){
        System.out.println("thirdMethod()");
        finalMethod();
    }
    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}

class CallStack5_2 {

    static void firstMethod() {
        secondMethod();
        System.out.println("firstMethod()");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("secondMethod()");
    }

    static void thirdMethod() {
        finalMethod();
        System.out.println("thirdMethod()");
    }

    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}

class Data6_1 {
    int x; // 기본형
    int y; // 기본형
}

class Data6_1Main {
    public static void main(String[] args) {

        Data6_1 data  = new Data6_1();
        data.x = 10;
        data.y = 20;

        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수 x, y 값 확인");
        System.out.println("data 인스턴스 변수 x = " + data.x);
        System.out.println("data 인스턴스 변수 y = " + data.y);
        System.out.println();

        // changeParameter 메서드 의 매개변수에 Data 클래스의 인스턴스 변수를 입력한다.
        System.out.println("입력받은 매개변수의 값을 바꾸는 메서드 수행");
        changeParameter(data.x, data.y);
        System.out.println();

        // changeParameter(data.x, data.y); 여기서의 data.x 와 data.y 는
        // data 의 인스턴스 변수의 값 그자체가 복사되어 넘어갑니다.
        // 따라서 changeParameter 메서드에서 입력받은 매개변수의 값을 바꿔도
        // 영향을 받지 않습니다.
        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수의 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 x = " + data.x);
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 y = " + data.y);
    }

    static void changeParameter(int x, int y) {
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 x 와 y의 값 확인");
        System.out.println("입력 받은 매개변수 x = " + x);
        System.out.println("입력 받은 매개변수 y = " + y);

        System.out.println();
        System.out.println("입력 받은 매개변수 x 와 y의 값을 변경 한 후 확인");
        x = 100;
        y = 200;
        System.out.println("변경 한 후 x = " + x);
        System.out.println("변경 한 후 y = " + y);
        System.out.println("changeParameter 메서드 끝");
    }
}

class Data6_2 {
    Data6_3  data2 = new Data6_3(); // 참조형
}

class Data6_3 {
    int x; // 기본형
    int y; // 기본형
}

class Data6_2Main {
    public static void main(String[] args) {

        Data6_2 data  = new Data6_2();
        data.data2.x = 10;
        data.data2.y = 20;

        System.out.println("Data6_2 클래스로 만든 data 인스턴스의 data2인스턴스의 인스턴스 변수 값 확인");
        System.out.println("참조변수 data2의 인스턴스 변수 x = " + data.data2.x);
        System.out.println("참조변수 data2의 인스턴스 변수 y = " + data.data2.y);
        System.out.println();

        // changeParameter 메서드 의 매개변수에 Data6_2 클래스의 참조형 변수인 data2 를 입력
        System.out.println("입력받은 매개변수의 값을 바꾸는 메서드 수행");
        changeParameter(data.data2);
        System.out.println();

        // changeParameter(Data6_3 data2); 여기서 data.data2 는
        // data 인스턴스의 참조형 변수 data2의 주소값이 넘어 갑니다.
        // 따라서 changeParameter 메서드에서 입력받은 data2의 주소값을 통해
        // data2 의 인스턴스에 접근하여 인스턴스 변수를 바꾸기 때문에 영향을 받습니다.
        System.out.println("Data6_3 클래스로 만든 data 인스턴스의 참조변수 data2의 인스턴스 변수 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data2의 인스턴스 변수 x = " + data.data2.x);
        System.out.println("changeParameter 메서드 수행 후 data2의 인스턴스 변수 y = " + data.data2.y);
    }

    static void changeParameter(Data6_3 data2) {
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x 와 y의 값 확인");
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x = " + data2.x);
        System.out.println("입력 받은 매개변수 data2의 인스턴스 y = " + data2.y);

        System.out.println();
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x 와 y의 값을 변경 한 후 확인");
        data2.x = 100;
        data2.y = 200;
        System.out.println("변경 한 후 data2의 인스턴스 x = " + data2.x);
        System.out.println("변경 한 후 data2의 인스턴스 y = " + data2.y);
        System.out.println("changeParameter 메서드 끝");
    }
}