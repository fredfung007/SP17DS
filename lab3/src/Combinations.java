import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        if (k == n || k == 0) {
            List<Integer> row = new LinkedList<>();
            for (int i = 1; i <= k; ++i) {
                row.add(i);
            }
            return new LinkedList<>(Arrays.asList(row));
        }
        
        List<List<Integer>> result = this.combine(n - 1, k - 1);
        for (List<Integer> temp : result){
            temp.add(n);
        }
        result.addAll(this.combine(n - 1, k));
        return result;
    }
}
