package realizationoflists;

import java.util.ArrayList;
import java.util.List;

public class Demonstration {

    public static void main(String[] args) {

        //Creation of collection for further adding to my ArrayList.
        ArrayList<Integer> init = new ArrayList<>(2);
        init.add(1);
        init.add(2);
        
        //Realization of own class.
        //Lists creation.
        System.out.println("Demonstration of lists creation.");

        System.out.print("1st list - without capacity definition: ");
        MyArrayList<String> obStr = new MyArrayList<>();
        System.out.println(obStr.toString());

        System.out.print("2nd list - with capacity definition: ");
        MyArrayList<Integer> obInt = new MyArrayList<>(3);
        System.out.println(obInt.toString());

        System.out.print("3rd list - from other collection: ");
        MyArrayList<Integer> obFromOtherList = new MyArrayList<>(init);
        System.out.println(obFromOtherList.toString());

        //Methods' realization.
        System.out.println("\nMethods.");
        System.out.print("Method add to 2nd list (adding of elements in frame of initial capacity): ");
        obInt.add(10);
        obInt.add(20);
        obInt.add(30);
        System.out.println(obInt.toString());
        System.out.print("Method add to 2nd list (adding of elements HIGHER THAN initial capacity): ");
        obInt.add(40);
        System.out.println(obInt.toString());

        System.out.print("Method add All (3rd list is added to 2nd list: ");
        obInt.addAll(init);
        System.out.println(obInt.toString());

        System.out.println("\nGet element under the index 3: " + obInt.get(3));
        System.out.println("Realization of indexOf function for element '30'. Index is: " + obInt.indexOf(30));
        System.out.println("Realization of indexOf function for element '6'. Index is: " + obInt.indexOf(6));
        
        //Elements of own class.
        TestClass Obj1 = new TestClass();
        TestClass Obj2 = new TestClass();
        
        System.out.println("\nCreation of list with elements of own class.");
        MyArrayList<TestClass> ownClassList = new MyArrayList<>(3);
        ownClassList.add(Obj1);
        ownClassList.add(Obj2);
        ownClassList.add(Obj1);
        System.out.println(ownClassList.toString());
        System.out.println("Get element under the index 0: " + ownClassList.get(0));
    }

}
