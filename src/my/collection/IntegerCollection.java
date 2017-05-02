package my.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Collection of Integers
 */
public class IntegerCollection extends ArrayList<Integer> {

    /**
     * Add element
     * @param integer Integer
     * @return boolean if element is added
     */
    @Override
    public boolean add(Integer integer) {
        if (integer == null || integer.getClass() != Integer.class)
            return false;

        incrementAllElementsByValue(integer);

        return super.add(integer);
    }

    /**
     * Remove element by index
     * @param index index of element to remove
     * @return value of removed element
     */
    @Override
    public Integer remove(int index) {
        Integer integer = super.remove(index);
        decrementAllElementsByValue(integer);
        return integer;
    }

    /**
     * Decrement all exits elements by removed value
     * @param integer all elements will be decremented by this value
     */
    private void decrementAllElementsByValue(Integer integer) {
        Iterator<Integer> iterator = iterator();
        int index = 0;
        while (iterator.hasNext()) {
            Integer elementValue = iterator.next();

            if (integer >= 0){
                elementValue -= integer;
            } else {
                elementValue += Math.abs(integer);
            }
            set(index,elementValue);
            index++;
        }
    }

    /**
     * Increment all elements by integer value
     *
     * @param integer all elements will be incremented by this value
     */
    private void incrementAllElementsByValue(Integer integer) {
        Iterator<Integer> iterator = iterator();
        int index = 0;
        while (iterator.hasNext()) {
            Integer elementValue = iterator.next();
            if (integer >= 0){
                elementValue += integer;
            } else {
                elementValue -= Math.abs(integer);
            }
            set(index,elementValue);
            index++;
        }
    }

    /**
     * Returns maximum element in list
     *
     * @return int
     */
    public int max(){
        int max = Integer.MIN_VALUE;
        for (int value : this) {
            if (max < value)
                max = value;
        }

        return max;
    }

    /**
     * Returns minimum element in list
     *
     * @return minimum value of all elements
     */
    public int min() {
        int min = Integer.MAX_VALUE;
        for (int value : this) {
            if (min > value)
                min = value;
        }

        return min;
    }

    /**
     * Return average of all elements
     *
     * @return average value
     */
    public double average(){
        int sum = 0;
        for (int elementValue : this) {
            sum += elementValue;
        }

        return sum / size();
    }
}
