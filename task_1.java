import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Пусть дан произвольный список(ArrayList) целых чисел, удалить из него четные числа. */

public class task_1 {

    public static void main(String[] args) {
        List<Integer> listNums = new ArrayList<>();

        listNums.add(1);
        listNums.add(17);
        listNums.add(0);
        listNums.add(33);
        listNums.add(14);
        listNums.add(21);
        listNums.add(18);
        listNums.add(22);
        listNums.add(77);
        System.out.println(listNums);

        Iterator<Integer> nums = listNums.iterator();

        while(nums.hasNext()){
           int a = nums.next();
           if(a % 2 == 0) {
            nums.remove();
           } 

        }
        System.out.println(listNums);
    }
}