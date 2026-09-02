/*
1 = 1
2 3 = 5
4 5 6 = 15
7 8 9 10 = 34
Total = 55

 */

import java.util.Scanner;
class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 1;
        int rowsum = 0;
        int total = 0;
        //for the number of lines
        for(int i=1; i<=n; i++){
            //inside every line
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                rowsum += num;
                num++;
            }
            System.out.println("= "+ rowsum);
            total += rowsum;
            rowsum = 0;
        }
        System.out.println("Total = " + total);
        
    }
    
}