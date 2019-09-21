package learnProgramming;

//Hash set is a Class implements Set interface and allows to store unique elements.
// these elements are returned in no particular order.Uses Iterator to display the elements
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet myHashSet = new HashSet();

        myHashSet.add("One");
        myHashSet.add("two");
        myHashSet.add("three");
        myHashSet.add("four");
        myHashSet.add("five");
        myHashSet.add("five");
        myHashSet.add("five");
        myHashSet.add("five");

        System.out.println( myHashSet.add("five"));
        System.out.println(myHashSet.add("six"));
        System.out.println(myHashSet);
        Iterator mySetIterator =  myHashSet.iterator();
        //System.out.println(myHashSet);

        while(mySetIterator.hasNext())
        {
            System.out.println(mySetIterator.next());
        }




    }
}
