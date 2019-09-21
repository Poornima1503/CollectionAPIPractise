package learnProgramming;

import java.util.*;
//Class implements List Interface, allows to store duplicates elements, elements can be added or removed from the array anytime, and can retrieve values using index
public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        //List  myArrayList = new ArrayList();
        List <String> myArrayList = new ArrayList<String>();
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");
        myArrayList.add("three");
        myArrayList.add(4,"four");
        myArrayList.add("Five");

        System.out.println(myArrayList.size());
        System.out.println(myArrayList);

        for(int i=0; i<myArrayList.size();i++) {
            System.out.println(myArrayList.get(i));
        }


    }
}
