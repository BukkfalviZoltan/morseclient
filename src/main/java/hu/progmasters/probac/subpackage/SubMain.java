package hu.progmasters.probac.subpackage;

import hu.progmasters.probac.Morse;

public class SubMain {
    /**
     * Client code that uses Morse class from probac.
     * @param args default arguments.
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Morse morse = new Morse();
        System.out.println(morse.ConvertText2Morse("ABA BABA KRUMPLI"));
        //getPosInAlphabet and printMorseCode is not public in
        // hu.progmaster.probac.Morse class
        //Only public methods can be called outside its package,
        // whether you're in a subpackage or parent package
        /*
        System.out.println(morse.getPosInAlphabet("C"));
        morse.printMorseCode("ABA BABA KRUMPLI");
        */
    }
}