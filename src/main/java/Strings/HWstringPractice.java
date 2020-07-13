package Strings;

public class HWstringPractice {
    public static void main(String[] args) {
        String hwStr = "Это моя строка из ДЗ";
        String hwStr2 = "Это моя вторая строка из ДЗ";
        String hwStr3 = "Это моя строка из дЗ";
        String hwStr4 = "Это моя строка";
        String hwStr5 = "       Это моя строка из ДЗ так то      ";
        System.out.println("hwStr.contains(м) = " + hwStr.contains("м"));

        System.out.println("hwStr.equals(hwStr2) = " + hwStr.equals(hwStr2));

        System.out.println("hwStr.substring(4,14) = " + hwStr.substring(4, 14));

        System.out.println("hwStr.compareTo(hwStr3) = " + hwStr.compareTo(hwStr3)); // вернул 0 так как строки равны
        System.out.println("hwStr.compareTo(hwStr4) = " + hwStr.compareTo(hwStr4)); // вернул положительное число так как 1 строка больше
        System.out.println("hwStr.compareTo(hwStr5) = " + hwStr.compareTo(hwStr5)); // вернул отрицательное число так как 1 строка меньше

        System.out.println("hwStr.hashCode() = " + hwStr.hashCode());

        System.out.println("hwStr.intern() = " + hwStr.intern()); // показывает содержание строки

        System.out.println("hwStr.charAt(5) = " + hwStr.charAt(5));
        System.out.println("hwStr.length() = " + hwStr.length());
        System.out.println("hwStr.isEmpty() = " + hwStr.isEmpty());
        System.out.println("hwStr.toString() = " + hwStr.toString());

        System.out.println("hwStr.subSequence(4,14) = " + hwStr.subSequence(4, 14));
        System.out.println("hwStr.concat(hwStr5) = " + hwStr.concat(" " + hwStr5));
        System.out.println("hwStr.compareToIgnoreCase(hwStr3) = " + hwStr.compareToIgnoreCase(hwStr3));
        System.out.println("hwStr.equalsIgnoreCase(hwStr3) = " + hwStr.equalsIgnoreCase(hwStr3));
        System.out.println("hwStr.replace(\"о\",\"\") = " + hwStr.replace("о", "")); //можно и удалить символ, так же поменять на другой
        System.out.println("hwStr.repeat(3) = " + hwStr.repeat(3));
        System.out.println("hwStr5.trim() = " + hwStr5.trim()); //удаление пробелов в начале и конце предложения
        System.out.println("hwStr.endsWith(\"ДЗ\") = " + hwStr.endsWith("ДЗ")); //проверка окончания строки
        System.out.println("hwStr.getBytes() = " + hwStr.getBytes());
        System.out.println("hwStr.isBlank() = " + hwStr.isBlank()); // возвращает true, если строка пустая или содержит только пробелы

        System.out.println("hwStr.matches(\"Это моя(.*)\") = " + hwStr.matches("Это моя(.*)")); //true только при условии полного соответствия регулярного выражения

        for (String stringHW : hwStr.split(" ",0)) { //разделение строки вокруг регулярного выражения limit это лимит получаемых строк
            System.out.println(stringHW);
        }

        System.out.println("hwStr5.strip() = " + hwStr5.strip()); //убирает пробелы в конце и в начале, до первого не пробела
        System.out.println("hwStr5.stripLeading() = " + hwStr5.stripLeading()); //убирает пробелы в конце, до первого не пробела
        System.out.println("hwStr5.stripTrailing() = " + hwStr5.stripTrailing()); //убирает пробелы в начале, до первого не пробела

        System.out.println("hwStr.toLowerCase() = " + hwStr.toLowerCase());
        System.out.println("hwStr.toUpperCase() = " + hwStr.toUpperCase());

        System.out.println("patternmather.validate(\"frrs@fsdf.com\") = " + patternmather.validate("frrs@fsdf.com"));
        System.out.println("patternmather.validate(\"alesa@dmvcom\") = " + patternmather.validate("alesa@dmvcom"));


    }
}
