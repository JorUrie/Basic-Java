public class Storing_Similar_Values {
    public static void main(String[] args){
        int numberArray[];
        numberArray = new int[10];
        numberArray[0] = 100;
        numberArray[1] = 101;
        // Accessing a single member
        int num = numberArray[4];
        // So to get the count of total values stored in the array
        int count = numberArray.length;
        for (int i = 0; i < numberArray.length; i++){
            System.out.println(numberArray[i] = i);
        }
    }
}
