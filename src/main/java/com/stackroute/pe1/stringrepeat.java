package com.stackroute.pe1;
import java.util.*;
public class stringrepeat{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String g= sc.next();
        Scanner sca= new Scanner(System.in);
        int n= sca.nextInt();
        String x ="";
        String d="";
        for(int i=0;i<n;i++){
        for(int j=g.length()-n;j<g.length();j++)
        {

            x=x+(g.charAt(j));}

        }
System.out.println(g+x);

    }
}
