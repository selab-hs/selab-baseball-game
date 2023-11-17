import java.util.ArrayList;
import java.util.List;

public class BaseballMatch {
    int userNum;
    int comNum;
    List<Integer> userNumList;
    List<Integer> comNumList;
    int strike=0;
    int ball=0;

    public BaseballMatch(SetNum userNum, SetNum comNum) {
        this.userNumList=numToList(userNum);
        this.comNumList=numToList(comNum);
        result();
    }

    private List<Integer> numToList(SetNum number) {
        int temp = number.baseballNum;
        System.out.println(temp);
        List<Integer>list=new ArrayList<>();

        for (int i = 0; i < number.numLength; i++) {
            list.add(0,temp % 10);
            temp /= 10;
        }
        return list;
    }

    public void result() {
        checkScore();
        printScore();
    }

    public void checkScore() {
        for (int num:userNumList) {
            if (comNumList.contains(num)) {
                if(comNumList.indexOf(num)==userNumList.indexOf(num)){
                    strike++;
                }
                if(comNumList.indexOf(num)!=userNumList.indexOf(num)){
                    ball++;
                }
            }}
    }

    private void printScore() {
        System.out.println( ball +" ball / "+strike+" strike");
    }


    public boolean allStrike() {
        if(strike==3){
            System.out.println("BASEBALL WIN~!");
            return true;
        }
        return false;
    }
}
