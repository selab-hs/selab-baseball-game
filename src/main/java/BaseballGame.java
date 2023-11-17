public class BaseballGame {

    SetNum comNum = new SetNum();
    BaseballMatch match1;

    public void startGame() {
        comNum.getRandomNum();
        do{
            SetNum userNum = new SetNum();
            userNum.getNum();
            match1 = new BaseballMatch(userNum, comNum);
        }
        while(!match1.allStrike());

    }

}
