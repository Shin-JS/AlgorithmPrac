package chap02;

//배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메소드
public class ArrayRCopy {
    static void rcopy(int[] a, int[] b){
        for(int i = 0; i < b.length; i++) {
            a[i] = b[b.length - i - 1];
        }
    }
    public static void main(String[] args) {
        int[] na = new int[3];
        int[] nb = {1,2,3};
        rcopy(na,nb);
        for(int i = 0; i < na.length; i++) {
            System.out.println("na[" + i + "] : " + na[i]);
        }

    }
}
