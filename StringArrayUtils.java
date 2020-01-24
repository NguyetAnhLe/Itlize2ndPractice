 
import java.util.*;
/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int last =  array.length -1;
        return array[last];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
         int secondLast =  array.length -2;
        return array[secondLast];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array ){
            if (s == value) return true;
        }
       return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversed = new String [array.length] ;
        int count = 0;
        for (int i = array.length - 1 ; i >=0 ;i--){
            reversed[count] = array[i];
            count++;
        }
        return reversed;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
       if(array.length % 2 == 0){
           int last = array.length -1;
           for (int i = 0 ; i <= (array.length/2); i++){
               if(array[i] != array[last]) return false;
               last--;
            }
        }
       else{
           int last = array.length -1;
           for (int i = 0 ; i <= (last/2); i++){
               if(array[i] != array[last]) return false;
               last--;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        for(int i = 0; i < array.length; i++){
            array[i] = array[i].toLowerCase();
        }
        HashSet<Character> set = new HashSet<Character>();
        for(String s: array){
         char[] temp = s.toCharArray();
         for(int i = 0; i < temp.length ; i++){
             if (Character.isLetter(temp[i])){
                 set.add(temp[i]);
             }
            }
        }
        if(set.size() == 26){
            return true;
        }
        else{ 
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for(String s : array){
            if(s == value) count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> list = new ArrayList<>();
        for(String s: array){
            if(s != valueToRemove)
                list.add(s);
        }
        String[] arr = list.toArray(new String[list.size()]);
        return arr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<>();
        String first = array[0];
        list.add(array[0]);
        for(int i = 1 ; i < array.length ; i++){
           String temp = array[i];
           if(temp != first){
               list.add(temp);
               first = temp;
           }
        }
        String[] arr = list.toArray(new String[list.size()]);

        return arr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String temp = array[0];
        String s = "";
        s += temp;
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i < array.length; i++ ){
            if(array[i] == temp){
                s += array[i];
            }
            else{
                list.add(s);
                temp = array[i];
                s ="";
                s +=temp;
            }
        }
        list.add(s);

        String[] arr = list.toArray(new String[list.size()]);
        return arr;
    }


}
