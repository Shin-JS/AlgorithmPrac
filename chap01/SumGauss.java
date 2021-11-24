package chap01;

import java.util.Scanner;

//가우스 덧셈을 이용하여 1부터 n까지의 합 구하는 프로그램 작성
public class SumGauss {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("입력: ");
        int n = stdIn.nextInt();

        int sum = (1 + n) * (n / 2);

        System.out.println("calc: " + sum);
    }
}
