package hu.progmasters.probac;

public class Main {
    /**
     * Client code that uses Morse class from probac.
     * @param args default arguments.
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Morse morse = new Morse();
        System.out.println(morse.ConvertText2Morse("ABA BABA KRUMPLI"));
        System.out.println(morse.getPosInAlphabet("C"));
        morse.printMorseCode("ABA BABA KRUMPLI");
    }
}