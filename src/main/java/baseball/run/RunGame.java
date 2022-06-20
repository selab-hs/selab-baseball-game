package baseball.run;

import baseball.input.ScanNumber;
import baseball.random.GenerateRandomNum;

public class RunGame {
    private GenerateRandomNum randomNum;
    private ScanNumber scanNum;
    private int StrikeNum = 0;
    private int BallNum = 0;

    public RunGame(){
        randomNum = new GenerateRandomNum();
        System.out.println(randomNum.getList().getRandomNumList());
    }

    public String run(){
        scanNum = new ScanNumber();
        if(compareList(randomNum, scanNum)){
            System.out.println("정답");
            return "정답";
        }
        System.out.println("실패");
        return "실패";
    }

    // randomNumList와 scanNumList를 가져와서 비교 로직 ( Ball, Strike 여부 )
    private boolean compareList(GenerateRandomNum rNum, ScanNumber sNum){
        System.out.println(rNum.getList().getRandomNumList());
        System.out.println(sNum.getList().getScanNumList());

        return rNum.getList().getRandomNumList().containsAll(sNum.getList().getScanNumList());
    }
}
