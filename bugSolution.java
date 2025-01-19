public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (0 <= 4 && 4 < arr.length) { 
            System.out.println(arr[4]); // Accessing a valid element
        }
        else{
            System.out.println("Index out of bound");
        }
    }
}