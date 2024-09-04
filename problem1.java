public class problem1 {
    public static void main(String[] args) {
        String name = "Messi goat";

        int screenWidth = 80;

        int nameLength = name.length();
        int spacesBefore = (screenWidth - nameLength) / 2;

        String spaces = " ".repeat(spacesBefore);

        System.out.println(spaces + name);
    }
}

