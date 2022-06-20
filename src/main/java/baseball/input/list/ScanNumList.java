package baseball.input.list;

import java.util.ArrayList;
import java.util.List;

public class ScanNumList {
    private List<Integer> scanNumList = new ArrayList<Integer>();

    public ScanNumList(int a){
        scanNumList.add(a/100);
        scanNumList.add(a%100/10);
        scanNumList.add(a%10);
    }

    public List<Integer> getScanNumList() {
        return scanNumList;
    }
}
