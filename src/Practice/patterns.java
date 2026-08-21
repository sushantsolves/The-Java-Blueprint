class Pattern{
    public static void main(String arr[]){
        /*
        *****
        *****
        *****
        *****
        *****
        */
    //    for(int i=1; i<=5; i++){
    //         System.out.println("*****");
    //    }



       /*
        *
        **
        ***
        ****
        *****
        */
    //    for(int i=1; i<=5; i++){
    //     System.out.print("*".repeat(i));
    //    }
    //OR

    // for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


        /*
        *****
        ****
        ***
        **
        *
        */
       for(int i=1; i<=5; i++){
        for(int j=5+1-i; j>=1; j--){
            System.out.print("*");
        }
       }


    }
}
