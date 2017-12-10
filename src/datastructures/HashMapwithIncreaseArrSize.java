
package datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapwithIncreaseArrSize {
    public static void main(String args[]) {
        Solution arr = new Solution();

        System.out.println(arr.add(5));
        System.out.println(arr.add(10));
        System.out.println(arr.remove(10));
    }
}

class Solution {
    int[] arr = null;
    int index;
    Map<Integer, Integer> map;

    public Solution() {
        arr = new int[1];
        index = 0;
        map = new HashMap<Integer, Integer>();
    }

    public int add(int el) {
        ensureCapacity();
        arr[index] = el;
        map.put(el, index);
        System.out.println("Array: "  + arr);
        System.out.println(el + ": " + index);
        return index++;
    }

    public boolean remove(int el) {
        if (!map.containsKey(el)) return false;

        int loc = map.get(el);
        arr[loc] = arr[index - 1];
        arr[index - 1] = 0;
        map.remove(el);
        map.put(arr[loc], loc);
        System.out.println(el + ": " + index);
        return true;
    }

    public void ensureCapacity() {
        if (index >= arr.length) {
            int[] temp = new int[arr.length * 2];

            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }

            arr = temp.clone();
        }
    }
}
