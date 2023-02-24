package src;

class Point{
    int x  = 0;
    int y = 20;
}
class Point3D extends Point{
    int z = 30;
}
class PointEx1{
    public static void main(String[] args) {
        Point point = new Point();
        Point3D point3D = new Point3D();

        System.out.println("point.x = " + point.x);
        System.out.println("point.y = " + point.y + "\n");

        System.out.println("point3D.x = " + point3D.x);
        System.out.println("point3D.y = " + point3D.y);
        System.out.println("point3D.z = " + point3D.z);

    }
}
class Point1{
    int x, y;
    String getLocation(){
        return "x: " + x + ", y :" + y;
    }
}
class Point3D1 extends Point1{
    int z;
    @Override
    String getLocation(){
        return "x: " + x + ", y :" + y + ", z : " + z;
    }
}
class OverrideEx1{
    public static void main(String[] args) {
        Point3D1 point3D1 = new Point3D1();
        point3D1.x = 10;
        point3D1.y = 20;
        point3D1.z = 30;
        System.out.println(point3D1.getLocation());
    }
}

class Point2{
    int x = 10;
    int y = 20;
    void move(){
        ++x;
        ++y;
    }
}
class Point3D2 extends Point2{
    int z = 30;
    @Override
    void move(){
        ++x;
        ++y;
        ++z;
    }
}

class OverrideEx2{
    public static void main(String[] args) {
        Point2 point2 = new Point2();
        Point3D2 point3D2 = new Point3D2();

        point2.move();
        System.out.println("point2.x = " + point2.x);
        System.out.println("point2.y = " + point2.y + "\n");

        point3D2.move();
        System.out.println("point3D2.x = " + point3D2.x);
        System.out.println("point3D2.y = " + point3D2.y);
        System.out.println("point3D2.z = " + point3D2.z);

    }
}
class Parent{
    int x= 10;
}
class Child extends Parent{
    int x= 30;

    Child(){
        System.out.println("생성자에서 조상의 변수 x 접근 = " + super.x);
        System.out.println("생성자에서 현재 객체 자신의 변수 x 접근 = " + this.x);
    }
    void childMethod(){
        System.out.println("child의 x = " + x);
        System.out.println("현재 객체 자신의 x = " + this.x);
        System.out.println("parent의 x = " + super.x);
    }
}

class SuperEx1{
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
    }
}
class Parent2{
    int x, y, z;

    public Parent2(){
        System.out.println("난 부모 생성자");
    }

    public Parent2(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Child2 extends Parent2{
    Child2() {
        super(10, 20, 30);
    }
    Child2(int num){
        System.out.println("오버로딩 생성자");
    }
}
class SuperCEx1{
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        System.out.println("child2.x = " + child2.x);
        System.out.println("child2.y = " + child2.y);
        System.out.println("child2.z = " + child2.z);
        System.out.println();

        new Child2(10000);
    }
}
class Point4 {
    int x, y;

    Point4(){
        this.x = 10;
        this.y = 20;
    }

    void move(){
        ++x;
        ++y;
    }
}

class Point3D4 extends Point4 {
    int z;

    Point3D4(){
        super();
        this.z = 30;
    }
    @Override
    void move() {
        super.move();
        ++z;
    }
}

class SuperCEx2 {
    public static void main(String[] args) {
        Point4 point4 = new Point4();
        Point3D4 point3D4 = new Point3D4();

        point4.move();
        System.out.println("point.x = " + point4.x);
        System.out.println("point.y = " + point4.y + "\n");

        point3D4.move();
        System.out.println("point3D.x = " + point3D4.x);
        System.out.println("point3D.y = " + point3D4.y);
        System.out.println("point3D.z = " + point3D4.z);

        // 생성자를 이용한 초기화 시 super() 예약어를 이용하여 부모의 멤버변수를 초기화 할 수 있습니다.
        // 이 때, super()를 생략 하여도 자동으로 컴파일러에서 추가 해 줍니다.
    }
}
class Capsule{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = checkName(name) ? name: "anonymous";
    }
    private boolean checkName(String name){
        return name.length() > 0;
    }
}
class CapsuleMain{
    public static void main(String[] args) {
        Capsule capsule = new Capsule();
        capsule.setAge(28);
        capsule.setName("bin");

        System.out.println("capsule.getName() = " + capsule.getName());
        System.out.println("capsule.getAge() = " + capsule.getAge());
        
        capsule.setName("");
        System.out.println("capsule.getName() = " + capsule.getName());
    }
}
class Whale extends Mammalia{
    public void swimming(){
        System.out.println("수영 하다.");
    }
    public void feeding(){
        System.out.println("고래는 모유 수유를 합니다.");
    }

    public void giveBirth(){
        System.out.println("고래는 새끼를 낳습니다.");
    }
}
class Mammalia{
    public void feeding(){
        System.out.println("모유 수유를 합니다.");
    }
    public void giveBirth(){
        System.out.println("새끼를 낳습니다.");
    }
}

class PolyTest1{
    public static void main(String[] args) {
        Mammalia mammalia = new Whale();
        mammalia.giveBirth();
        mammalia.feeding();
    }
}
class Whale2 extends Mammalia1{
    public void swimming() {
        System.out.println("수영 하다.");
    }

    @Override
    public void feeding() {
        System.out.println("고래는 모유 수유를 합니다.");
    }

    @Override
    public void giveBirth() {
        System.out.println("고래는 새끼를 낳습니다.");
    }
}
class Mammalia1{
    public void feeding(){
        System.out.println("모유 수유를 합니다.");
    }
    public void giveBirth(){
        System.out.println("새끼를 낳습니다.");
    }
}
class Bird{
    public void fly(){
        System.out.println("Bird.fly");
    }
}
class Polytest2{
    public static void main(String[] args) {
        Whale2 whale2 = new Whale2();
        Mammalia1 mammalia1 = whale2;
        mammalia1.feeding();
        mammalia1.giveBirth();

        Whale2 whale = (Whale2) mammalia1;
        whale.swimming();
    }
}
class A {}
class B extends A{}
class Instanceof {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println("a instanceof A = " + (a instanceof A));

        // a 객체는 B 클래스의 부모 클래스 입니다.
        // 따라서 아래는 false 입니다.
        System.out.println("a instanceof B = " + (a instanceof B));

        System.out.println("b instanceof A = " + (b instanceof A));

        System.out.println("b instanceof B = " + (b instanceof B));
    }
}