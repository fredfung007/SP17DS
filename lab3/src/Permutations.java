import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args){
        for (List<Integer> temp : permute(4)){
            System.out.print("[ ");
            for (int i : temp){
                System.out.print(i + ", ");
            }
            System.out.println("]");
        }
    }

    public static List<List<Integer>> permute(int n) {
        if (n == 0) {
            List<Integer> elem = new ArrayList<>();
            ArrayList<List<Integer>> base = new ArrayList<>();
            base.add(elem);
            return base;
        }

        // recursive call to combine method, Choose k-1 from n-1;
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> last =  permute(n - 1);

        for (List<Integer> lastresult : last) {
            for (int i=0;i<n;i++){
                List<Integer> temp = new ArrayList<>(lastresult);
                temp.add(i,n);
                result.add(temp);
            }
        }
        return result;
    }
}