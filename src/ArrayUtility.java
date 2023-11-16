import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayUtility {

    public static void print(int[] array) {

    }

    public static int sum(int[] array) {
        int count = 0;
        for (int n : array) count+=n;
        return count;
    }

    public static double average(int[] array) {
        int count = 0;
        for (int n : array) count+=n;
        return Math.floor((double) count /array.length * 100) / 100;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int n : array) min = Math.min(min,n);
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int n : array) max = Math.max(max,n);
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int n: array) {
            if (n%2==0) count++;
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int [] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i]=array[array.length-i - 1];
        }
        return result;
    }

    public static void reverseTwo(int[] array) {
        int [] copy = Arrays.copyOf(array,array.length);
        for (int i = 0; i < copy.length; i++) {
            array[i] = copy[copy.length - i - 1];
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int n : array) {
            if (n==num) return true;
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String s : array) {
            if (s.equals(str)) return true;
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]=array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i]=array[i]*n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for (int j : array) {
            result += j + ", ";
        }
        return result.substring(0,result.length()-2);
    }

    public static boolean twoSum(int[] array, int num) {
        Set<Integer> complementSet = new HashSet<>();

        for (int n : array) {
            int complement = num - n;
            if (complementSet.contains(complement)) {
                return true;
            }
            complementSet.add(n);
        }

        return false;
    }

    public static void shiftRight(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int lastElement = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = lastElement;
    }

    public static void shiftLeft(int[] array) {
        if (array.length <= 1) return;
        int firstElement = array[0];
        for (int i = 1; i < array.length; i++) array[i - 1] = array[i];
        array[array.length - 1] = firstElement;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        if (array.length <= 1 || n <= 0) return;
        int numShifts = n % array.length;
        for (int i = 0; i < numShifts; i++) {
            int lastElement = array[array.length - 1];
            for (int j = array.length - 2; j >= 0; j--) array[j + 1] = array[j];
            array[0] = lastElement;
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        if (array.length <= 1 || n <= 0) return;
        int numShifts = n % array.length;
        for (int i = 0; i < numShifts; i++) {
            int firstElement = array[0];
            for (int j = 1; j < array.length; j++) array[j - 1] = array[j];
            array[array.length - 1] = firstElement;
        }
    }


}