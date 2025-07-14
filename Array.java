import java.util.Scanner;

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

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - i - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is:");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("largest element is " + arr[n - 1]);
        System.out.println("2nd largest element is " + arr[n - 2]);
        System.out.println("smallest element is " + arr[0]);
        System.out.println("2nd smallest element is " + arr[1]);
    }
}
