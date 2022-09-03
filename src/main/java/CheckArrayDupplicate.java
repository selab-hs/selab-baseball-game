import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
public class CheckArrayDupplicate {
    public boolean checkDuplicate(List<String> arr) {
        Set<String> set = new HashSet<>();
        for(String s : arr) {
            set.add(s);
        }
        if(set.size()==arr.size()) {
            return true;
        }
        return false;
    }
}
