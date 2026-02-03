public class StringType {

    public static void main(String[] args) {

        // 1. Feladat: Definiálj prefix néven egy String változót "Hello " értékkel!
        String prefix = "Hello ";

        // 2. Feladat: Definiálj name néven egy String változót "John Doe" értékkel!
        String name = "John Doe";

        // 3. Feladat: Hozz létre egy message változót, amely az előző kettőt összefűzi!
        String message = prefix + name;
        System.out.println(message); // -> Hello John Doe

        // 4. Feladat: Írd felül a message változó értékét úgy, hogy hozzáfűzöd a 444-et!
        message = message + 444;
        System.out.println(message); // -> Hello John Doe444


        // 5. Feladat: Logikai változó, hogy message == "Hello John Doe"-e
        boolean isHelloJohnDoe = message.equals("Hello John Doe");
        System.out.println(isHelloJohnDoe); // false

        // 6. Feladat: Logikai változó, hogy message == "Hello John Doe444"-e
        boolean isHelloJohnDoe444 = message.equals("Hello John Doe444");
        System.out.println(isHelloJohnDoe444); // true


        // 7. Feladat: Üres stringek összefűzése
        String s1 = "";
        String s2 = "";
        String result = s1 + s2;

        System.out.println(result);        // -> üres sor
        System.out.println(result.length()); // -> 0


        // 8. Feladat: String műveletek
        String text = "Abcde";

        // 9. Hossz kiírása
        System.out.println(text.length()); // -> 5

        // 10.Első és harmadik karakter kiírása
        System.out.println(text.charAt(0) + ", " + text.charAt(2)); // -> A, c

        //11. Az első három karakter (0–2 index)
        System.out.println(text.substring(0, 3)); // -> Abc
    }
}
