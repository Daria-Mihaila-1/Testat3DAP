public class Testat
{
    public static int apply( int[] arr, int i )
    {
        
        if (i < 0 || i >= arr.length){
            return 0;
        }
        else{
            if (arr[i] > -4 && arr[i] < 4){
                return 1 + apply(arr, i-1);
            }
            else return apply(arr, i-1);
        }
    }
}