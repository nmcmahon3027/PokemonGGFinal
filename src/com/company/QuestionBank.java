package com.company;

//package PokemonGame;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    // Store the different questions in the ArrayList
    private List<PokemonQA> questions = new ArrayList<>();

    public void storeQuestion(PokemonQA q){
        questions.add(q);
    }

    public PokemonQA getQuestion(int index){
        return questions.get(index);
    }
    public int listSize(){
        return questions.size();
    }
}
