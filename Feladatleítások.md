# Java-Exercises

public class ClassGradeCalculation {

    public static void main(String[] args) {
        //Kérd be a felhasználótól a konzolról a nevét, és ezt mentsd el egy változóba.

        //Kérd be a felhasználótól a konzolról a matekjegyét, és ezt mentsd el egy változóba.

        //Kérd be a felhasználótól a konzolról az irodalomjegyét, és ezt mentsd el egy változóba.

        //Kérd be a felhasználótól a konzolról a történelemjegyét, és ezt mentsd el egy változóba.

        /*
        Írattasd ki a konzolra a diák nevét, illetve a jegyeinek átlagát.
        A konzolra kiírt adat hasonlóan nézzen ki:

        Gipsz Jakab
        Jegyeinek átlaga: 3.25
        */

    }
}

public class AgeCalculator {

    public static void main(String[] args) {
        // Kérd be a felhasználótól a születési évét, és ezt mentsd el egy változóba

        // Hozz létre egy változót thisYear néven, az értéke pedig legyen a jelenlegi évünk

        // A létrehozott thisYear értékéből vond ki a kapott birthYear értékét, és ezt irjuk ki a konzolra

    }
}



    public class B_HelloJoe {
    public static void main(String[] args) {
        /*
        Írasd ki a "Hello Joe" köszönést, ha a konzolról kapott név "Joe", és "Nem vagy Joe" Stringet, ha nem.
         */

    }
} 

public class A_PositiveOrNegative {
    public static void main(String[] args) {
        /*
        Írj egy programot, ami bekér egy egész számot (int) Scanner segítségével és eldönti, hogy a kapott szám
        pozitív, negatív, vagy nulla.
         */

    }
}

public class StringType {

    public static void main(String[] args) {
        String prefix = "Hello ";


        public class StringType {

            public static void main(String[] args) {
                String name = "John Doe";

                public class StringType {

                    public static void main(String[] args) {
                        String prefix = "Hello ";
                        String name = "John Doe";

                        // Az összefűzött message változó
                        String message = prefix + name;

                        System.out.println(message); // opcionális kiíratás
                    }
                }
                public class StringType {

                    public static void main(String[] args) {
                        String prefix = "Hello ";
                        String name = "John Doe";
                        String message = prefix + name;

                        // Felülírás: hozzáfűzzük a 444-et
                        message = message + 444;

                        System.out.println(message); // -> Hello John Doe444
                    }
                }
                public class StringType {

                    public static void main(String[] args) {
                        String prefix = "Hello ";
                        String name = "John Doe";
                        String message = prefix + name;

                        // Hozz létre egy logikai változót, ami tartalmazza azt, hogy a message értéke "Hello John Doe"-e!
                        boolean isHelloJohnDoe = message.equals("Hello John Doe");
                    }
                }
                public class StringType {

                    public static void main(String[] args) {
                        String prefix = "Hello ";
                        String name = "John Doe";
                        String message = prefix + name;

                        boolean isHelloJohnDoe = message.equals("Hello John Doe");

                        // Hozz létre egy másik logikai változót, ami tartalmazza azt, hogy a message értéke megegyezik-e
                        // a "Hello John Doe444" értékkel!
                        boolean isHelloJohnDoe444 = message.equals("Hello John Doe444");
                    }
                }
                public class StringType {

                    public static void main(String[] args) {
                        String prefix = "Hello ";
                        String name = "John Doe";
                        String message = prefix + name;
                        message = message + 444;

                        // Logikai változó, ami megmondja, hogy a message értéke "Hello John Doe"-e
                        boolean isEqual = message.equals("Hello John Doe");

                        System.out.println(isEqual); // false lesz, mert a message = "Hello John Doe444"
                    }
                }
                String s1 = "";
                String s2 = "";

                String result = s1 + s2;
                System.out.println(result);            // kiírja az eredményt
                System.out.println(result.length());   // kiírja a hosszát
                String text = "Abcde";

// Az "Abcde" String hossza
                System.out.println(text.length());

// Az első és harmadik karaktere (0-tól indexelünk) vesszővel elválasztva
                System.out.println(text.charAt(0) + ", " + text.charAt(2));

// Az elsőtől a harmadik karakterig tartó részlete
// substring(0, 3) → 0. indextől indul és a 3. indexig tart, a 3-at már nem tartalmazza
                System.out.println(text.substring(0, 3));

            }
        }

    }
}
