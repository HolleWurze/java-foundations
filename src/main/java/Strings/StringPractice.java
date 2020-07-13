package Strings;

public class StringPractice {
    public static void main(String[] args) {
        String name = "George";
        String nameCopy = "George";

        System.out.println("(name == nameCopy) = " + (name == nameCopy));

        String nameConstructor = new String("George");

        System.out.println("(name == nameConstructor) = " + (name == nameConstructor));

        String interName = nameConstructor.intern();

        System.out.println("(name == interName) = " + (name == interName));

        String favoriteStr = "i'm favorite string!";

        System.out.println(favoriteStr.substring(4));
        System.out.println(favoriteStr);

        System.out.println(favoriteStr.substring(4, 12));

        System.out.println(favoriteStr.length());
        StringBuilder sb = new StringBuilder(favoriteStr);
        System.out.println("Begin cycle");
        for (int i = 0; i < 100_000_000; i++) {
//            favoriteStr = favoriteStr + "!";
            sb.append('!');
        }

        System.out.println("End cycle");

    }
}
