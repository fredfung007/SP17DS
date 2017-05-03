import java.util.LinkedList;
import java.util.List;

/**
 * Created by fred on 5/2/2017.
 */
public class FindModeInBST {
    private void helper(TreeNode root, int[] var, List<Integer> result) {
        if (root == null) return;
        helper(root.left, var, result);
        var[1] = root.value == var[2] ? var[1] + 1 : 1;
        if (var[1] >= var[0]) {
            if (var[1] > var[0]) result.clear();
            var[0] = var[1];
            if (result.size() == 0 || result.get(result.size() - 1) != root.value) {
                result.add(root.value);
            }
        }
        var[2] = root.value;
        helper(root.right, var, result);
    }

    public int[] findMode(TreeNode root) {
        List<Integer> temp = new LinkedList<>();
        int[] var = new int[3]; // var[0] = max, var[1] = curr_max, var[2] = prev
        helper(root, var, temp);

        int[] result = new int[temp.size()];
        for (int i = 0; i < result.length; i++) result[i] = temp.get(i);
        return result;
    }
}
