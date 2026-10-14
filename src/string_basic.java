public class string_basic {
    public static void main(String[] args) {
        String name="ajay kumar";
        String branch="CSE";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.replace("kumar","shetty"));
        //System.out.println(name.compareTo(branch));
        System.out.println(name.equals(branch));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.startsWith("a"));
        System.out.println(name.endsWith("y"));
        System.out.println(name.substring(2,5));
        System.out.println(name.charAt(3));
        System.out.println(name.contains("a"));
        System.out.println(name.isEmpty());
        System.out.println(name.toString());
        System.out.println(name.equalsIgnoreCase(branch));

    }
}
