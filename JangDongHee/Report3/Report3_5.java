package JangDongHee.Report3;

public class Report3_5 {
    public static void main(String[] args) {
        //4-5. 다음의 for문을 while문으로 변경하세요.
        int i = 0;
        while (i <=10){
            int j = 0;
            i++;
            while (j <= i){
                System.out.println("*");
                j++;
            }
        }
//        for(int i=0; i<=10; i++) {
//            for(int j=0; j<=i; j++)
//                System.out.print("*");
//            System.out.println();
//        }
    }//end of main
}
