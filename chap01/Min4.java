package chap01;

import java.util.Arrays;

//네 값의 최소값을 구하는 min4메서드를 작성
public class Min4 {
    static int min4(int a, int b, int c, int d){
        int min = a;
        /*int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        min = arr[0];*/
        
        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }
        if(d < min) {
            min = d;
        }
        return min;
    }
    
    public static void main(String[] args) {
        System.out.println("min4(9,1,3,5) = " + min4(9,1,3,5));
    }
}
