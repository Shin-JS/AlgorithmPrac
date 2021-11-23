package chap01;

import java.util.Arrays;

//네 값의 최댓값을 구하는 max4 메서드를 작성하세요
public class Max4 {
    static int max4(int a, int b, int c, int d){
        int max = a;
        /*int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        max = arr[arr.length - 1];*/

        if(b > max) {
            max = b;
        }

        if(c > max) { 
            max = c;
        }

        if(d > max) {
            max = d;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("max4(3,7,9,1) = " + max4(3,7,9,1));
    }
}
