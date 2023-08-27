// Sarah Mohammed Althobiti / Id : 444004881

import java.util.Random;

public class assignment {

    public static void traversal(int[] A,int count) {

        for (int i = 0; i < count; i++) {
            A[i] = (int) Math.pow(A[i], 2);
        }
        print(A, count);
    }

    public static int search(int[] A, int size, int count, int key) {

        for (int i = 0; i < count; i++) {
            if (key == A[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void delete(int[] A, int length, int count, int key) {

        if (count == 0) {

            System.out.println("Array isc empty");
        } else {

            int i = search(A, length, count, key);
            if (i == -1) {

                System.out.println("Not found");
            } else {
                for (int j = i; j < count - 1; j++) {
                    A[j] = A[j + 1];

                }
                count = count - 1;

            }

        }
        print(A, count);
    }

    public static void InsertUnsorted(int[] A, int count, int size, int key) {

        if (count == size) {
            System.out.println("Array is full");
        } else {

            A[count] = key;

            count = count + 1;
        }
        print(A, count);

    }

    public static void InsertSorted(int A[], int count, int size, int key) {
        if (count == size) {
            System.out.println("Array is full");
        } else {
            for (int i = 0; i < count; i++) {
                if (key < A[i]) {
                    count++;
                    for (int j = count ; j > i ; j--) {                   
                        A[j] = A[j - 1];
                        //A[i] = key;
                       // count = count + 1;


                    }
                    A[i] = key;
                    break;
                }
            }
        }
        print(A, count);
    }

    public static void sort(int[] A, int count) {
        int temp;
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        print(A, count);
    }

    public static void print(int[] A, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(A[i]);
        }
        System.out.println("*****************************");
    }

    public static void main(String[] args) {

     /* int[] myArray = new int[100];
        int count = 10;
        Random rand = new Random();
        for (int i = 0; i < count; i++) {

            myArray[i] = rand.nextInt();
        }*/

        int[] myArray = new int[10];
        myArray[0]= 1;
        myArray[1]= 3;
        myArray[2]= 4;
        int count = 3;
        
       // traversal(myArray, count);
       // System.out.println(search(myArray, myArray.length, count, 1));
       // delete(myArray, myArray.length, count, 3);
       // InsertUnsorted(myArray,count,myArray.length,2);
          InsertSorted(myArray,count,myArray.length, 2);
       // sort(myArray,count);
    }


}