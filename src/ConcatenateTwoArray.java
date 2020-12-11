public class ConcatenateTwoArray {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5};
        int array2[] = {6,7,8,9};
        int concatenate[] = concatenateArray(array1,array2);

        for (int element: concatenate){
            System.out.printf("%-5d", element);
        }
    }

    public static int[] concatenateArray (int array1[], int array2[]){
        int concatenate[] = new int [array1.length + array2.length];
        for (int i = 0; i < concatenate.length; i++) {
            if (i < array1.length){
                concatenate[i] = array1[i];
            } else {
                concatenate[i] = array2[i - array1.length];
            }
        }
        return concatenate;
    }
}
