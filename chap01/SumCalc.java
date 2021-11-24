package chap01;

import java.util.Scanner;

//n이 7이면 '1+2+3+4+5+6+7=28'로 출력하는 프로그램 작성
public class SumCalc {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("숫자 입력: ");
        int a = stdIn.nextInt();
        int sum = 0;
        for(int i = 1; i <= a; i++) {
            sum += i;
            if(i < a){
                System.out.print(i + "+");
            }else if(i == a) {
                System.out.print(i + "=" + sum);
            }
        }
        System.out.println();
    }
}
