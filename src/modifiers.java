public class modifiers {
    private static String name;  // ✅ Made static

    public static String getName() {
        return name;
    }

    public static void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        setName("Golu");
        System.out.println(getName());  // ✅ Prints: Golu
    }
}
