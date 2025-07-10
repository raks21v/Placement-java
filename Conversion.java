public class Conversion {
    public static void main(String args[]){
        float celcius;
        float faranheat;
        celcius = 45.0f;
        faranheat = (celcius*9/5)+32;
        System.out.println(faranheat);
        //conversion from faranheat to celcius
        faranheat = 113.0f;
        celcius = (faranheat-32)*5/9;
        System.out.println(celcius);

    }}