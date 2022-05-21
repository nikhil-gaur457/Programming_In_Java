/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 15-03-2022
 *   Time: 00:07
 *   File: SingleInheritance.java
 */

package selfPractice;

class Student {
    int rollNumber;
    int marks;
    String name;

    void input() {
        System.out.println("Enter roll number, name and marks : ");
    }
}

class nikhil extends Student {
    void print() {
        rollNumber = 1;
        name = "Nikhil";
        marks = 83;
        System.out.println(rollNumber + " "+ name+ " "+ marks);
    }

    public static void main(String[] args) {
        nikhil n = new nikhil();
        n.input();
        n.print();
    }
}