package com.example.sirjm.sirjm;

import java.util.Random;
/**
 * Created by sirjm on 10/21/16.
 */

public class Motivation {
    private Quote[] mQuotes;

    public Motivation() {
        mQuotes = new Quote[14]; //set length of array to be used below in generating randomNo less than it

        mQuotes[0] = new Quote("Live before you're afraid of dying");
        mQuotes[1] = new Quote("Appreciation is the key to happiness");
        mQuotes[2] = new Quote("Be strong when things fall apart");
        mQuotes[3] = new Quote("worry less, do more, be you");
        mQuotes[4] = new Quote("Don’t force pieces that don’t fit.");
        mQuotes[5] = new Quote("Tomorrow will be a better day.");
        mQuotes[6] = new Quote("Don’t lose yourself over someone else.");
        mQuotes[7] = new Quote("Learn to appreciate before you complain.");
        mQuotes[8] = new Quote("Everyone always has to start somewhere.");
        mQuotes[9] = new Quote("100% of people will die anyway.");
        mQuotes[10] = new Quote("Every hello ends with a goodbye.");
        mQuotes[11] = new Quote("You’ll be what you believe eventually.");
        mQuotes[12] = new Quote("People complain first, before they understand.");
        mQuotes[13] = new Quote("Dedication makes champions out of people.");

    }

    public Quote getARandomQuote() {
        Random randomGen = new Random();
        int randomNo = randomGen.nextInt(mQuotes.length);

        return mQuotes[randomNo];
    }
}
