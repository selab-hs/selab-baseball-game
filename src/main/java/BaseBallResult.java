public interface BaseBallResult {
    int MIN_COUNT = 0;
    int MAX_COUNT = 3;

    void checkInput(char inputChar, String randomValue, int count);
    int getResult();
}
