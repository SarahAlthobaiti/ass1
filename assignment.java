public class assignment{

public static int traversal(int[] A){

    for(int i = 0; i < A.length; i++){
        A[i] = Math.pow(A[i],2);
    }
}

public static int search(int[]A, int size, int count, int key){

for(int i = 0; i < count ; i++){
    if(key == A[i]){
        return i;
    }
}
  return -1 ;
}

public static void delete(int[]A, int length, int count, int key){

    if(count == 0){
      
        System.out.println("Array isc empty");
    }
    else{

        i = search(A, length, count, key);
        if(i == -1){

            System.out.println("Not found");
        }
        else{
            for(int j = i; j < count -1; j--){
                A[j] = A[j+1] ;
            }
            count = count - 1;
        }

    }
}

public static void InsertUnsorted(int[] A, int count, int size, int key){

    if(count == size){
        System.out.println("Array is full");
    }
    else{

        A[count]= key;
        count = count + 1;
    }

}

public static void InsertSorted(int A[], int count, int size, int key){
    if(count == size){
        System.out.println("Array is full");
    }
    else{
        for(int i = 0; i < count; i++){
            if(key < A[i]){
                for(int j = count; j < i+1; j--){
                    A[j] = A[j - 1];
                }
            }
        }
    }
}

public static void sort(int[]A, int count){
    int temp ;
    for( int i = 0; i < count-1; i++){
      for(int j = i+1; j < count; j++){
        if(A[i]< A[j]){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
      }
    }
}



public static void main(String[] args){

int[] myArray = {1,2,3,4,5};





}







}