package baseball.random;

import baseball.random.list.RandomNumList;

public class GenerateRandomNum {
    private RandomNumList rList;

	public GenerateRandomNum(){
        int[] num = new int[3];

        for(int i=0; i<num.length; i++) {
            num[i] = (int)(Math.random() * 9 +1);

            // 중복 제거 로직 추가 예정
        }

        rList = new RandomNumList(num[0], num[1], num[2]);
    }

    public RandomNumList getList(){
        return rList;
    }
}

