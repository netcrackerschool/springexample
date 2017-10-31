package com.netcracker.beans;

public class Translator {

    private final Dictionary dictionary;

    public Translator(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String getTranslation(){
        return "The word is \""+dictionary.getWord()+"\"";
    }
}
