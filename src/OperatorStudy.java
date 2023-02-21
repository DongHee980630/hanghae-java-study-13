package src;

public class OperatorStudy {
}
class Operator1_1{
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("-x + 3 = ");
        System.out.println(-x + 3); // -10 + 3 = -7

        System.out.println("x  + 3 * y = ");
        System.out.println(x + 3 * y); // 10 + 3 * 20 = 70

        System.out.println("x + 3 > y - 2 = ");
        System.out.println(x + 3 > y - 2); // false
        System.out.print("x + 3 < y - 2 = ");
        System.out.println(x + 3 < y - 2); // true
        System.out.print("x > 3 && y < 2 = ");
        System.out.println(x > 3 && y < 2); // false

        int result = x + y * 3;
        System.out.println("result = " + result); // 70

    }
}
class Operator2_1{
    public static void main(String[] args) {
        //증감 연산자
        int k = 0, j = 3;
        //후위
        k = j ++;
        System.out.println("k = j++;, k = " + k);
        System.out.println("k = j++;, j = " + j);
        //초기화
        k = 0;
        j = 3;
        //전위
        k = ++j;
        System.out.println("k = ++j;, k = " + k);
        System.out.println("k = ++j;, j = " + j);

    }
}
class Operator2_2{
    public static void main(String[] args) {
        //부호 연산자
        int i = -10;
        i = +i;
        System.out.println(i); // -10

        i = -10;
        i = -i;
        System.out.println(i); // 10
    }
}
class Operator3_1{
    public static void main(String[] args) {
        //형변환 연산자 : 변수 또는 상수의 타입을 다른 타입으로 변환하는 것을 의미합니다.
        int i = 65, num = 10;
        char ch = 'A';
        float f = 1.6f;

        System.out.println("(char)i = " + (char)i); // A
        System.out.println("(int)ch = " + (int)ch); // 65
        System.out.println("(int)f = " + (int)f); //1
        System.out.println("(float)num = " + (float)num);//10.0
    }
}
class Operator3_2{
    public static void main(String[] args) {
//        int i = 3.14f; // 에러
        int i = (int)3.14f; // 형변환
        System.out.println(i);

        byte b = 100; // OK
        System.out.println("b = " + b);

        int num = 100;
        // byte b2 = num; // 에러
        byte b2 = (byte) num; // byte 타입으로 형변환
        System.out.println("b2 = " + b2);

        byte b3 = (byte) 1000;//값이 손실된다
        System.out.println(b3);
    }
}
class Operator4_1 {
    public static void main(String[] args) {
        //사칙 연산자
        //덧셈(+)   뺄셈(-)   곱셈(*)   나눗셈(/)
        int a = 10, b = 4;

        // 덧셈
        System.out.print("a + b = ");
        System.out.println(a + b); //14

        // 뺄셈
        System.out.print("a - b = ");
        System.out.println(a - b); // 6

        // 곱셈
        System.out.print("a * b = ");
        System.out.println(a * b);//40

        // 나눗셈
        // 소수점 이하는 버려진다.
        System.out.print("a / b = ");
        System.out.println(a / b);//2

        // 10 / 4.0f -> 10.0f / 4.0f -> 2.5
        System.out.print("a / (float)b = ");
        System.out.println(a / (float)b);//2.5
    }
}
class Operator4_2 {
    public static void main(String[] args) {
        //산술변환 : 연산 전에 피연산자의 타입을 일치시키는 것을 의미합니다.
        char ch = '2';

        // 문자 '2' 는 숫자로 50, '0' 은 48
        // 따라서 int 타입으로 자동으로 변하기 때문에 50 - 48 = 2
        System.out.print("ch - '0' = ");
        System.out.println(ch - '0');

        int a = 1_000_000; // 1백만
        int b = 2_000_000; // 2백만

        // a * b = 2_000_000_000_000 -> 10^12
        //계산을 할 때 오버플로우 -> 형변환 필요

        long l = (long)a * b;
        System.out.println("l = " + l);
    }
}
class Operator5_1{
    public static void main(String[] args) {
        //Math :수학과 관련된 메서드를 가지고 있는 클래스 입니다.
        //round() : 실수를 소수점 첫 째자리에서 반올림한 정수를 반환합니다.
        //ceil() : 올림값을 double 형으로 반환합니다.
        //floor() : 내림값을 double 형으로 반환합니다.
        //abs() : int, double 기본형 모두 사용 가능하며 절대값을 얻습니다

        long result = Math.round(3.645678);
        System.out.println(result);
        // 소수점 5째 자리에서 반올림한 값 구하는 방법
        double pi = 3.141592;
        double shortPi = Math.round(pi * 10000) / 10000.0;
        System.out.println(shortPi);
        // 3.141 구하기!
        double pi2 = 3.141592;
        System.out.println( (int) (pi2 * 1000) / 1000.0);
    }
}
class Operator5_3 {
    public static void main(String[] args) {
        //나머지 연산자  %
        int x = 10;
        int y = 8;
        System.out.println(x / y); // 나눈 몫

        System.out.println(x % y);// 나머지

        // 부호 무시 확인
        int n = 3;
        int z = -3;
        System.out.println( x % n); // 1
        System.out.println(x % z); // 1
    }
}
class Operator6_1 {
    public static void main(String[] args) {
        //비교 연산자
        // == : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 참을 반환함.
        // != : 왼쪽의 피연산자와 오른쪽의 피연산자가 같지 않으면 참을 반환함.
        // > : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 참을 반환함.
        // >= : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 참을 반환함.
        int n1 = 10, n2 = 6;
        char c1 = 'A', c2 = 'B';

        System.out.println(n1 >= n2); //true
        System.out.println(n1 <= n2);// false

        System.out.println(n1 == n2);// false
        System.out.println(n1 != n2);// true

        // 산술변환 규칙에 의해서 char 타입이 int 타입으로 변환되어 연산됨
        System.out.println(c1 < c2); // 65 < 66 , true
        System.out.println(c1 > c2); // 65 > 66, false
    }
}
class Operator6_2 {
    public static void main(String[] args) {
        //문자열의 비교 : 문자열 비교에는 == 대신 equals()를 사용해야 합니다.
        //equals : 비교하고자 하는 두 피연산자의 값 자체를 비교합니다.
        String s1 = "사랑";
        String s2 = "사랑";

        System.out.println(s1 == s2);// true
        System.out.println(s1.equals(s2)); // true

        String s3 = new String("사랑");
        System.out.println(s1 == s3);// false
        System.out.println(s1.equals(s3)); // true
    }
}
class Operator7_1 {
    public static void main(String[] args) {
        //논리 연산자
        // && : 논리식이 모두 참이면 참을 반환함. (논리 AND 연산)
        // || : 논리식 중에서 하나라도 참이면 참을 반환함. (논리 OR 연산)
        // ! : 논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환함. (논리 NOT 연산)
        boolean result1, result2, result3, result4, reusult5, result6;

        char ch1 = 'a', ch2 = 'B';  // 'a' : 97 , 'A' : 65, 'B' : 66, 'C' : 67

        result1 = ch1 > 'A' && ch2 < 'C'; // true && true : true
        result2 = ch1 == 'A' && ch2 < 'C';// false && true : false

        result3 = ch1 > 'A' || ch2 < 'C';// true || true : true
        result4 = ch1 < 'A' || ch2 > 'C';// false || false : false

        System.out.println(result1); // true
        System.out.println(result2); // false

        System.out.println(result3); // true
        System.out.println(result4); // false
        System.out.println(!result4); // true

        System.out.println();

        int num = 10;
        // num 은 2의 배수 그리고 3의 배수이다.
        reusult5 = num % 2 == 0 && num % 3 == 0;
        System.out.println(reusult5); // false

        // num 은 2의 배수 또는 3의 배수이다.
        result6 = num % 2 == 0 || num % 3 == 0;
        System.out.println(result6); // true
    }
}
class Operator7_2 {
    public static void main(String[] args) {
        //비트 연산자
        // & : 대응되는 비트가 모두 1이면 1을 반환함. (비트 AND 연산)
        // | : 대응되는 비트 중에서 하나라도 1이면 1을 반환함. (비트 OR 연산)
        // ^ : 대응되는 비트가 서로 다르면 1을 반환함. (비트 XOR 연산)
        // ~ : 비트를 1이면 0으로, 0이면 1로 반전 시킴. (비트 NOT 연산, 1의 보수)
        // << : 명시된 수만큼 비트들을 전부 왼쪽으로 이동시킴. (left shift 연산)
        // >> : 부호를 유지하면서 지정한 수만큼 비트를 전부 오른쪽으로 이동시킴. (right shift 연산)
        // >>> : 지정한 수만큼 비트를 전부 오른쪽으로 이동 시키며, 새로운 비트는 전부 0이 됨.
        int num1 = 8, num2 = -8;
        System.out.println("8의 2진수 = " + Integer.toBinaryString(num1)); // 0 생략 가능!
        System.out.println("-8의 2진수 = " + Integer.toBinaryString(num2));
        System.out.println("-9의 2진수 = " + Integer.toBinaryString(-9)); // 32bit, int = 4byte

        System.out.println("& 연산자에 의한 결과 = " + (num1 & num2)); // 00000000000000000000000000001000, 8
        System.out.println("| 연산자에 의한 결과 = " + (num1 | num2)); // 11111111111111111111111111111000, -8
        System.out.println("^ 연산자에 의한 결과 = " + (num1 ^ num2)); // 11111111111111111111111111110000, -16

        System.out.println("~ 연산자에 의한 결과 = " + ~num1); // 11111111111111111111111111110111, -9

        System.out.println("<< 연산자에 의한 결과 = " + (num1 << 2)); // 32
        System.out.println(">> 연산자에 의한 결과 = " + (num2 >> 2)); // -2

        System.out.println(">>> 연산자에 의한 결과 = " + (num2 >>> 2)); // 1073741822
    }
}
class Operator8_1 {
    public static void main(String[] args) {
        //조건 연산자
        //삼항 연산자 : 조건식 ? 반환값1 : 반환값2
        int num1 = 5, num2 = 7;
        int result;

        result = num1 - num2 > 0 ? num1 : num2;

        System.out.println( result); // 7
    }
}
class Operator8_2 {
    //대입 연산자
    //= 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
    //+= 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
    //-= 왼쪽의 피연산자에서 오른쪽의 피연산자를 뺀 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
    //*= 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
    ///= 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
    //%= 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 왼쪽의 피연산자에 대입함.
    //&= 왼쪽의 피연산자를 오른쪽의 피연산자와 비트 AND 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
    //!= 왼쪽의 피연산자를 오른쪽의 피연산자와 비트 OR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
    //^= 왼쪽의 피연산자를 오른쪽의 피연산자와 비트 XOR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
    //<<= 왼쪽의 피연산자를 오른쪽의 피연산자만큼 왼쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
    //>>= 왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호를 유지하며 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
    //>>>= 왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호에 상관없이 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
    public static void main(String[] args) {
        int num1 = 7, num2 = 7, num3 = 7;

        num1 = num1 - 3;
        num2 -= 3;
        num3 =- 3;

        System.out.println(num1); // 4
        System.out.println(num2); // 4

        System.out.println(num3); // -3
    }
}