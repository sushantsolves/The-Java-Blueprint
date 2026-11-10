// Solving diamond problem but using only 2 for loops 
/*
  *                 *                           *
 ***               ***                         ***
*****             *****                       *****
 ***             *******                     *******
  *               *****                     *********
                   ***                     ***********
                    *                       *********
                                             *******
                                              *****
                                               ***
                                                *
*/

class pattern{
    public static void main(String[] args){
        int n =7;
        int m = (n/2)+1;

        for(int i=1; i<=n; i++){
            for(int j=1;j<= Math.abs(m-i); j++){
                System.out.print(" ");
            }
            if (i<=m){
                System.out.print("*".repeat(2*i -1));
            }else{
                System.out.print("*".repeat((n+1-i)*2 -1));
            }
            System.out.println();
        }
    }
}