import java.util.Random;

public class Shuffle{
    public static int[] shuffleArray(int[] arr, int N){
        //create random constructor for shuffling
        Random r = new Random();

        //traverse form last index to shuffle including itself
        for (int i=N-1;i>=0;i--) {

            int j = r.nextInt(i+1);

            //swap arrr[i] with index i
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7};
        int N = arr.length;
        int ans [] = shuffleArray(arr,N);
        System.out.print("Shuffled array is: ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}