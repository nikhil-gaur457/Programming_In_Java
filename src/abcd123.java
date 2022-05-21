/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 11-03-2022
 *   Time: 19:50
 *   File: abcd123.java
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class CodeVitaOne {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int C = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int[] seats = new int[C + 1];
        for (int i = 1; i <= C; i++) {
            seats[i] = Integer.parseInt(input[i - 1]);
        }
        Student[] arr = new Student[N];
        for (int i = 0; i < N; i++) {
            input = br.readLine().split("[,-]+");
            Student student = new Student();
            student.id = Integer.parseInt(input[1]);
            student.percent = Float.parseFloat(input[2]);
            int[] choice = new int[3];
            choice[0] = Integer.parseInt(input[4]);
            choice[1] = Integer.parseInt(input[6]);
            choice[2] = Integer.parseInt(input[8]);
            student.choice = choice;
            arr[i] = student;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            int[] choice = student.choice;
            for (int j = 0; j < 3; j++) {
                int curr = choice[j];
                if (seats[curr] > 0) {
                    System.out.println("student-" + (student.id) + " C-" + curr);
                    seats[curr]--;
                    break;
                }
            }
        }
    }

    static class Student implements Comparable<Student> {
        int id;
        int[] choice;
        float percent;
        public int compareTo(Student obj) {
            if (this.percent == obj.percent) {
                return this.id - obj.id;
            } else if (obj.percent > this.percent)
                return 1;
            else
                return -1;
        }
    }
}
