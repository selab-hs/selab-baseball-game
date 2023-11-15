import java.util.Random;
import java.util.Scanner;

public class Baseball {
    int baseballNum;
    int numLength=3;
    int digit=10^(numLength-1);

    public int GetNum() {
        System.out.println("1~9 사이의 중복되지 않는"+numLength+"개의 숫자를 입력해주세요. (예. 123)");
        Scanner sc=new Scanner(System.in);
        baseballNum=sc.nextInt();
        return baseballNum;
    }

    public int GetRandomNum(){
        Random rd=new Random();
        baseballNum= rd.nextInt();

        return baseballNum;
    }

    public int checkDigit() {
        return (baseballNum / digit) <= 0 ? 0 : 1;
    }

    public int checkDupulication() {
        int[] num={};

        for (int i=0;i<numLength;i++){
            num[i]=baseballNum/digit;
            baseballNum%=digit;
            digit/=10;
        }
        for(int j)
    }

    public boolean checkNum() {
        int result = checkDigit() * checkDupulication();
        boolean b = (result != 0);
        return b;
    }
}
