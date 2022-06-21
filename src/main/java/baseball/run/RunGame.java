package baseball.run;

import baseball.input.ScanNumber;
import baseball.random.RandomNumber;

import java.util.List;

public class RunGame {
    private final RandomNumber randomNum;

    public RunGame() {
        randomNum = new RandomNumber();
    }

    public void run() {
        ScanNumber scanNum;
        do{
            scanNum = new ScanNumber();
        }while(!compareList(randomNum, scanNum));
    }

    private boolean compareList(RandomNumber rNum, ScanNumber sNum) {
        List<Integer> randomNumList = rNum.getList().getRandomNumList();
        List<Integer> scanNumList = sNum.getList().getScanNumList();
        int Strike = 0;
        int Ball = 0;

        for(int i=0; i<randomNumList.size();i++){
            if(randomNumList.get(i).equals(scanNumList.get(i))){
                Strike++;
                continue;
            }
            if(randomNumList.contains(scanNumList.get(i))){
                Ball++;
            }
        }

        if (Strike == 3){
            System.out.println("3 Strike ! Game End");
            return true;
        }

        System.out.println("Strike : " + Strike + ", Ball : " + Ball);
        return false;
    }
}
