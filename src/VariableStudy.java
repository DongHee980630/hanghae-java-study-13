package src;

import java.util.Date;

public class VariableStudy {

}
class Variable1_1{
    boolean flag;           //변수의 선언
    char grade;             //선언을 하는 이유 : 메모리에 값을 저장할 공간을 마련하기 위해서 선언을 합니다.
    byte val;               //선언 방법 : 변수타입 변수이름;
    short sval;             //nt age; int num; or int age, num;
    int num;
    long price;
    float tax;
    double score;
}

class Variable1_2{
    public static void main(String[] args) {
        boolean flag = false;
        char grade = 'A';           //변수의 초기화
        byte val = 127;             //변수에 값을 저장하는 방법 : 변수타입 변수이름 = 값;
        short sval = 128;           //int age; age = 23; or int age = 23; or int age = 23, num = 32768;
        int num = 32768;            //초기화 : 변수에 처음으로 값을 저장하는 것을 의미합니다.
        long price = 2_147_483_648L;
        float tax = 3.14F;
        double score = 3.1415926538456421;

        System.out.println("boolean = " + flag);
        System.out.println("char = " + grade);
        System.out.println("val = "+ val);
        System.out.println("short = " + sval);
        System.out.println("int = " + num);
        System.out.println("long = " + price);
        System.out.println("float = " + tax);
        System.out.println("doubl = " + score);

    }
}

class Variable1_3{
    public static void main(String[] args) {
        int year, age = 23;

        year = age + 2000;
        System.out.println("year = " + year); //2023
        // 변수의 값을 읽어오는 과정
        // year = age + 2000;
        // year = 23 + 2000;
        // year = 2023;

        age = age + 1;
        System.out.println("age = " + age); //24
        System.out.println("year = " + year);
        // 프로그램은 순차적으로 코드가 실행되기 때문에
        // 여기서 age의 값이 바뀌었다고 year에 영향을 주지 않는다.
    }
}
class Variable1_4{
    static int classVal = 100;//클래스변수
    int instanceVal = 200;//인스턴스 변수

    public static void main(String[] args) {
        int num; //지역변수
        num = 300;                                  //변수의 종류에는 클래스, 인스턴스, 지역 변수가 있습니다.
        System.out.println("int = " + num);

        // 인스턴스 변수
        Variable1_4 instance = new Variable1_4();// 인스턴스 변수 사용을 위해 객체 생성
        System.out.println("instanceVal = " + instance.instanceVal);

        // 클래스 변수
        System.out.println("classVal = " + classVal);
        // 같은 크래스 내부는 바로 접근 가능
        System.out.println("Main.classVal = " + Variable1_4.classVal);
        // 클래스 변수 : 클래스명.클래스변수명 으로 접근
    }
}
class Variable2_1{
    public static void main(String[] args) {
        int score = 100;
        System.out.println("score = " + score);     //상수
        score = 90;                                 //선언 방법 : final 변수타입 변수이름;
        System.out.println("score = " + score);

        final int finalScore = 100;
        System.out.println("finalScore = " + finalScore);
    }
}
class Variable2_2{
    public static void main(String[] args) {
        int score = 100;
        final int finalScore = 1000;
    }
}
class Variable2_3{
    public static void main(String[] args) {
        //boolean flag1 = 22; // 에러
        boolean flag2 = false; //true, false 만 가능!

        //char grade1 = 'AA' //에러
        // char grade2 = "A"; // " " 에러
        char grade3 = 'A'; //char 타입은 하나의 문자만 가능
        char ch = '\n'; //개행문자(\n, \t 등) 가눙

//        String name1 = 'C'; //에러
//        String name2 = 'Jang'; // 에러
        String str = "C"; // 한문자 가능!
        String name3 = "Jang"; //여러문자 가능!

//        byte val1 = 128; // 에러
        byte val2 = 127; // int 와 같은 리터널로 저장하지만 범위가 -128 ~ 127까지

        short sval = 128;

        //리터널 접두사 예제
        //int의 진수 표현
        int ob =0b0101; // 2wlstn, 접두사 ob
        int i = 100; //10진수
        int oct = 0100; // 8진수, 접두사 0
        int hex = 0x100; //16진수, 접두사 0x

        long price = 2_147_483_648L; // _를 사용하여 표현 가능!, 접미사 L
        long l2 = 150; //int의 범위를 넘지 않으면 L생략 가능!

        float tax1 = 3.14F; // 점미사 F

        double score1 = 3.431241414141413431d; //접미사 d
        double socre2 = 3.2321321421421342; //접미사 생략가능

    }
}

