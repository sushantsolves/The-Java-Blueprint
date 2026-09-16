class Mutable{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Sushant");
        System.out.println(sb.length());            //OP: 7 (As simples as before)
        System.out.println(sb.capacity());          //OP: 23
        //It is giving this much of extra space as backup like if we change something and and string stores this in continuous memory in heap but after change the space will be taken by other, It gives (30-currentstrlength)

        sb.append(" Raj");      //value changed


        //Converting buffer to a string
        //String str = sb;            //issue arased
        String str = sb.toString();     //we can use this



        //Keywords for buffer
        sb.insert(0, " java ");  //(index, string)          --> java Sushant Raj

        sb.deleteCharAt(2);

        sb.setLength(40);       //(newLength) -> for future edits or we can assign value here later and stored space for it now.

        sb.ensureCapacity(100);     //(minimum Capacity will be 100 now.)




        /*NOTE:
        --> What is the difference between String Buffer and String Builder ?
            so string buffer is thread safe(discussed later) and builder is not */
    }
}