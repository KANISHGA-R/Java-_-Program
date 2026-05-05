class array_indexexception{
    public static void main(String[] args){
        int marks[]={85,90,78};
        try{
            System.out.println(marks[5]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Error");
        }
    }
}