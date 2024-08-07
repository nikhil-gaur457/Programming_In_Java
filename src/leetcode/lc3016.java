/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 07-08-2024
 *   Time: 01:09
 *   File: lc3016.java
 */

package leetcode;

import java.util.*;

public class lc3016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word string to enter: ");
        String s = scanner.nextLine();
        int getCount = getMinimumKeyPress(s);
        System.out.println("minimum number of buttons to press : " + getCount);
    }

    public static int getMinimumKeyPress(String word) {
        HashMap<Character, Integer> characterCountMapping = new HashMap<>();
        int numberOfDistinctLetters = 0;
        int result = 0;

        for (char ch : word.toCharArray()) {
            characterCountMapping.put(ch, characterCountMapping.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Number of distinct letters are : " + numberOfDistinctLetters);

        // Convert the HashMap to a list and sort by values in descending order
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(characterCountMapping.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("your list is : " + list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("At " + i + " : " + list.get(i).getValue());
            int buttonPress = (i > 23) ? 4 : (i > 15) ? 3 : (i > 7) ? 2 : 1;
            result = result + (buttonPress * list.get(i).getValue());
        }


//        Map<Character, Integer> characterCountmapping = new HashMap<>();
//            for (char ch : string.toCharArray()) {
//            characterCountmapping.put(ch, characterCountmapping.getOrDefault(ch, 0) + 1);
//        }
//
//        // Use a priority queue to sort characters by frequency in descending order
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//        maxHeap.addAll(characterCountmapping.values());
//
//        // Calculate the minimum key presses needed
//        int result = 0;
//        int buttonPress = 1; // Start with button press value for 1-key buttons
//        while (!maxHeap.isEmpty()) {
//            int count = maxHeap.poll();
//            result += count * buttonPress;
//            // Update button press values based on remaining buttons
//            if (maxHeap.size() > 23) {
//                buttonPress = 4;
//            } else if (maxHeap.size() > 15) {
//                buttonPress = 3;
//            } else if (maxHeap.size() > 7) {
//                buttonPress = 2;
//            } else {
//                buttonPress = 1;
//            }
//        }
        return result;
    }
}