import java.util.Scanner;
public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //immutables
        //strings in java is differnt thn other lang
        //str builder n buffer
        String str1 = sc.nextLine();
        //String str2 = sc.nextLine();
        //System.out.println(str1);
        //String str2 = sc.nextLine();
        // System.out.println(str2);
        //System.out.println(str1.length());  
        // for(int i = 0;i<str1.length();i++){   //length() is a method
        //     System.out.println(str1.charAt(i));
        // }
        // char[] ch = str1.toCharArray();//str to char array
        // for(int i = 0;i<=ch.length-1;i++){  //length is a keyword
        //     System.out.println(ch[i]);
        // }
        // for(int i=0;i<=str1.length()-1;i++){
        //     System.out.print(str1.toLowerCase().charAt(i));
        // } 
        // System.out.println(str1 == str2);
        // System.out.println(str1.equals(str2)); 
        // System.out.println(str1.equalsIgnoreCase(str2));
        //int count =1;
        // for(int i=0;i<str1.length();i++){
        //     if(str1.charAt(i)>='A' && str1.charAt(i)<='Z'){
        //         count++;
        //     }
        // } 
        // for(int i=0;i<str1.length();i++){
        //     if(str1.charAt(i)>='a' && str1.charAt(i)<='z'){
        //         count++;
        //     }
        // } 
        // for(int i=0;i<str1.length();i++){
        //     if(str1.charAt(i)>='0' && str1.charAt(i)<='9'){
        //         System.out.println(str1.charAt(i));
        //     }
        // }
        
        // for(int i=0;i<str1.length();i++){
        //     if(str1.charAt(i) == ' '){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        
        //String[] words = str1.split(" ");
    //     for(int i=str1.length()-1;i>=0;i--){
    //         System.out.print(str1.charAt(i));
    //     }
    // for(int i=0;i<str1.length();i++){
    //     if(str1.charAt(i) == ' '){
    //         System.out.println(str1.charAt(i));
    //     } 
    //String[] str2=str1.split(" ");
    // System.out.println(str2.length);
    // for(int i=0;i<str2.length;i++){
    //     System.out.println(str2[i]);
    // }
    // for(int i=str2.length-1;i>=0;i--){
    //     System.out.println(str2[i]);
    // }
    // int c=0;
    // for(int i=0;i<=str1.length()-1;i++){
    //     if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u' ||
    //        str1.charAt(i) == 'A' || str1.charAt(i) == 'E' || str1.charAt(i) == 'I' || str1.charAt(i) == 'O' || str1.charAt(i) == 'U'){
    //         c++;
    //     } 
    // }
    // System.out.println(c);
    // for(int i=0;i<str1.length();i++){
    //     for(int j=0;j<str2.length();j++){
    //         if(str1.charAt(i) == str2.charAt(j)){
    //             System.out.println("is substring");
    //             break;
    //         }
    //     }
    // }
    // int index = str1.indexOf(str2);
    // if(index == -1){
    //     System.out.println("not a substring");
    // } else {
    //     System.out.println("is a substring");
    // }
    //test qns
    // String[] str3=str1.split(" ");
    // for(int i=0;i<str3.length;i++){
    //     System.out.println();
    //     for(int j = str3[i].length()-1; j>=0;j--){
    //          System.out.print(str3[i].charAt(j));
    //     }
    // }
    int c=0;
    String[] str4=str1.split(" ");
    for(int i=0;i<=str4.length-1;i++){
        System.out.println(str4[i]);
        c++;
    }
    System.out.println(str4.length);
    System.out.println(c);
     
    //System.out.print(str1.substring(str2.length(), str1.length()));
        
    
        
    }
    
}
