class JaggedAnd3DArr{
    public static void main(String[] args){
        //--> till now we defined and have a fixed size of an array like in a pattern of 3rows and 4columns, but what if we have different column size in diff row ? Can we define that ? Yes

        int nums[][] = new int[3][];        //jagged -> here we are specifying the number of arrays we have.
        
        nums[0] = new int[3];       //we don't specify the values overthere, but now we have to specifically tell the compiler like how many values do we have in each section.
        nums[1] = new int[4];
        nums[2] = new int[2];


        //Now the question is how we are going to take inputs or show our array ?
        for(int i=0; i< nums.length; i++){
            for(int j=0; j< nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }


        //Now lets do this input/output with enhanced for loop..
        for(int i[]: nums){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }




        //Note: Hey now you can do as much dimensional array as you want.
        int array[][][] = new int[3][4][5];         //not jagged but yes 3D array.

        //And you have make nested loops as much as the dimension of array in order to take input/output.
    }
}