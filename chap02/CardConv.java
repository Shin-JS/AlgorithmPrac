package chap02;

//기수변환-- 배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드를 작성하세요
public class CardConv {
    //정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 쟈릿수를 반환합니다.
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0; //변환후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);  //r로 나눈 나머지를 저장
            x /= r;
        }while(x != 0);
        //일단 저장 후 뒤집기
        for(int i = 0 ; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }
        return digits;
    }
}
