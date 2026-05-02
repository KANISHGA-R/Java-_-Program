class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Capacity: " + sb.capacity());

        System.out.println("Character at index 2: " + sb.charAt(2));

        sb.delete(0, 5);
        System.out.println("After delete: " + sb);

        sb.trimToSize();
        System.out.println("Capacity after trimToSize: " + sb.capacity());
    }
}