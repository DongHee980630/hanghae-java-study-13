package src;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }

    public void onomatopoeia(){
        System.out.println("동물이 소리냅니다.");
    }
}
class Dog extends Animal{
    @Override
    public void move(){
        System.out.println("강아지가 달립니다.");
    }
    @Override
    public void onomatopoeia(){
        System.out.println("멍멍!");
    }
}
class Bird1 extends Animal{
    @Override
    public void move(){
        System.out.println("새가 날아다닙니다.");
    }
    @Override
    public void onomatopoeia(){
        System.out.println("짹쨱!");
    }
}
class Action{
     void doMove(Animal animal){
        animal.move();
    }
     void doCry(Animal animal){
        animal.onomatopoeia();
    }
}
class ParPoly1{
    public static void main(String[] args) {
        Action action = new Action();

        action.doMove(new Dog());
        action.doMove(new Bird1());
        System.out.println();
        action.doCry(new Dog());
        action.doCry(new Bird1());
    }
}
