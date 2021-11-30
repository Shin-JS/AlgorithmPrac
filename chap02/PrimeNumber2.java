package chap02;

//1000이하의 소수를 열거(버전2)
public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;    //나눗셈의 횟수
        int ptr = 0;    //찾은 소수의 개수
        int[] prime = new int[500]; //소수를 저장하는 배열

        prime[ptr++] = 2;   //2는 말하지 않아도 소수

        for(int n = 3; n <= 1000; n += 2) { //2보다 큰 짝수중 소수는 없다
            int i;
            for(i = 1; i < ptr; i++) {
                counter++;
                if(n % prime[i] == 0) { //나누어 떨어지면 소수가 아니므로
                    break;  //반복 종료
                }
            }
            if(ptr == i) {  //마지막까지 나누어 떨어지지 않은경우
                prime[ptr++] = n;   //소수이므로 배열에 저장
            }
        }

        for(int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("나눗셈을 수행한 횟수: " + counter);
    }
}
