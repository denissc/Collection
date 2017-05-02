import my.collection.IntegerCollection;

/**
 * Main class to test collection
 */
public class Main {
    public static void main(String[] args) {
        IntegerCollection ic = new IntegerCollection();

        ic.add(1);
        ic.add(5);
        ic.add(30);
        ic.add(-1);
        ic.add(-51);
        ic.add(null);

        System.out.println(ic);

        int value = ic.get(0);
        System.out.println("Value at index 0 :" + value);

        int index = ic.indexOf(5);
        System.out.println("Index of value 5 :" + index);

        ic.remove(0);
        System.out.println(ic);

        int max = ic.max();
        System.out.println("Max : " + max);

        int min = ic.min();
        System.out.println("Min : " + min);

        double average = ic.average();

        System.out.println("Average : " + average);



    }
}
