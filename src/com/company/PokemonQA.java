//package PokemonGame;
package com.company;


public class PokemonQA {
    private String Question;
    private String fileName;
    private int answer;

    public PokemonQA(String q,String f, int a){
        this.Question = q;
        this.answer = a;
        this.fileName = f;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    // Determine the user answer is correct or not
    public boolean checkAnswer(int userAnswer){
        if (userAnswer == answer)
            return true;
        else
            return false;
    }
}
