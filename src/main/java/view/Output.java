package view;

public class Output {

    public void printCreateMessage() {
        System.out.println("※ 랜덤 숫자 생성이 완료되었습니다 ※");
    }

    public void printDuplicateMessage() {
        System.out.println("중복된 숫자를 입력하셨습니다");
    }

    public void printSizeMessage(){
        System.out.println("숫자를 3개만 입력해주세요");
    }

    public void printOutputMessage(int strike, int ball) {
        System.out.println(strike + "Strike / " + ball + "Ball");
    }

    public void printVictoryMessage(){
        System.out.println("정답을 맞추셨습니다 !");
    }
}
