package a1;
import java.util.Arrays;


public class testArrayList {

    /**
     * test creating ArrayList and the size() method
     * print out the entire ArrayList
     */
    private static void test_0() {
        System.out.println("Creating a new ArrayList al");
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Size of al is: " + al.size());
        System.out.println("Print out the al: ");
        System.out.println(Arrays.toString(al.getBackingArray()));
    }

    /**
     * test the resizeArray() method
     * 1. Create a new ArrayList, print it out
     * 2. Resize the backing array, print it again
     */
    // public static void test_1() {
    //     System.out.println("Creating a new ArrayList al...");
    //     ArrayList<String> al = new ArrayList<>();
    //     System.out.println("Printing the al:");
    //     System.out.println(Arrays.toString(al.getBackingArray()));
    //     System.out.println("Resizing the backing array...");
    //     al.resizeArray();
    //     System.out.println("Print the new resized array:");
    //     System.out.println(Arrays.toString(al.getBackingArray()));
    // }

    /**
     * test addToFront()
     * 
     */
    public static void test_2() {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("size is " + al.size());
        // play with different n
        int n = 10;
        for (int i = 0; i < n; i++) {
            al.addToFront(i);
        }
        System.out.println(Arrays.toString(al.getBackingArray()));
        System.out.println("size is " + al.size());
    }

    /**
     * test addToBack()
     * 
     */
    public static void test_3() {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("size is " + al.size());
        // play with different n
        int n = 19;
        for (int i = 0; i < n; i++) {
            al.addToBack(i);
        }
        System.out.println(Arrays.toString(al.getBackingArray()));
        System.out.println("size is " + al.size());
    }

    /**
     * test removeFromFront()
     * 
     */
    public static void test_4() {
        ArrayList<Integer> al = new ArrayList<>();
        // al.removeFromFront(); // NSE exception
        int n = 8;
        int m = 8;
        for (int i = 0; i < n; i++) {
            al.addToBack(i);
        }
        System.out.println(Arrays.toString(al.getBackingArray()));
        for (int j = 0; j < m; j++) {
            al.removeFromFront();
        }
        System.out.println(Arrays.toString(al.getBackingArray()));
    }

    /**
     * test removeFromBack()
     * 
     */
    public static void test_5() {
        ArrayList<Integer> al = new ArrayList<>();
        // al.removeFromFront(); // NSE exception
        int n = 10;
        int m = 3;
        for (int i = 0; i < n; i++) {
            al.addToBack(i);
        }
        System.out.println(Arrays.toString(al.getBackingArray()));
        for (int j = 0; j < m; j++) {
            al.removeFromBack();
        }
        System.out.println(Arrays.toString(al.getBackingArray()));
    }

    /**
     * test returned value of remove methods
     * 
     */
    public static void test_returnedData() {
        ArrayList<Integer> al = new ArrayList<>();
        al.addToFront(1);
        al.addToFront(2);
        al.addToBack(3);
        System.out.println(Arrays.toString(al.getBackingArray()));
        System.out.println("Removed data from back: " + al.removeFromBack());
        System.out.println("Removed data from front: " + al.removeFromFront());
        System.out.println(Arrays.toString(al.getBackingArray()));
    }

    /**
     * test adding null to list
     * 
     */
    public static void test_addNull() {
        ArrayList<String> al = new ArrayList<>();
        al.addToFront(null);
    }

    public static void main(String[] args) {

        //test_0();
        //test_1();
        //test_2();
        //test_3();
        //test_4();
        //test_5();
        //test_returnedData();
        test_addNull();
    }
}
