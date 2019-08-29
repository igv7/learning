import java.util.ArrayList;
import java.util.List;

public class Duplicate {
	
	public int findDuplicateNumber(List<Integer> numbers) {

        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber * (highestNumber + 1) / 2);
        return duplicate;
    }

    public int getSum(List<Integer> numbers) {

        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        return sum;
    }

    public static void main(String a[]) {
        List <Integer> numbers = new ArrayList <Integer>();
        for (int i = 1; i < 100; i++) {
            numbers.add(i);
        }
        //добавляем дубликат в список
        numbers.add(25);
        Duplicate dn = new Duplicate();
        System.out.println("Элемент, который повторяется: " + dn.findDuplicateNumber(numbers));
    }

}
