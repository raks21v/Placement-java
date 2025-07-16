import java.util.Scanner;
public class TwoDarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<=r-1;i++){
            for(int j=0;j<=c-1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //int sum = 0;
        // for(int i=0;i<=r-1;i++){
        //     for(int j=0;j<=c-1;j++){
        //         System.out.print(arr[i][j] + " ");
        //         sum += arr[i][j];
        //     }
        //     System.out.println();
        // }
        // 
        // for(int i=0;i<=r-1;i++){
        //     sum = 0;//reset sum for each row
        //     for(int j=0;j<=c-1;j++){
        //         //System.out.print(arr[i][j] + " ");
        //         sum += arr[i][j];
        //     }
        //     System.out.println();
        //     System.out.println(sum);
        // }
        // int k = sc.nextInt();
        //  for(int i=0;i<=r-1;i++){
        //     for(int j=0;j<=c-1;j++){
        //         if(arr[i][j] == k){
        //             System.out.println("Element found ");
        //         }
                
        //     }
        //     System.out.println();
        // }
        
    sc.close(); 
    } 
}
