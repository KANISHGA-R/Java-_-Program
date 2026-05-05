class nullpointer{
    public static void main(String[] args) {
        String studentname = null;
        try{
            System.out.println(studentname.length());
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception Error");
        }
    }
}