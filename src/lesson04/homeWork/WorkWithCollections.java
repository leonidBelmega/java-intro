package lesson04.homeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class WorkWithCollections {
    public static void main(String[] args) {

        ArrayList<String> pets = new ArrayList<>();
        pets.add("parrot");
        pets.add("cat");
        pets.add("dog");
        pets.add("mouse");
        pets.add("ringo");
        pets.add("snake");
        pets.remove("dog");

        Iterator itr = pets.iterator();
        System.out.println("One element has been removed:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        ArrayList<String> petsSorted = new ArrayList<>(pets);
        Collections.sort(petsSorted);

        System.out.println("Before sorting:");
        itr = pets.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("After sorting:");
        itr = petsSorted.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
