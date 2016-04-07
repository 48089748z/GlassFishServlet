import java.util.ArrayList;
public class Cesar
{
        private static ArrayList<String> letters = new ArrayList<>();
        public static String convert(String message)
        {
            String toReturn = "";
            fillHelperArray();
            String frase = message.toUpperCase();
            for (int x=0; x<28; x++)
            {
                toReturn = toReturn+"<br></br>";
                for (Integer y=0; y<frase.length(); y++)
                {
                    boolean other = true;
                    for (int z=0; z<28;z++)
                    {
                        if (letters.get(z).equals(String.valueOf(frase.charAt(y))))
                        {
                            toReturn = toReturn+letters.get(z + x);
                            other = false;
                            if (letters.get(z).equals("A")) {break;}
                        }
                    }
                    if (other) {toReturn = toReturn+String.valueOf(frase.charAt(y));}
                }
            }
            return toReturn;
        }
        public static void fillHelperArray()
        {
            for (int x = 0; x < 10; x++)
            {
                letters.add("A");
                letters.add("B");
                letters.add("C");
                letters.add("D");
                letters.add("E");
                letters.add("F");
                letters.add("G");
                letters.add("H");
                letters.add("I");
                letters.add("J");
                letters.add("K");
                letters.add("L");
                letters.add("M");
                letters.add("N");
                letters.add("Ñ");
                letters.add("O");
                letters.add("P");
                letters.add("Q");
                letters.add("R");
                letters.add("S");
                letters.add("T");
                letters.add("U");
                letters.add("V");
                letters.add("W");
                letters.add("X");
                letters.add("Y");
                letters.add("Z");
            }
        }
}
