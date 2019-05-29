package arrayShift;/*
 * This Java source file was generated by the Gradle 'init' task.
 */

public class ArrayShift {

    public int[] arrayShift(int[] inputArray, int value){

        int[] outputArray = new int[0];

        if(inputArray.length == 0){
            return new int[]{value};
        }
        else if( inputArray.length == 1){
            outputArray = new int[]{inputArray[0], value};
            return outputArray;
        }

        int middleIndex;

        if((inputArray.length % 2) == 0){
           middleIndex = (inputArray.length/2)- 1;
        }
        else{
            middleIndex = (int) Math.floor(inputArray.length/ 2);

        }

        for(int i=0; i< outputArray.length-1; i++){
            if(i == middleIndex){
                outputArray[i] = value;
            }
            else{
                if(i < middleIndex){
                    outputArray[i] = inputArray[i];
                }
                else{
                    outputArray[i] = inputArray[i]-1;
                }
            }
        }

        return outputArray;
    }
}
