import java.util.HashSet;
import java.util.Set;

public class CheckArrayDupplicate {
    CheckArrayDupplicate() {

    }
    public boolean checkDuplicate(String[] arr) {
        Set<String> set = new HashSet<>();
        for(String s : arr) {
            set.add(s);
        }
        if(set.size()==arr.length) {
            return true;
        }
        return false;
    }
}
