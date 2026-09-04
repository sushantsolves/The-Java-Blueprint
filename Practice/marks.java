/*
i/p: 45 67 84

O/P:
Total = 
average = 00.00
highest = 
result = PASS/ FAIL

*/

import java.util.*;
class marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        
        //OP1
        System.out.println("Total = "+ (m1+m2+m3));

        //OP2
        float avg = (float)(m1+m2+m3)/3;
        System.out.printf("average = %.2f %n" , avg);

        //OP3
        if(m1>m2){
            if(m1>m3){
                System.out.println("highest = "+m1);
            }else{
                System.out.println("highest = "+ m3);
            }
        }else{
            if(m2>m3){
                System.out.println("Highest = " + m2);
            }
            else{
                System.out.println("Highest = "+ m3);
            }
        }

        //OP4
        String result;
        if(m1 > 33 && m2>33 && m3>33 && avg > 40){
            result = "PASS";
        }else{
            result = "FAIL";
        }
        System.out.println("result = "+result);
    }
}