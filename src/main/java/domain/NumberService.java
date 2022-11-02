package domain;

import java.util.List;

public class NumberService {

    public static boolean checkingDuplicate(List<Integer> list) {
        long count = list.stream()
                .distinct()
                .count();
        return count == (long) list.size();
    }
}
