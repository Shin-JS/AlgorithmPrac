package chap02;

import java.util.Arrays;

//배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요
public class ArrayCopy {
    static void copy(int[] a, int[] b) {
        for(int i = 0 ; i < b.length; i++){
            a[i] = b[i];
        }
    }
    
    public static void main(String[] args) {
        int[] na = new int[3];
        int[] nb = {1,2,3};
        copy(na,nb);
        for(int i = 0; i < na.length; i++) {
            System.out.println("na[" + i + "] : " + na[i]);
        }

    }
}
