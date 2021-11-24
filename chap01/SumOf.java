package chap01;

import java.util.Scanner;

//정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드 작성
public class SumOf {
    static int sumof(int a, int b){
        int sum = 0;
        while(a <= b){
            sum += a;
            a++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("숫자 a: ");
        int a = stdIn.nextInt();
        System.out.println("숫자 b: ");
        int b = stdIn.nextInt();

        System.out.println("결과: " + sumof(a,b));
    }
}
