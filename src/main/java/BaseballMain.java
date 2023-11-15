import java.util.Random;

public class BaseballMain {
    public static void main(String[] args) {
        int myNum=0;
        boolean checkRightNum=false;

        Baseball myBaseball=new Baseball();
        Baseball comBaseball=new Baseball();

        while(!checkRightNum){
            comBaseball.GetRandomNum();
            checkRightNum=comBaseball.checkNum();
        }
        while(checkRightNum){
            myBaseball.GetNum();
            checkRightNum=myBaseball.checkNum();
        }
    }
}
