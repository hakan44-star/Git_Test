package Yazılım_Bilimi;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            if (i==2 || i==7){
                continue;}
                else if (i==8){
                    break;
                }System.out.println(" i = " + i);

            }


        }
}
