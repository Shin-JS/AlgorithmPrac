package chap01;

public class Spira {
    //n단의 피라미드를 출력하는 메서드
    static void spira(int n) {
        for(int i = 0; i <= n; i++ ){
            for(int j = 0; j < (n-i)%2 ; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < (n - i)/2 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        spira(5);
    }
}
