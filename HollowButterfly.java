public class HollowButterfly {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==1 ||i ==2)
                System.out.print("*");
                else
                
            }
            for(int k=2*i;k<=10-2*i;k++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
