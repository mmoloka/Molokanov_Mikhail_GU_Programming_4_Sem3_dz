import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class task_2 {
    public static void main(String[] args) {
        List <Integer> listNums = new ArrayList<>();

        listNums.add(15);
        listNums.add(7);
        listNums.add(- 4);
        listNums.add(25);
        listNums.add(18);
        listNums.add(9);
        listNums.add(8);
        listNums.add(0);
        listNums.add(- 11);
        listNums.add(1);
        System.out.println(listNums);
        listNums.sort(Comparator.naturalOrder());
        System.out.printf("Минимальное число = %d", listNums.get(0));
        System.out.println();
        System.out.printf("Максимальное число = %d", listNums.get(listNums.size() - 1));
        System.out.println();
        
        Iterator<Integer> nums = listNums.listIterator();
        float sum = 0;
        while(nums.hasNext()) {
            sum += nums.next();
        }

        System.out.printf("Среднее списка = %.1f", sum / listNums.size());

    }
}
