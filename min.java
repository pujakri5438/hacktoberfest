public class min{
    public static int minimum(int[] arr){
        int min1 = arr[0];
        for(int i = 1;i < arr.length;i++)
        {
            if(arr[i] < min1)
            min1 = arr[i];
        }
        return min1;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    int i;
    for(i = 0;i < arr.length;i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.println("Minimum number="+minimum(arr));
    }
}
