import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = size;
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {// i<n
            arr[i] = sc.nextInt();
        }
        // for(int i = 0; i<=n-1; i++){
        // System.out.println(i+"--> "+arr[i]);
        // }
        // int sum=0;
        // for(int i = 0; i<=n-1;i++){
        // sum+=arr[i];
        /* sum = sum + sc.nextInt(); */
        // }
        // System.out.println(sum);
        // n(n+1)/2
        /*
         * sum = sum + sc.nextInt();
         * System.out.println(sum);
         */
        // float avg = 0;
        // for(int i = 0; i<=n-1;i++){
        // avg+=arr[i];
        // }
        // avg =(float) avg/n;
        // System.out.println(avg);
        // int flag = -1;
        // int key = sc.nextInt();
        // for(int i=0;i<=n-1;i++){
        // if(arr[i]==key){
        // flag = i;
        // //System.out.println("element in found at index "+i);
        // break;
        // }
        // // if(i==n-1){
        // // System.out.println("element not found");
        // // }
        // if(flag == -1){
        // System.out.println("element not found");
        // } else {
        // System.out.println("element found at index " + flag);
        // }
        // }
        // for(int i = 0;i<=n-1;i++){
        // if(arr[i]==key){
        // System.out.println("element found at index " + i);
        // }
        // if(i==n-1 && arr[i]!=key){
        // System.out.println("element not found");
        // }
        // }
        // int Mindex = 0;
        // int max =arr[0];
        // for(int i=1;i<=n-1;i++){
        // if(max<arr[i]){
        // max=arr[i];
        // Mindex = i;
        // }
        // }
        // int index = 0;
        // System.out.println(max+ " is the maximum element at index " + Mindex);
        // int min =arr[0];
        // for(int i=1;i<n-1;i++){
        // if(max>arr[i]){
        // max=arr[i];
        // index = i;

        // }
        // }
        // System.out.println(min+ " is the minimum element at index " + index);
        // int max = arr[0];
        // int max1 = 0;
        // for (int i = 0; i <= n - 1; i++) {
        // if (max < arr[i]) {
        // max = arr[i];
        // if (max1 <= max && max1 > arr[i]) {
        // max1 = i;
        // }
        // }
        // }
        // System.out.println("2nd largest element is " + max1);

        // for (int i = 0; i <= n - 1; i++) {
        //     for (int j = 0; j <= n - i - 2; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        // Arrays.sort(arr);
        // System.out.println("Sorted array is:");
        // for (int i = 0; i <= n - 1; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // System.out.println("largest element is " + arr[n - 1]);
        // System.out.println("2nd largest element is " + arr[n - 2]);
        // System.out.println("smallest element is " + arr[0]);
        // System.out.println("2nd smallest element is " + arr[1]);
        // int fact = sc.nextInt();
        // for(int i =0; i<=n-1;i++){
        //     if(arr[i]%fact == 0){
        //         System.out.println(arr[i] + " is divisible by " + fact);
        //     } else {
        //         System.out.println(arr[i] + " is not divisible by " + fact);
        //     }
        // }
        // int sum = arr[0];
        // for(int i=1;i<=n-1;i++){
        //     sum+=sum;
        //     arr[i]=sum;
        // }
        // for(int i=0;i<=n-1;i++){
        //     System.out.print(arr[i] + " ");
        // }
        // int ev =0;
        // int esum=0;
        // int oc = 0;
        // int osum = 0;
        // for(int i =0;i<=n-1;i++){
        //     if(arr[i]%2==0){
        //         ev++;
        //         esum += arr[i];
        //     } else {
        //         oc++;
        //         osum += arr[i];
        //     }
        // }
        // System.out.println("Number of even elements: " + ev);
        // System.out.println("Number of odd elements: " + oc);
        // System.out.println(esum+ " "+osum);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int count = 0;
        // for(int i=0;i<=n-1;i++){
        //     if(arr[i]%x==0 && arr[i]% y==0){
        //         count++;
        //     }
        // }
        // System.out.println(count + " elements are divisible by " + x + " and " + y);
        // for(int i =0;i<=n-1;i++){
        //     if(arr[i]%2==0){
        //         System.out.println(i + " is even");
        //     } else {
        //         System.out.println(i + " is odd");
        //     } 
        // }
        // int evenIndex = 0;
        // int oddIndex = 0;
        // for(int i =0;i<=n-1;i++){
        //     if(arr[i]%2==0){
        //         //System.out.println(i + " is even");
        //         evenIndex = i;
        //     } else {
        //         //System.out.println(i + " is odd");
        //         oddIndex = i;
        //     } 
        // }
        // System.out.println("Last even index: " + evenIndex);
        // System.out.println("Last odd index: " + oddIndex);
        // int sum = 0;
        // for(int i=0;i<=n-1;i++){
        //     sum +=arr[i];
        // }
        // double avg = (double) sum / n;
        // System.out.println("Average is: " + avg);
        // for(int i=0;i<n-1;i++){
        //     if(arr[i]>avg){
        //         System.out.print(arr[i] + " ");
        //     }
        // }
        // for(int i =0;i<=n-1;i++){
        //     if(arr[i]%2==0){
        //         System.out.print(arr[i]+" ");
        //     }
        // }
        // for(int i =0;i<=n-1;i++){
        //     if(arr[i]%2!=0){
        //         System.out.print(arr[i]+" ");
        //     }
        // }
        // for(int i = n-1;i>=0;i--){
        //     System.out.print(arr[i] + " ");
        // }
        // for(int i = 0;i<=n-1;i++){
        //     if(arr[i]%3==0){
        //         System.out.println(arr[i] + " "+"is multiple of 3");
        //     } 
        // }
        // prime number in an array
        /*for(int i=0;i<=n-1;i++){
            int num = arr[i];
            int flag = 0;
        }
            */
            //rotate cyclically an arry by position
        // System.out.println("Enter the number of positions to rotate:");
        // int k =sc.nextInt();
        // for(int i = 0;i<=n-1;i++){
        //     for(int j = 0;j<=n-2-i;j++){
        //         if()
        //     }
        // }
        // System.out.println("Array after rotation:");
        // for(int i = 0; i <= n - 1; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        //equilibrium index of an array
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;i<n-1;i++){
            //arr[i]+=leftSum;
            leftSum += arr[i];
        }
        for(int i=n-1;i>=0;i--){
            //arr[i]+=rightSum;
            rightSum += arr[i];
        }
        System.out.println(leftSum + " " + rightSum);
        if(leftSum == rightSum) {
            System.out.println((n/2));
        } else {
            System.out.println("No equilibrium index found.");
        }
        //leaders in an array
        // for(int i=0;i<=n-1;i++){
        //     for(int j=1;j<=n-1-i;j++){
        //         if(arr[j]>arr[i]){
        //             System.out.println(arr[i] + " is a leader in the array");
        //             break; 
        //         }
        //     }
        // }

        
        
      





    }
}
