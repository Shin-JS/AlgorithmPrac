package chap01;

//세 값의 최소값을 구하는 min3메서드를 작성
public class Min3 {
    static int min3(int a, int b, int c) {
        int min = a;
        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("min3(3,7,1) = " + min3(3,7,1));
    }
}
