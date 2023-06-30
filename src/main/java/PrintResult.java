public class PrintResult {
    public PrintResult(int strike, int ball,String randomValue) {
        if(strike == 3){
            System.out.println("BASEBALL WIN~");
            System.out.println("RandomValue : " + randomValue);
            System.exit(1);
        }else
            System.out.println(strike + " Strike, " + ball + " Ball");
    }
}
