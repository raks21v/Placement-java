import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  =sc.nextInt();
        int n = size;
        int[] arr = new int[n];
        for(int i = 0; i<=n-1; i++){//i<n
            arr[i]= sc.nextInt();
        }
        // for(int i = 0; i<=n-1; i++){
        //     System.out.println(i+"--> "+arr[i]);
        // }
        int sum=0;
        for(int i = 0; i<=n-1;i++){
            //sum+=arr[i];
               /*sum = sum + sc.nextInt();*/
        }
        // System.out.println(sum);
        //n(n+1)/2
        /*sum = sum + sc.nextInt();
        System.out.println(sum); */
        // float avg = 0;
        // for(int i = 0; i<=n-1;i++){
        //     avg+=arr[i];
        // }
        // avg =(float) avg/n;
        // System.out.println(avg);
        int key = sc.nextInt();
        for(int i=0;i<=n-1;i++){
            if(arr[i]==key){
                System.out.println("element in found at index "+i);
                break;
            }
        }

    }
    
}
