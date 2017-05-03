import java.util.HashMap;
import java.util.Map;

/**
 * Created by fred on 5/2/2017.
 */
public class FindModeInBST {
    private int highestCount, numWithHighestCount, i;
    private Map<Integer, Integer> valToNumberAppearance  = new HashMap<Integer, Integer>();

    public int[] findMode(TreeNode root) {
        populateMap(root);
        int[] res = new int[numWithHighestCount];
        for (Map.Entry<Integer, Integer> entry : valToNumberAppearance.entrySet())
            if (entry.getValue() == highestCount) res[i++] = entry.getKey();
        return res;
    }

    public void populateMap(TreeNode cur) {
        Integer curOcurrences = valToNumberAppearance.getOrDefault(cur.value, 0);
        valToNumberAppearance.put(cur.value, ++curOcurrences);
        if (curOcurrences > highestCount) {
            highestCount = curOcurrences;
            numWithHighestCount = 1;
        }
        else if (curOcurrences == highestCount) numWithHighestCount++;
        if (cur.left != null) populateMap(cur.left);
        if (cur.right != null) populateMap(cur.right);
    }
}
