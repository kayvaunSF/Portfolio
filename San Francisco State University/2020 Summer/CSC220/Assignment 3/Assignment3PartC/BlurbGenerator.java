/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: BlurbGenerator.java
 * Author: Java Foundation
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package Assignment3PartC;

import java.util.Random;


public class BlurbGenerator {

    private Random generator;
    /**
     * Instantiates a random number generator needed for blurb creation.
     */
    public BlurbGenerator() {
        generator = new Random();
    }

    /**
     * Generates and returns a random Blurb. A Blurb is a Whoozit followed by
     * one or more Whatzits.
     */
    public String makeBlurb() {
        return makeMultiWhatzits() + makeWhoozit() + makeYString();
    }

    /**
     * Generates a random Whoozit. A Whoozit is the character 'x' followed by
     * zero or more 'y's.
     */
    private String makeWhoozit() {
        String Whoozit = "x";
        if (generator.nextInt() > 0){
            Whoozit += makeWhoozit();
        }
        return Whoozit;
    }

    /**
     * Recursively generates a string of zero or more 'y's.
     */
    private String makeYString() {
        String YString = "";
        if (generator.nextBoolean()){
            YString += 'y' + makeYString();
        }
        return YString;
    }

    /**
     * Recursively generates a string of one or more Whatzits.
     */
    private String makeMultiWhatzits() {
        String Whatzits = makeWhatzit();
        if (generator.nextBoolean()){
            Whatzits += makeMultiWhatzits();
        }
       return Whatzits;
    }

    /**
     * Generates a random Whatzit. A Whatzit is a 'q' followed by either a 'z'
     * or a 'd', followed by a Whoozit.
     */
    private String makeWhatzit() {
        String Whatzit = "q";
        if (generator.nextBoolean()){
            Whatzit = Whatzit + "z";
        }
        else
        {
            Whatzit = Whatzit + "d";
            Whatzit += makeWhatzit();
        }
        return Whatzit;        
    }
}