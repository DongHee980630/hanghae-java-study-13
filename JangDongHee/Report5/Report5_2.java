package JangDongHee.Report5;
//6-2. 6-1에서 정의한 Student 클래스에 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.
public class Report5_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);
        String str = s.info();
        System.out.println(str);
    }
}
class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math){
        this.name =name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int total(){
        return kor + eng + math;
    }
    float avg(){
        return (int)(total()/3f * 10 + 0.5f) / 10.0f;
    }
    String info(){
        return name + ", " + ban +", "+no+", "+kor+", "+eng+", "+math+total()+", "+avg();
    }
}