//정수형 오버플로우
class Variable3_1{
    public static void main(String[] args) {
        //부호있는 경우
        short sMin = -32768;
        short sMax = 32767;

        //short 타입에서 최솟값 범우 넘었을 때
        System.out.println("sMin = " + sMin);
        System.out.print("sMin - 1 = ");
        System.out.println((short)(sMin - 1)); // sMin -1 = 32766

        //short 타입에서 최댓값 범위 넘었을 때
        System.out.println("sMax = " + sMax);
        System.out.print("sMax + 1 = ");
        System.out.println((short)(sMax + 1)); // sMax +1 = -32768

        // 부호없는 경우
        char cMin = 0;
        char cMax = 65535;

        // char 타입에서 최솟값 범위를 넘었을 때
        System.out.println("cMin = " + (int)cMin);
        System.out.print("cMin - 1 = ");
        System.out.println((int)(--cMin)); //cMin -1 = 65535

        // char 타입에서 최댓값 범위를 넘었을 때
        System.out.println("cMax = " + (int)cMax);
        System.out.print("cMax + 1 = ");
        System.out.println((int)(++cMax));//cMax + 1 = 0
    }
}
class Variable3_2{
    public static void main(String[] args) {
        int num = 5;
        char ch = '5';
        // 숫자 -> 문자
        // 숫자 + '0' = 문자
        // 문자 - '0' = 숫자
        System.out.println("num = " + num);
        System.out.println("num + '0' = " + (char)(num + '0'));

        System.out.println("ch  =" + ch);
        System.out.println("ch - '0' = ");
        System.out.println(ch - '0');
    }
}
class Variable3_3  {
    public static void main(String[] args) {
        int num = 5;
        char ch = '5';

        // 숫자 -> 문자열
        // 숫자 = "" = 문자열
        System.out.println("num + \"\" = " + num + "");
        // num 이 "5" 로 변환되었기 때문에 "5" + "5" 로  결과값은 "55"
        System.out.println("num + \"\" + \"5\" = " + num + "" + "5");

        // 문자 -> 문자열
        // 문자 + "" = 문자열
        System.out.println("ch + \"\" = " + ch + "");
        // ch 이 '5' 에서 "5" 로 변환되었기 때문에 "5" + "8" 로  결과값은 "58"
        System.out.println("ch + \"\" + \"8\" = " + ch + "" + "8");

    }
}
class Variable3_4  {
    public static void main(String[] args) {
        String str1 = "100";
        String str2 = "3.14";
        String str3 = "8";

        // 문자열 -> 숫자
        //Integer.parseInt("문자열")
        //Double.parseDouble("문자열")
        System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str1));
        // Integer.parseInt() 은 int 타입만 가능
//         System.out.println("Integer.parseInt(str2) = " + Integer.parseInt(str2)); // 에러
        System.out.println("Double.parseDouble(str2) = " + Double.parseDouble(str2));

        // 문자열 -> 문자
        //"문자열".charAt(0)
        System.out.println("str.charAt(0) = " + str1.charAt(0) + str1.charAt(1) + str1.charAt(2));
        System.out.println("str2.charAt(0) = " + str3.charAt(0));
    }
}
class Variable3_5 {
    public static void main(String[] args) {
        //참조형 : 기본형을 제외한 나머지 타입 ex) String, System
        Date date; // 참조형 변수 date 를 선언
        date = new Date(); // date 에 객체의 주소를 저장 , new 는 객체를 생성하는 명령어
        System.out.println(date);
    }
}
class Variable4_1{
    public static void main(String[] args) {
        //문자와 문자열 차이 확인
        char ch1 = 'A';
//        char ch2 = 'AB'; //에러
//        char ch3 = ''; //빈 문자 불가능

        String s1 = "ABC"; //문자열가능
        String s2 = "";//빈 문자열 가능
        String s3 = "A"; //문자 한 개도 가능;

        String ss1 ="AB";
        String ss2 = new String("AB");
        System.out.println("ss1 = " + ss1);
        System.out.println("ss2 = " + ss2);
    }
}
class Variable4_2{
    public static void main(String[] args) {
        //문자열 결합
        String s1 ="A" + "B"; //
        System.out.println("s1 =" + s1);
        String s2 ="" + 7;
        System.out.println("s2 = " + s2);
        String s3 = "" + 7 + 7;
        System.out.println("s3 = " + s3);
        String s4 = 7 + 7 + "";
        System.out.println("s4 = " + s4);

    }
}
class Variable4_3{
    public static void main(String[] args) {
        int x = 10, y = 20;
        x = y;
        y = x;
        System.out.println("x = " + x);
        System.out.println("y = " + y); // 20;

        int a = 10, b = 20;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

class Method5_1{
    int add(int x, int y){
        int result = x + y;
        return result;
    }
}
