/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-01-2024
 *   Time: 17:25
 *   File: gyanTest.java
 */

import java.util.ArrayList;
import java.util.List;

class Transformation {
    public static List<Integer> oddEvenTransform(List<Integer> arr, int transform) {
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                result.add(num - transform);
            } else {
                result.add(num + transform);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> inputList = List.of(7, 5, 2, 6);
        int transformValue = 3;

        List<Integer> transformedList = new ArrayList<>();
        transformedList = inputList;
        for(int i = 0; i < 3; i++) {
            transformedList = oddEvenTransform(transformedList, transformValue);
        }
        System.out.println("Original List: " + inputList);
        System.out.println("Transformed List: " + transformedList);
    }
}