package com.rubyalliance.cims.courses.sp17.datastructures.lab3;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        // Base case; [[1],[2],[3],...,[n]] & [[1,2,3,...,n]]
        if (k == n || k == 0) {
            List<Integer> elem = new ArrayList<>();
            for (int i = 1; i <= k; ++i) {
                elem.add(i);
            }
            ArrayList<List<Integer>> base = new ArrayList<>();
            base.add(elem);
            return base;
        }

        // recursive call to combine method, Choose k-1 from n-1;
        List<List<Integer>> result = this.combine(n - 1, k - 1);
        // Add n to all previous sub problem.
        for (List<Integer> temp : result){
            temp.add(n);
        }
        // recursive call to combine method, Choose k from n-1;
        result.addAll(this.combine(n - 1, k));
        return result;
    }
}
