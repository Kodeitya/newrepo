import java.io.*;
import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        String str="hello how are u";
        String str2=str.toUpperCase();
        String str3="aditya's";
        String str4="hello this is \\\"rahul\"\\ and \"sanjay\"";
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str.indexOf("how"));
        String nam="aditya";
        System.out.println(2+3+nam.toLowerCase()+2+3);
        System.out.println(str3);
        System.out.println(str4);

        Scanner in= new Scanner(System.in);

        //break and continue statement 
        for(int i=0;i<10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
            if(i==7){
                break;
            }
                
            }
        }

    }


//two backslash to print backslah on terminal
