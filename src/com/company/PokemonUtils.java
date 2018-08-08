//package PokemonGame;
package com.company;

import java.io.*;
import java.util.Random;

public class PokemonUtils {
    // This class contains methods that will be used through out the project
    // Static Methods that need no instance, like a read txt file

    public static void displayPokemon(String fileName) throws IOException {
        String filePath = "src\\pokemon text file\\" + fileName;

        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String pokemonAsci;
        while ((pokemonAsci = reader.readLine()) != null){
            System.out.println(pokemonAsci);
        }
    }
    public static int randomNumber(int range){
        Random rand = new Random();
        int number = rand.nextInt(range);
        return number;
    }

    public static int [] noRepeat(int range, int numberOfPicks){
        int[] array = new int[numberOfPicks];
        int counter = 0;
        while(counter != numberOfPicks)
        {
            int randnum = randomNumber(range);
            if (contains(array, randnum) == false) {
                array[counter] = randnum;
                counter++;
            }
        }
//        Arrays.sort(array);
        return array;
    }

    public static boolean contains(int [] a,int number){
        for(int i = 0; i < a.length; i++){
            if (a[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static void swap(Player[] array, int p1Index, int p2index){
        Player temp = array[p1Index];
        array[p1Index] = array[p2index];
        array[p2index] = temp;
    }

    public static void displaySortedArray(Player[] array){
        System.out.println("Results:");
        for(int i = 0; i< array.length; i++){
            System.out.println("Name: " + array[i].getPlayerName() + " Score: " + array[i].getScore());
        }
    }
    // bubble sort
    public static void bubbleSort(Player[]array){
        int temp = 0;
        for(int i =0; i < array.length; i++){
            for(int j = 1; j < i-1; j++){
                if (array[j-1].getScore() > array[j].getScore()){
                    swap(array,j-1, j);
                }
            }
        }
    }
}

