import java.util.Scanner;
import java.util.Arrays;

public class Qn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of first array and second array");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // int y = sc.nextInt();
        // int[] arr1 = new int[y];
        // // middle element of two combined array
        // int mid = (n+y)/2;
        // // first half of combined array
        // for(int i=0;i<n;i++){
        // arr[i] = sc.nextInt();
        // }
        // // second half of combined array
        // for(int i=0;i<y;i++){
        // arr1[i] = sc.nextInt();
        // }
        // // merge two arrays
        // int[] arr2 = new int[n+y];
        // for(int i=0;i<n;i++){
        // arr2[i] = arr[i];
        // }
        // for(int i=n;i<n+y;i++){
        // arr2[i] = arr1[i-n];
        // }

        // // sort the merged array
        // Arrays.sort(arr2);
        // // print the middle element
        // for(int i=0;i<n+y;i++){
        // System.out.print(arr2[i]+" ");
        // }
        // System.out.println("Mid = "+arr2[mid]);
        // sc.close();

        // String[] s = sc.nextLine().split(" ");
        // int n = s.length;
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        // arr[i] = Integer.parseInt(s[i],10);
        // }
        // String[] s1 = sc.nextLine().split(" ");
        // int m = s1.length;
        // int[] arr1 = new int[m];
        // for(int i=0;i<m;i++){
        // arr1[i] = Integer.parseInt(s1[i],10);
        // }
        // int i=0,j=0;
        // int arr2[] = new int[n+m];
        // int k=0;
        // while(i<n && j<m){
        // if(arr[i]< arr1[j]){
        // arr2[k++] = arr[i++];
        // } else if(arr1[j] < arr[i]){
        // arr2[k++] = arr1[j++];
        // }else{
        // arr2[k++] = arr[i++];
        // arr2[k++] = arr1[j++];
        // }

        // }
        // while(i<n){
        // arr2[k++] = arr[i++];
        // }
        // while(j<m){
        // arr2[k++] = arr1[j++];
        // }
        // int size = n + m;
        // double mid = 0;
        // if(size % 2 == 0){
        // mid = (arr2[size/2] + arr2[(size/2)-1]) / 2.0;
        // } else {
        // mid = arr2[size/2];
        // }
        // System.out.println("Merged Array: " + Arrays.toString(arr2));
        // System.out.println("Middle Element: " + mid);

        // kth largest element

        // String[] s = sc.nextLine().split(",");
        // int n = s.length;
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        // arr[i] = Integer.parseInt(s[i],10);
        // }
        // int k = sc.nextInt();
        // for(int i=0;i<n;i++){//i=0;i<n-1;i++
        // for(int j=i+1;j<n;j++){//j=0;j<n-i-1;j++
        // if(arr[i] < arr[j]){
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }
        // for(int i=0;i<n;i++){
        // System.out.print(arr[i] + " ");
        // }
        // if(k <= n && k > 0){
        // System.out.println("The " + k + "th largest element is: " + arr[k-1]);
        // } else {
        // System.out.println("Invalid value of k");
        // }
        /*
         * for(int i =0;i<n-1;i++){
         * for(int j=0;j<n-i-1;j++){
         * if(arr[j] > arr[j+1]){
         * int temp = arr[j];
         * arr[j] = arr[j+1];
         * arr[j+1] = temp;
         * }
         * }
         * }
         * System.out.println(arr[n-k] + " is the " + k +
         * "th largest element in the array.");
         * 
         */
        // duplicate elements in an array
        String[] s = sc.nextLine().split(",");
        int n = s.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i], 10);
        }
        int count = 0;
        int[] duplicate = new int[n];
        // for(int i=0;i<n;i++){
        // for(int j=i+1;j<n;j++){
        // if(arr[i] == arr[j]){
        // count++;
        // duplicate[count-1] = arr[i];
        // //System.out.println("Duplicate element found:" + arr[i]);
        // break;
        // }
        // }
        // }
        int x = 0;
        for (int i = 0; i < n - 1; i++) {
            count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    // break; // break the inner loop if a duplicate is found
                }
                if (count > 0) {
                    int flag = 0;
                    for (int m = 0; m < x; m++) {
                        if (arr[i] == duplicate[m]) {
                            flag = 1; // already exists
                            break;
                        }
                    }
                    if (flag == 0) {
                        duplicate[x] = arr[i];
                        x++;
                    }
                }
            }
            // for(int k=0;k<duplicate.length;k++){
            // System.out.print(duplicate[k] + " ");
            // }
        }
        System.out.print("[");
        for (int i = 0; i < x; i++) {
            System.out.print(duplicate[i]);
            if (i < x - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    // for(int i = 0;i<count;i++){
    // System.out.print(duplicate[i] + " ");
    // }

}
