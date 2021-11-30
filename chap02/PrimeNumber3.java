package chap02;

//1000이하의 소수를 열거(버전3)
public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;    //곱셈과 나눗셈의 횟수
        int ptr = 0;    //찾은 소수의 개수
        int[] prime = new int[500]; //소수를 저장하는 배열

        prime[ptr++] = 2;   //2는 소수
        prime[ptr++] = 3;   //3도 소수
        
        for(int n = 5; n <= 1000; n += 2){  //대상은 홀수만
            boolean flag = false;
            for(int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if(n % prime[i] == 0) { //나누어 떨어지면 소수가 아니므로
                    flag = true;
                    break;  //반복 종료
                }
            }
            if(!flag) { //마지막까지 나누어 떨어지지 않았으니
                prime[ptr++] = n;   //소수로 저장
                counter++;  //안쪽 for loop의 조건(prime[i] * prime[i] <= n) 이 성립하지 않는경우 counter+=2가 안되므로 여기서 더해줌
            }
        }
        
        for(int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);   //찾은 ptr개의 소수를 출력
        }
        System.out.println("곱셈과 나눗셈을 수행한 횟수: " + counter);
    }    
}
