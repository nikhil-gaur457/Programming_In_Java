/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 20-05-2022
 *   Time: 23:30
 *   File: FileCreator.java
 */
package selfPractice

import kotlin.jvm.JvmStatic
import java.io.File
import java.io.FileNotFoundException
import java.util.*

object FileCreator {
    @JvmStatic
    fun main(args: Array<String>) {
        /*try {
            File myObj = new File("akkadBakkad.txt");
            if(myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File alread exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*try {
            FileWriter fileWriter = new FileWriter("akkadBakkad.txt");
            fileWriter.write("Aditya is very bad boy, who usually need weed for living");
            fileWriter.close();
            System.out.println("Successfully written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            val myObj = File("akkadBakkad.txt")
            val myReader = Scanner(myObj)
            while (myReader.hasNextLine()) {
                val data = myReader.nextLine()
                println(data)
            }
            myReader.close()
        } catch (e: FileNotFoundException) {
            println("An error occurred.")
            e.printStackTrace()
        }
    }
}