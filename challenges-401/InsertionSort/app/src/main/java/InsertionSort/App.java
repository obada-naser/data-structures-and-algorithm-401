/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InsertionSort;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


        System.out.println("**************** Insertion sorting ********************");

        InsertionSort insertSort = new InsertionSort();

        int[] arr = {8 , 4 , 23 , 42 , 16 , 15 };

        System.out.println(Arrays.toString(insertSort.insertionSort(arr)));

        System.out.println("**************** Merge sorting ********************");


        MergeSort mergingSort=new MergeSort();

        System.out.println(Arrays.toString(mergingSort.mergeSort(arr)));
    }



}
