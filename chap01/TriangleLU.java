package chap01;

public class TriangleLU {
    //왼쪽 위가 직각인 이등변 삼각형을 출력
    static void triangleLU(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //오른쪽 위가 직각인 이등변 삼각형을 출력
    static void triangleRU(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //오른쪽 아래가 직각인 이등변삼각형 출력
    static void triangleRB(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangleRB(5);
    }
}
