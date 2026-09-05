class MultiDim{
    public static void main(String[] args){
        //declaration of a multi dimensional array
        int nums[][] = new int[3][4];



        //To assign random values to the array
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                nums[i][j] = (int)(Math.random() *100);
            }
        }



        //to show all the values
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }




        //Showing all values with a enhanced for loop
        for(int n[]: nums)          //here n is a simple array, which is going to throw a complete 1D array at once instead of each element. means n is a int array, which takes one array at a time from nums.
        {
            for(int m: n){          //now this line means, m is a int variable, which takes each value from array n.
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}