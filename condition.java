class condition{
    public static void main(String[] args) {

        String s = " Hello World ";
        String s2 = "hello world";

        System.out.println("Length: " + s.length());

        System.out.println("isEmpty: " + s.isEmpty());

        System.out.println("isBlank: " + s.isBlank());

        System.out.println("equals: " + s.equals(s2));

        System.out.println("equalsIgnoreCase: " + s.equalsIgnoreCase(s2));

        System.out.println("compareTo: " + s.compareTo(s2));

        System.out.println("contains 'World': " + s.contains("World"));

        System.out.println("charAt(1): " + s.charAt(1));

        System.out.println("substring(1,5): " + s.substring(1, 5));

        System.out.println("indexOf 'o': " + s.indexOf('o'));

        System.out.println("lastIndexOf 'o': " + s.lastIndexOf('o'));

        System.out.println("startsWith ' He': " + s.startsWith(" He"));

        System.out.println("endsWith 'ld ': " + s.endsWith("ld "));

        System.out.println("toUpperCase: " + s.toUpperCase());

        System.out.println("toLowerCase: " + s.toLowerCase());

        System.out.println("trim: '" + s.trim() + "'");

        System.out.println("strip: '" + s.strip() + "'");

        System.out.println("replace: " + s.replace("World", "Java"));

        System.out.println("repeat: " + "Hi ".repeat(3));

        System.out.println("concat: " + s.concat("!!!"));

        String[] arr = s.split(" ");
        System.out.println("split:");
        for (String word : arr) {
            System.out.println(word);
        }

        String joined = String.join("-", "A", "B", "C");
        System.out.println("join: " + joined);
        int num = 100;
        String strNum = String.valueOf(num);
        System.out.println("valueOf: " + strNum);
    }
}