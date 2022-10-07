package domain;

import java.util.List;

public class DuplicateCheck {

    public static boolean checkingDuplicate(List<Integer> list, int size) {
        long count = list.stream().distinct().count();
        return count == (long) size;
    }
}
