//package PokemonGame;
package com.company;


import java.io.IOException;
import java.util.Scanner;
//import PokemonGame.PokemonUtils;

public class GuessingGame implements Game {
    // Global Vars
    private QuestionBank qB = new QuestionBank();
    private PlayerQueue myPlayers = new PlayerQueue();
    private Scanner input = new Scanner(System.in);
    private final int NUMBER_OF_PICKS = 10;
    private Player playersResults[];


    // setup method is where all question objects are going to be made and stored into the Question Bank for later use
    @Override
    public void setUp() {
        // Questions with options
        // Template
//        String question = "Who is this Pokemon?" +
//                "\n1." +
//                "\n2." +
//                "\n3." +
//                "\n4.";
//        int answer = 1;
//        String file = ".txt";

        String question1 = "Who is this Pokemon?" +
                "\n1.Abra" +
                "\n2.Alakazam" +
                "\n3.Arbok" +
                "\n4.Arcanine";
        int answer1 = 1;
        String file1 = "Abra.txt";

        String question2 = "Who is this Pokemon?" +
                "\n1.Diglett" +
                "\n2.Eevee" +
                "\n3.Alakazam" +
                "\n4.Muk";
        int answer2 = 3;
        String file2 = "Alakazam.txt";

        String question3 = "Who is this Pokemon?" +
                "\n1.Arbok" +
                "\n2.Zubat" +
                "\n3.Weedle" +
                "\n4.Tauros";
        int answer3 = 1;
        String file3 = "Arbok.txt";

        String question4 = "Who is this Pokemon?" +
                "\n1.Staryu" +
                "\n2.Oddish" +
                "\n3.Diglette" +
                "\n4.Arcanine";
        int answer4 = 4;
        String file4 = "Arcanine.txt";

        String question5 = "Who is this Pokemon?" +
                "\n1.Clefairy" +
                "\n2.Beedrill" +
                "\n3.Feaeow" +
                "\n4.Kingler";
        int answer5 = 2;
        String file5 = "Beedrill.txt";

        String question6 = "Who is this Pokemon?" +
                "\n1.Beedrill" +
                "\n2.Rattata" +
                "\n3.BellSprout" +
                "\n4.Squirtle";
        int answer6 = 3;
        String file6 = "BellSprout.txt";

        String question7 = "Who is this Pokemon?" +
                "\n1.Squirtle" +
                "\n2.Blastoise" +
                "\n3.Lapras" +
                "\n4.Pidgey";
        int answer7 = 2;
        String file7 = "Blastoise.txt";

        String question8 = "Who is this Pokemon?" +
                "\n1.Bulbasaur" +
                "\n2.Ivysaur" +
                "\n3.Venusaur" +
                "\n4.Weezing";
        int answer8 = 1;
        String file8 = "Bulbasaur.txt";

        String question9 = "Who is this Pokemon?" +
                "\n1.Charizard" +
                "\n2.Hypno" +
                "\n3.Jynx" +
                "\n4.Butterfree";
        int answer9 = 4;
        String file9 = "Butterfree.txt";

        String question10 = "Who is this Pokemon?" +
                "\n1.Paras" +
                "\n2.Cataperie" +
                "\n3.Metapod" +
                "\n4.Pikachu";
        int answer10 = 2;
        String file10 = "Cataperie.txt";

        String question11 = "Who is this Pokemon?" +
                "\n1.Beedrill" +
                "\n2.Chansey" +
                "\n3.Pidgey" +
                "\n4.Pikachu";
        int answer11 = 2;
        String file11 = "Chansey.txt";

        String question12 = "Who is this Pokemon?" +
                "\n1.Ekans" +
                "\n2.Golbat" +
                "\n3.Grimer" +
                "\n4.Charizard";
        int answer12 = 4;
        String file12 = "Charizard.txt";

        String question13 = "Who is this Pokemon?" +
                "\n1.Haunter" +
                "\n2.Charizard" +
                "\n3.Charmander" +
                "\n4.Jynx";
        int answer13 = 3;
        String file13 = "Charmander.txt";

        String question14 = "Who is this Pokemon?" +
                "\n1.Charmeleon" +
                "\n2.Doduo" +
                "\n3.Fearow" +
                "\n4.Geodude";
        int answer14 = 1;
        String file14 = "Charmeleon.txt";

        String question15 = "Who is this Pokemon?" +
                "\n1.Clefable" +
                "\n2.Ditto" +
                "\n3.Electrode" +
                "\n4.Goldeen";
        int answer15 = 1;
        String file15 = "Clefable.txt";

        String question16 = "Who is this Pokemon?" +
                "\n1.Grimer" +
                "\n2.Horsea" +
                "\n3.Lapras" +
                "\n4.Clefairy";
        int answer16 = 4;
        String file16 = "Clefairy.txt";

        String question17 = "Who is this Pokemon?" +
                "\n1.Psyduck" +
                "\n2.Scyther" +
                "\n3.Cloyster" +
                "\n4.Clefairy";
        int answer17 = 3;
        String file17 = "Cloyster.txt";

        String question18 = "Who is this Pokemon?" +
                "\n1.Psyduck" +
                "\n2.Cubone" +
                "\n3.Golbat" +
                "\n4.Drowzee";
        int answer18 = 3;
        String file18 = "Cubone.txt";

        String question19 = "Who is this Pokemon?" +
                "\n1.Dewgong" +
                "\n2.Cubone" +
                "\n3.Golbat" +
                "\n4.Drowzee";
        int answer19 = 1;
        String file19 = "Dewgong.txt";

        String question20 = "Who is this Pokemon?" +
                "\n1.Blastoise" +
                "\n2.Cubone" +
                "\n3.Diglett" +
                "\n4.Ditto";
        int answer20 = 3;
        String file20 = "Diglett.txt";

        String question21 = "Who is this Pokemon?" +
                "\n1.Ditto" +
                "\n2.Cubone" +
                "\n3.Golbat" +
                "\n4.Drowzee";
        int answer21 = 3;
        String file21 = "Ditto.txt";

        String question22 = "Who is this Pokemon?" +
                "\n1.Eevee" +
                "\n2.Mr. Mime" +
                "\n3.Muk" +
                "\n4.Dodrio";
        int answer22 = 4;
        String file22 = "Dodrio.txt";

        String question23 = "Who is this Pokemon?" +
                "\n1.Eevee" +
                "\n2.Mr. Mime" +
                "\n3.Doduo" +
                "\n4.Dodrio";
        int answer23 = 3;
        String file23 = "Doduo.txt";

        String question24 = "Who is this Pokemon?" +
                "\n1.Drowzee" +
                "\n2.Mr. Mime" +
                "\n3.Muk" +
                "\n4.Dodrio";
        int answer24 = 1;
        String file24 = "Drowzee.txt";

        String question25 = "Who is this Pokemon?" +
                "\n1.Eevee" +
                "\n2.Mr. Mime" +
                "\n3.Dugtrio" +
                "\n4.Goldeen";
        int answer25 = 3;
        String file25 = "Dugtrio.txt";

        String question26 = "Who is this Pokemon?" +
                "\n1.Eevee" +
                "\n2.Gastly" +
                "\n3.Muk" +
                "\n4.Dodrio";
        int answer26 = 1;
        String file26 = "Eevee.txt";

        String question27 = "Who is this Pokemon?" +
                "\n1.Charmeleon" +
                "\n2.Ekans" +
                "\n3.Fearow" +
                "\n4.Geodude";
        int answer27 = 2;
        String file27 = "Ekans.txt";

        String question28 = "Who is this Pokemon?" +
                "\n1.Charmeleon" +
                "\n2.Ekans" +
                "\n3.Electrabuzz" +
                "\n4.Geodude";
        int answer28 = 3;
        String file28 = "Electrabuzz.txt";

        String question29 = "Who is this Pokemon?" +
                "\n1.Charmeleon" +
                "\n2.Ekans" +
                "\n3.Electrode" +
                "\n4.Geodude";
        int answer29 = 3;
        String file29 = "Electrode.txt";

        String question30 = "Who is this Pokemon?" +
                "\n1.Fearow" +
                "\n2.Gloom" +
                "\n3.Golbat" +
                "\n4.Exeggcute";
        int answer30 = 4;
        String file30 = "Exeggcute.txt";

        String question31 = "Who is this Pokemon?" +
                "\n1.Exeggutor" +
                "\n2.Gloom" +
                "\n3.Golbat" +
                "\n4.Exeggcute";
        int answer31 = 1;
        String file31 = "Exeggutor.txt";

        String question32 = "Who is this Pokemon?" +
                "\n1.Exeggutor" +
                "\n2.Farfetch'd" +
                "\n3.Kingler" +
                "\n4.Krabby";
        int answer32 = 2;
        String file32 = "Farfetch'd.txt";

        String question33 = "Who is this Pokemon?" +
                "\n1.Exeggutor" +
                "\n2.Farfetch'd" +
                "\n3.Fearow" +
                "\n4.Krabby";
        int answer33 = 3;
        String file33 = "Fearow.txt";

        String question34 = "Who is this Pokemon?" +
                "\n1.Exeggutor" +
                "\n2.Farfetch'd" +
                "\n3.Fearow" +
                "\n4.Gastly";
        int answer34 = 4;
        String file34 = "Gastly.txt";

        String question35 = "Who is this Pokemon?" +
                "\n1.Oddish" +
                "\n2.Nidoran (F)" +
                "\n3.Ninetails" +
                "\n4.Gengar";
        int answer35 = 4;
        String file35 = "Gengar.txt";

        String question36 = "Who is this Pokemon?" +
                "\n1.Oddish" +
                "\n2.Geodude" +
                "\n3.Ninetails" +
                "\n4.Gengar";
        int answer36 = 2;
        String file36 = "Geodude.txt";

        String question37 = "Who is this Pokemon?" +
                "\n1.Oddish" +
                "\n2.Nidoran (M)" +
                "\n3.Ninetails" +
                "\n4.Gloom";
        int answer37 = 4;
        String file37 = "Gloom.txt";

        String question38 = "Who is this Pokemon?" +
                "\n1.Golbat" +
                "\n2.Nidoran (F)" +
                "\n3.Ninetails" +
                "\n4.Gengar";
        int answer38 = 1;
        String file38 = "Golbat.txt";

        String question39 = "Who is this Pokemon?" +
                "\n1.Jigglypuff" +
                "\n2.Kingler" +
                "\n3.Goldeen" +
                "\n4.Kadabra";
        int answer39 = 3;
        String file39 = "Goldeen.txt";

        String question40 = "Who is this Pokemon?" +
                "\n1.Jigglypuff" +
                "\n2.Kingler" +
                "\n3.Goldeen" +
                "\n4.Golduck";
        int answer40 = 4;
        String file40 = "Golduck.txt";

        String question41 = "Who is this Pokemon?" +
                "\n1.Jigglypuff" +
                "\n2.Golem" +
                "\n3.Hypno" +
                "\n4.Kadabra";
        int answer41 = 2;
        String file41 = "Golem.txt";

        String question42 = "Who is this Pokemon?" +
                "\n1.Graveler" +
                "\n2.Golem" +
                "\n3.Ivysaur" +
                "\n4.Jynx";
        int answer42 = 1;
        String file42 = "Graveler.txt";

        String question43 = "Who is this Pokemon?" +
                "\n1.Hypno" +
                "\n2.Grimer" +
                "\n3.Ivysaur" +
                "\n4.Jynx";
        int answer43 = 2;
        String file43 = "Grimer.txt";

        String question44 = "Who is this Pokemon?" +
                "\n1.Graveler" +
                "\n2.Golem" +
                "\n3.Growlithe" +
                "\n4.Jynx";
        int answer44 = 3;
        String file44 = "Growlithe.txt";

        String question45 = "Who is this Pokemon?" +
                "\n1.Horsea" +
                "\n2.Golem" +
                "\n3.Gyarados" +
                "\n4.Jynx";
        int answer45 = 3;
        String file45 = "Gyarados.txt";

        String question46 = "Who is this Pokemon?" +
                "\n1.Arbok" +
                "\n2.Zubat" +
                "\n3.Weedle" +
                "\n4.Haunter";
        int answer46 = 4;
        String file46 = "Haunter.txt";

        String question47 = "Who is this Pokemon?" +
                "\n1.Hitmonchan" +
                "\n2.Zubat" +
                "\n3.Kakuna" +
                "\n4.Kingler";
        int answer47 = 1;
        String file47 = "Hitmonchan.txt";

        String question48 = "Who is this Pokemon?" +
                "\n1.Hitmonchan" +
                "\n2.Zubat" +
                "\n3.Hitmonlee" +
                "\n4.Kingler";
        int answer48 = 3;
        String file48 = "Hitmonlee.txt";

        String question49 = "Who is this Pokemon?" +
                "\n1.Seel" +
                "\n2.Tangela" +
                "\n3.Slowbro" +
                "\n4.Horsea";
        int answer49 = 4;
        String file49 = "Horsea.txt";

        String question50 = "Who is this Pokemon?" +
                "\n1.Hypno" +
                "\n2.Tangela" +
                "\n3.Slowbro" +
                "\n4.Horsea";
        int answer50 = 1;
        String file50 = "Hypno.txt";

        String question51 = "Who is this Pokemon?" +
                "\n1.Ivysaur" +
                "\n2.Machamp" +
                "\n3.Slowbro" +
                "\n4.Horsea";
        int answer51 = 1;
        String file51 = "Ivysaur.txt";

        String question52 = "Who is this Pokemon?" +
                "\n1.Lickitung" +
                "\n2.Jigglypuff" +
                "\n3.Slowbro" +
                "\n4.Koffing";
        int answer52 = 2;
        String file52 = "Jigglypuff.txt";

        String question53 = "Who is this Pokemon?" +
                "\n1.Lickitung" +
                "\n2.Jigglypuff" +
                "\n3.Jynx" +
                "\n4.Koffing";
        int answer53 = 3;
        String file53 = "Jynx.txt";

        String question54 = "Who is this Pokemon?" +
                "\n1.Lickitung" +
                "\n2.Kadabra" +
                "\n3.Jynx" +
                "\n4.Koffing";
        int answer54 = 2;
        String file54 = "Kadabra.txt";

        String question55 = "Who is this Pokemon?" +
                "\n1.Lickitung" +
                "\n2.Kadabra" +
                "\n3.Jynx" +
                "\n4.Koffing";
        int answer55 = 2;
        String file55 = "Kadabra.txt";

        String question56 = "Who is this Pokemon?" +
                "\n1.Kakuna" +
                "\n2.Kadabra" +
                "\n3.Magmar" +
                "\n4.Mankey";
        int answer56 = 1;
        String file56 = "Kakuna.txt";

        String question57 = "Who is this Pokemon?" +
                "\n1.Lapras" +
                "\n2.Kadabra" +
                "\n3.Mr. Mime" +
                "\n4.Kangaskan";
        int answer57 = 4;
        String file57 = "Kangaskan.txt";


        String question58 = "Who is this Pokemon?" +
                "\n1.Kingler" +
                "\n2.Kadabra" +
                "\n3.Mr. Mime" +
                "\n4.Meowth";
        int answer58 = 1;
        String file58 = "Kingler.txt";

        String question59 = "Who is this Pokemon?" +
                "\n1.Kingler" +
                "\n2.Koffing" +
                "\n3.Mr. Mime" +
                "\n4.Meowth";
        int answer59 = 2;
        String file59 = "Koffing.txt";

        String question60 = "Who is this Pokemon?" +
                "\n1.Kingler" +
                "\n2.Krabby" +
                "\n3.Mr. Mime" +
                "\n4.Magikarp";
        int answer60 = 2;
        String file60 = "Krabby.txt";

        String question61 = "Who is this Pokemon?" +
                "\n1.Lapras" +
                "\n2.Meowth" +
                "\n3.Mankey" +
                "\n4.Magikarp";
        int answer61 = 1;
        String file61 = "Lapras.txt";

        String question62 = "Who is this Pokemon?" +
                "\n1.Muk" +
                "\n2.Meowth" +
                "\n3.Lickitung" +
                "\n4.Magikarp";
        int answer62 = 3;
        String file62 = "Lickitung.txt";

        String question63 = "Who is this Pokemon?" +
                "\n1.Machamp" +
                "\n2.Meowth" +
                "\n3.Lickitung" +
                "\n4.Magikarp";
        int answer63 = 1;
        String file63 = "Machamp.txt";

        String question64 = "Who is this Pokemon?" +
                "\n1.Machoke" +
                "\n2.Meowth" +
                "\n3.Krabby" +
                "\n4.Nidoran";
        int answer64 = 1;
        String file64 = "Machoke.txt";

        String question65 = "Who is this Pokemon?" +
                "\n1.Machoke" +
                "\n2.Machop" +
                "\n3.Oddish" +
                "\n4.Nidoran";
        int answer65 = 2;
        String file65 = "Machop.txt";

        String question66 = "Who is this Pokemon?" +
                "\n1.Machoke" +
                "\n2.Machop" +
                "\n3.Magikarp" +
                "\n4.Magmar";
        int answer66 = 3;
        String file66 = "Magikarp.txt";

        String question67 = "Who is this Pokemon?" +
                "\n1.Pinsir" +
                "\n2.Machop" +
                "\n3.Magmar" +
                "\n4.Poliwag";
        int answer67 = 3;
        String file67 = "Magmar.txt";

        String question68 = "Who is this Pokemon?" +
                "\n1.Pidgeot" +
                "\n2.Machop" +
                "\n3.Magmar" +
                "\n4.Magnemite";
        int answer68 = 4;
        String file68 = "Magnemite.txt";

        String question69 = "Who is this Pokemon?" +
                "\n1.Metapod" +
                "\n2.Magneton" +
                "\n3.Magmar" +
                "\n4.Magnemite";
        int answer69 = 2;
        String file69 = "Magneton.txt";

        String question70 = "Who is this Pokemon?" +
                "\n1.Nidoking" +
                "\n2.Mankey" +
                "\n3.Ninetails" +
                "\n4.Magnemite";
        int answer70 = 2;
        String file70 = "Mankey.txt";

        String question71 = "Who is this Pokemon?" +
                "\n1.Onix" +
                "\n2.Paras" +
                "\n3.Pikachu" +
                "\n4.Marowak";
        int answer71 = 4;
        String file71 = "Marowak.txt";

        String question72 = "Who is this Pokemon?" +
                "\n1.Meowth" +
                "\n2.Paras" +
                "\n3.Pikachu" +
                "\n4.Marowak";
        int answer72 = 1;
        String file72 = "Meowth.txt";

        String question73 = "Who is this Pokemon?" +
                "\n1.Meowth" +
                "\n2.Paras" +
                "\n3.Metapod" +
                "\n4.Marowak";
        int answer73 = 3;
        String file73 = "Metapod.txt";

        String question74 = "Who is this Pokemon?" +
                "\n1.Meowth" +
                "\n2.Mr. Mime" +
                "\n3.Persian" +
                "\n4.Pinsir";
        int answer74 = 2;
        String file74 = "Mr. Mime.txt";

        String question75 = "Who is this Pokemon?" +
                "\n1.Muk" +
                "\n2.Meowth" +
                "\n3.Pikachu" +
                "\n4.Pinsir";
        int answer75 = 1;
        String file75 = "Muk.txt";

        String question76 = "Who is this Pokemon?" +
                "\n1.Meowth" +
                "\n2.Pidgey" +
                "\n3.Persian" +
                "\n4.Nidoking";
        int answer76 = 4;
        String file76 = "Nidoking.txt";

        String question77 = "Who is this Pokemon?" +
                "\n1.Nidoqueen" +
                "\n2.Pidgey" +
                "\n3.Persian" +
                "\n4.Nidoking";
        int answer77 = 1;
        String file77 = "Nidoqueen.txt";

        String question78 = "Who is this Pokemon?" +
                "\n1.Nidoqueen" +
                "\n2.Paras" +
                "\n3.Nidoran (F)" +
                "\n4.Poliwag";
        int answer78 = 3;
        String file78 = "Nidoran (F).txt";

        String question79 = "Who is this Pokemon?" +
                "\n1.Persian" +
                "\n2.Paras" +
                "\n3.Nidoran (M)" +
                "\n4.Poliwag";
        int answer79 = 3;
        String file79 = "Nidoran (M).txt";

        String question80 = "Who is this Pokemon?" +
                "\n1.Nidorina" +
                "\n2.Paras" +
                "\n3.Onix" +
                "\n4.Poliwag";
        int answer80 = 1;
        String file80 = "Nidorina.txt";

        String question81 = "Who is this Pokemon?" +
                "\n1.Nidorino" +
                "\n2.Paras" +
                "\n3.Onix" +
                "\n4.Poliwag";
        int answer81 = 1;
        String file81 = "Nidorino.txt";

        String question82 = "Who is this Pokemon?" +
                "\n1.Nidorina" +
                "\n2.Paras" +
                "\n3.Ninetails" +
                "\n4.Poliwag";
        int answer82 = 3;
        String file82 = "Ninetails.txt";

        String question83 = "Who is this Pokemon?" +
                "\n1.Oddish" +
                "\n2.Paras" +
                "\n3.Pinsir" +
                "\n4.Mankey";
        int answer83 = 1;
        String file83 = "Oddish.txt";

        String question84 = "Who is this Pokemon?" +
                "\n1.Oddish" +
                "\n2.Onix" +
                "\n3.Kingler" +
                "\n4.Mankey";
        int answer84 = 2;
        String file84 = "Onix.txt";


        String question85 = "Who is this Pokemon?" +
                "\n1.Koffing" +
                "\n2.Ponyta" +
                "\n3.Kingler" +
                "\n4.Paras";
        int answer85 = 4;
        String file85 = "Paras.txt";


        String question86 = "Who is this Pokemon?" +
                "\n1.Koffing" +
                "\n2.Parasect" +
                "\n3.Kingler" +
                "\n4.Paras";
        int answer86 = 2;
        String file86 = "Parasect.txt";


        String question87 = "Who is this Pokemon?" +
                "\n1.Sandslash" +
                "\n2.Parasect" +
                "\n3.Staryu" +
                "\n4.Persian";
        int answer87 = 4;
        String file87 = "Persian.txt";

        String question88 = "Who is this Pokemon?" +
                "\n1.Sandslash" +
                "\n2.Pidgeot" +
                "\n3.Staryu" +
                "\n4.Persian";
        int answer88 = 2;
        String file88 = "Pidgeot.txt";

        String question89 = "Who is this Pokemon?" +
                "\n1.Raichu" +
                "\n2.Pidgeot" +
                "\n3.Pidgeotto" +
                "\n4.Rattata";
        int answer89 = 3;
        String file89 = "Pidgeotto.txt";

        String question90 = "Who is this Pokemon?" +
                "\n1.Pidgey" +
                "\n2.Starmie" +
                "\n3.Pidgeotto" +
                "\n4.Venusaur";
        int answer90 = 1;
        String file90 = "Pidgey.txt";

        String question91 = "Who is this Pokemon?" +
                "\n1.Psyduck" +
                "\n2.Pickachu" +
                "\n3.Sandslash" +
                "\n4.Seel";
        int answer91 = 2;
        String file91 = "Pikachu.txt";

        String question92 = "Who is this Pokemon?" +
                "\n1.Psyduck" +
                "\n2.Pickachu" +
                "\n3.Sandslash" +
                "\n4.Pinsir";
        int answer92 = 4;
        String file92 = "Pinsir.txt";

        String question93 = "Who is this Pokemon?" +
                "\n1.Poliwag" +
                "\n2.Slowpoke" +
                "\n3.Sandslash" +
                "\n4.Slowbro";
        int answer93 = 1;
        String file93 = "Poliwag.txt";


        String question94 = "Who is this Pokemon?" +
                "\n1.Poliwag" +
                "\n2.Slowpoke" +
                "\n3.Sandslash" +
                "\n4.Poliwhirl";
        int answer94 = 4;
        String file94 = "Poliwhirl.txt";

        String question95 = "Who is this Pokemon?" +
                "\n1.Poliwag" +
                "\n2.Rhydon" +
                "\n3.Sandslash" +
                "\n4.Poliwrath";
        int answer95 = 4;
        String file95 = "Poliwrath.txt";

        String question96 = "Who is this Pokemon?" +
                "\n1.Ponyta" +
                "\n2.Rhydon" +
                "\n3.Rattata" +
                "\n4.Poliwrath";
        int answer96 = 1;
        String file96 = "Ponyta.txt";

        String question97 = "Who is this Pokemon?" +
                "\n1.Seadra" +
                "\n2.Rhydon" +
                "\n3.Primeape" +
                "\n4.Poliwrath";
        int answer97 = 3;
        String file97 = "Primeape.txt";

        String question98 = "Who is this Pokemon?" +
                "\n1.Psyduck" +
                "\n2.Rhydon" +
                "\n3.Primeape" +
                "\n4.Poliwrath";
        int answer98 = 1;
        String file98 = "Psyduck.txt";

        String question99 = "Who is this Pokemon?" +
                "\n1.Psyduck" +
                "\n2.Shellder" +
                "\n3.Raichu" +
                "\n4.Spearow";
        int answer99 = 3;
        String file99 = "Raichu.txt";

        String question100 = "Who is this Pokemon?" +
                "\n1.Rapidash" +
                "\n2.Shellder" +
                "\n3.Raichu" +
                "\n4.Spearow";
        int answer100 = 1;
        String file100 = "Rapidash.txt";

        String question101 = "Who is this Pokemon?" +
                "\n1.Rapidash" +
                "\n2.Raticate" +
                "\n3.Raichu" +
                "\n4.Tangela";
        int answer101 = 2;
        String file101 = "Raticate.txt";

        String question102 = "Who is this Pokemon?" +
                "\n1.Rattata" +
                "\n2.Raticate" +
                "\n3.Pikachu" +
                "\n4.Seaking";
        int answer102 = 1;
        String file102 = "Rattata.txt";


        String question103 = "Who is this Pokemon?" +
                "\n1.Rhydon" +
                "\n2.Raticate" +
                "\n3.Pikachu" +
                "\n4.Squirtle";
        int answer103 = 1;
        String file103 = "Rhydon.txt";

        String question104 = "Who is this Pokemon?" +
                "\n1.Rhydon" +
                "\n2.Rhyhorn" +
                "\n3.Pikachu" +
                "\n4.Squirtle";
        int answer104 = 2;
        String file104 = "Rhyhorn.txt";

        String question105 = "Who is this Pokemon?" +
                "\n1.Venomoth" +
                "\n2.Tauros" +
                "\n3.Venonat" +
                "\n4.Sandslash";
        int answer105 = 4;
        String file105 = "Sandslash.txt";

        String question106 = "Who is this Pokemon?" +
                "\n1.Sanshrew" +
                "\n2.Starmie" +
                "\n3.Venonat" +
                "\n4.Sandslash";
        int answer106 = 1;
        String file106 = "Sanshrew.txt";

        String question107 = "Who is this Pokemon?" +
                "\n1.Sanshrew" +
                "\n2.Scyther" +
                "\n3.Venonat" +
                "\n4.Squirtle";
        int answer107 = 2;
        String file107 = "Scyther.txt";

        String question108 = "Who is this Pokemon?" +
                "\n1.Sanshrew" +
                "\n2.Scyther" +
                "\n3.Seadra" +
                "\n4.Squirtle";
        int answer108 = 3;
        String file108 = "Seadra.txt";


        String question109 = "Who is this Pokemon?" +
                "\n1.Seel" +
                "\n2.Scyther" +
                "\n3.Seaking" +
                "\n4.Squirtle";
        int answer109 = 3;
        String file109 = "Seaking.txt";


        String question110 = "Who is this Pokemon?" +
                "\n1.Seel" +
                "\n2.Scyther" +
                "\n3.Seaking" +
                "\n4.Squirtle";
        int answer110 = 1;
        String file110 = "Seel.txt";

        String question111 = "Who is this Pokemon?" +
                "\n1.Seel" +
                "\n2.Rattata" +
                "\n3.Seaking" +
                "\n4.Shellder";
        int answer111 = 4;
        String file111 = "Shellder.txt";

        String question112 = "Who is this Pokemon?" +
                "\n1.Starmie" +
                "\n2.Slowbro" +
                "\n3.Seaking" +
                "\n4.Shellder";
        int answer112 = 2;
        String file112 = "Slowbro.txt";

        String question113 = "Who is this Pokemon?" +
                "\n1.Tangela" +
                "\n2.Slowbro" +
                "\n3.Slowpoke" +
                "\n4.Shellder";
        int answer113 = 3;
        String file113 = "Slowpoke.txt";

        String question114 = "Who is this Pokemon?" +
                "\n1.Spearow" +
                "\n2.Seel" +
                "\n3.Slowpoke" +
                "\n4.Tentacool";
        int answer114 = 1;
        String file114 = "Spearow.txt";


        String question115 = "Who is this Pokemon?" +
                "\n1.Squirtle" +
                "\n2.Seel" +
                "\n3.Slowpoke" +
                "\n4.Tentacool";
        int answer115 = 1;
        String file115 = "Squirtle.txt";

        String question116 = "Who is this Pokemon?" +
                "\n1.Squirtle" +
                "\n2.Seel" +
                "\n3.Staryu" +
                "\n4.Starmie";
        int answer116 = 4;
        String file116 = "Starmie.txt";

        String question117 = "Who is this Pokemon?" +
                "\n1.Squirtle" +
                "\n2.Staryu" +
                "\n3.Staryu" +
                "\n4.Starmie";
        int answer117 = 3;
        String file117 = "Staryu.txt";


        String question118 = "Who is this Pokemon?" +
                "\n1.Squirtle" +
                "\n2.Staryu" +
                "\n3.Staryu" +
                "\n4.Starmie";
        int answer118 = 3;
        String file118 = "Staryu.txt";

        String question119 = "Who is this Pokemon?" +
                "\n1.Tangela" +
                "\n2.Tauros" +
                "\n3.Raichu" +
                "\n4.Vulpix";
        int answer119 = 1;
        String file119 = "Tangela.txt";

        String question120 = "Who is this Pokemon?" +
                "\n1.Weezing" +
                "\n2.Tauros" +
                "\n3.Weedle" +
                "\n4.Vulpix";
        int answer120 = 2;
        String file120 = "Tauros.txt";

        String question121= "Who is this Pokemon?" +
                "\n1.Tentacool" +
                "\n2.Tauros" +
                "\n3.Weedle" +
                "\n4.Vulpix";
        int answer121 = 1;
        String file121 = "Tentacool.txt";

        String question122= "Who is this Pokemon?" +
                "\n1.Tentacool" +
                "\n2.Tauros" +
                "\n3.Tentacruel" +
                "\n4.Weedle";
        int answer122 = 3;
        String file122 = "Tentacruel.txt";

        String question123= "Who is this Pokemon?" +
                "\n1.Vulpix" +
                "\n2.Venonat" +
                "\n3.Tentacruel" +
                "\n4.Vaporeon";
        int answer123 = 4;
        String file123 = "Vaporeon.txt";


        String question124= "Who is this Pokemon?" +
                "\n1.Venomoth" +
                "\n2.Venonat" +
                "\n3.Tentacruel" +
                "\n4.Vaporeon";
        int answer124 = 1;
        String file124 = "Venomoth.txt";

        String question125= "Who is this Pokemon?" +
                "\n1.Venomoth" +
                "\n2.Venonat" +
                "\n3.Tentacruel" +
                "\n4.Vaporeon";
        int answer125 = 2;
        String file125 = "Venonat.txt";

        String question126= "Who is this Pokemon?" +
                "\n1.Sandslash" +
                "\n2.Venonat" +
                "\n3.Tentacruel" +
                "\n4.Venusaur";
        int answer126 = 4;
        String file126 = "Venusaur.txt";

        String question127= "Who is this Pokemon?" +
                "\n1.Victreebel" +
                "\n2.Vulpix" +
                "\n3.Tentacruel" +
                "\n4.Venusaur";
        int answer127 = 1;
        String file127 = "Victreebel.txt";

        String question128= "Who is this Pokemon?" +
                "\n1.Pikachu" +
                "\n2.Vulpix" +
                "\n3.Vileplume" +
                "\n4.Weedle";
        int answer128 = 3;
        String file128 = "Vileplume.txt";

        String question129= "Who is this Pokemon?" +
                "\n1.Pikachu" +
                "\n2.Vulpix" +
                "\n3.Vileplume" +
                "\n4.Voltorb";
        int answer129 = 4;
        String file129 = "Voltorb.txt";

        String question130= "Who is this Pokemon?" +
                "\n1.Seadra" +
                "\n2.Vulpix" +
                "\n3.Vileplume" +
                "\n4.Shellder";
        int answer130 = 2;
        String file130 = "Vulpix.txt";

        String question131= "Who is this Pokemon?" +
                "\n1.Venomoth" +
                "\n2.Vulpix" +
                "\n3.Vileplume" +
                "\n4.Wartortle";
        int answer131 = 4;
        String file131 = "Wartortle.txt";

        String question132= "Who is this Pokemon?" +
                "\n1.Weedle" +
                "\n2.Vulpix" +
                "\n3.Vileplume" +
                "\n4.Wartortle";
        int answer132 = 1;
        String file132 = "Weedle.txt";

        String question133= "Who is this Pokemon?" +
                "\n1.Weedle" +
                "\n2.Vulpix" +
                "\n3.Weepinbell" +
                "\n4.Voltorb";
        int answer133 = 3;
        String file133 = "Weepinbell.txt";

        String question134= "Who is this Pokemon?" +
                "\n1.Weedle" +
                "\n2.Vulpix" +
                "\n3.Weepinbell" +
                "\n4.Weezing";
        int answer134 = 4;
        String file134 = "Weezing.txt";

        String question135= "Who is this Pokemon?" +
                "\n1.Fearow" +
                "\n2.Wigglytuff" +
                "\n3.Weepinbell" +
                "\n4.Vulpix";
        int answer135 = 2;
        String file135 = "Wigglytuff.txt";

        String question136= "Who is this Pokemon?" +
                "\n1.Zubat" +
                "\n2.Abra" +
                "\n3.Ekans" +
                "\n4.Electrode";
        int answer136 = 1;
        String file136 = "Zubat.txt";



        // Start Storing in the Question Bank

        qB.storeQuestion(new PokemonQA(question1, file1, answer1));
        qB.storeQuestion(new PokemonQA(question2, file2, answer2));
        qB.storeQuestion(new PokemonQA(question3, file3, answer3));
        qB.storeQuestion(new PokemonQA(question4, file4, answer4));
        qB.storeQuestion(new PokemonQA(question5, file5, answer5));
        qB.storeQuestion(new PokemonQA(question6, file6, answer6));
        qB.storeQuestion(new PokemonQA(question7, file7, answer7));
        qB.storeQuestion(new PokemonQA(question8, file8, answer8));
        qB.storeQuestion(new PokemonQA(question9, file9, answer9));
        qB.storeQuestion(new PokemonQA(question10, file10, answer10));
        qB.storeQuestion(new PokemonQA(question11, file11, answer11));
        qB.storeQuestion(new PokemonQA(question12, file12, answer12));
        qB.storeQuestion(new PokemonQA(question13, file13, answer13));
        qB.storeQuestion(new PokemonQA(question14, file14, answer14));
        qB.storeQuestion(new PokemonQA(question15, file15, answer15));
        qB.storeQuestion(new PokemonQA(question16, file16, answer16));
        qB.storeQuestion(new PokemonQA(question17, file17, answer17));
        qB.storeQuestion(new PokemonQA(question18, file18, answer18));
        qB.storeQuestion(new PokemonQA(question19, file19, answer19));
        qB.storeQuestion(new PokemonQA(question20, file20, answer20));
        qB.storeQuestion(new PokemonQA(question21, file21, answer21));
        qB.storeQuestion(new PokemonQA(question22, file22, answer22));
        qB.storeQuestion(new PokemonQA(question23, file23, answer23));
        qB.storeQuestion(new PokemonQA(question24, file24, answer24));
        qB.storeQuestion(new PokemonQA(question25, file25, answer25));
        qB.storeQuestion(new PokemonQA(question26, file26, answer26));
        qB.storeQuestion(new PokemonQA(question27, file27, answer27));
        qB.storeQuestion(new PokemonQA(question28, file28, answer28));
        qB.storeQuestion(new PokemonQA(question29, file29, answer29));
        qB.storeQuestion(new PokemonQA(question30, file30, answer30));
        qB.storeQuestion(new PokemonQA(question31, file31, answer31));
        qB.storeQuestion(new PokemonQA(question32, file32, answer32));
        qB.storeQuestion(new PokemonQA(question33, file33, answer33));
        qB.storeQuestion(new PokemonQA(question34, file34, answer34));
        qB.storeQuestion(new PokemonQA(question35, file35, answer35));
        qB.storeQuestion(new PokemonQA(question36, file36, answer36));
        qB.storeQuestion(new PokemonQA(question37, file37, answer37));
        qB.storeQuestion(new PokemonQA(question38, file38, answer38));
        qB.storeQuestion(new PokemonQA(question39, file39, answer39));
        qB.storeQuestion(new PokemonQA(question40, file40, answer40));
        qB.storeQuestion(new PokemonQA(question41, file41, answer41));
        qB.storeQuestion(new PokemonQA(question42, file42, answer42));
        qB.storeQuestion(new PokemonQA(question43, file43, answer43));
        qB.storeQuestion(new PokemonQA(question44, file44, answer44));
        qB.storeQuestion(new PokemonQA(question45, file45, answer45));
        qB.storeQuestion(new PokemonQA(question46, file46, answer46));
        qB.storeQuestion(new PokemonQA(question47, file47, answer47));
        qB.storeQuestion(new PokemonQA(question48, file48, answer48));
        qB.storeQuestion(new PokemonQA(question49, file49, answer49));
        qB.storeQuestion(new PokemonQA(question50, file50, answer50));
        qB.storeQuestion(new PokemonQA(question51, file51, answer51));
        qB.storeQuestion(new PokemonQA(question52, file52, answer52));
        qB.storeQuestion(new PokemonQA(question53, file53, answer53));
        qB.storeQuestion(new PokemonQA(question54, file54, answer54));
        qB.storeQuestion(new PokemonQA(question55, file55, answer55));
        qB.storeQuestion(new PokemonQA(question56, file56, answer56));
        qB.storeQuestion(new PokemonQA(question57, file57, answer57));
        qB.storeQuestion(new PokemonQA(question58, file58, answer58));
        qB.storeQuestion(new PokemonQA(question59, file59, answer59));
        qB.storeQuestion(new PokemonQA(question60, file60, answer60));
        qB.storeQuestion(new PokemonQA(question61, file61, answer61));
        qB.storeQuestion(new PokemonQA(question62, file62, answer62));
        qB.storeQuestion(new PokemonQA(question63, file63, answer63));
        qB.storeQuestion(new PokemonQA(question64, file64, answer64));
        qB.storeQuestion(new PokemonQA(question65, file65, answer65));
        qB.storeQuestion(new PokemonQA(question66, file66, answer66));
        qB.storeQuestion(new PokemonQA(question67, file67, answer67));
        qB.storeQuestion(new PokemonQA(question68, file68, answer68));
        qB.storeQuestion(new PokemonQA(question69, file69, answer69));
        qB.storeQuestion(new PokemonQA(question70, file70, answer70));
        qB.storeQuestion(new PokemonQA(question71, file71, answer71));
        qB.storeQuestion(new PokemonQA(question72, file72, answer72));
        qB.storeQuestion(new PokemonQA(question73, file73, answer73));
        qB.storeQuestion(new PokemonQA(question74, file74, answer74));
        qB.storeQuestion(new PokemonQA(question75, file75, answer75));
        qB.storeQuestion(new PokemonQA(question76, file76, answer76));
        qB.storeQuestion(new PokemonQA(question77, file77, answer77));
        qB.storeQuestion(new PokemonQA(question78, file78, answer78));
        qB.storeQuestion(new PokemonQA(question79, file79, answer79));
        qB.storeQuestion(new PokemonQA(question80, file80, answer80));
        qB.storeQuestion(new PokemonQA(question81, file81, answer81));
        qB.storeQuestion(new PokemonQA(question82, file82, answer82));
        qB.storeQuestion(new PokemonQA(question83, file83, answer83));
        qB.storeQuestion(new PokemonQA(question84, file84, answer84));
        qB.storeQuestion(new PokemonQA(question85, file85, answer85));
        qB.storeQuestion(new PokemonQA(question86, file86, answer86));
        qB.storeQuestion(new PokemonQA(question87, file87, answer87));
        qB.storeQuestion(new PokemonQA(question88, file88, answer88));
        qB.storeQuestion(new PokemonQA(question89, file89, answer89));
        qB.storeQuestion(new PokemonQA(question90, file90, answer90));
        qB.storeQuestion(new PokemonQA(question91, file91, answer91));
        qB.storeQuestion(new PokemonQA(question92, file92, answer92));
        qB.storeQuestion(new PokemonQA(question93, file93, answer93));
        qB.storeQuestion(new PokemonQA(question94, file94, answer94));
        qB.storeQuestion(new PokemonQA(question95, file95, answer95));
        qB.storeQuestion(new PokemonQA(question96, file96, answer96));
        qB.storeQuestion(new PokemonQA(question97, file97, answer97));
        qB.storeQuestion(new PokemonQA(question98, file98, answer98));
        qB.storeQuestion(new PokemonQA(question99, file99, answer99));
        qB.storeQuestion(new PokemonQA(question100, file100, answer100));
        qB.storeQuestion(new PokemonQA(question101, file101, answer101));
        qB.storeQuestion(new PokemonQA(question102, file102, answer102));
        qB.storeQuestion(new PokemonQA(question103, file103, answer103));
        qB.storeQuestion(new PokemonQA(question104, file104, answer104));
        qB.storeQuestion(new PokemonQA(question105, file105, answer105));
        qB.storeQuestion(new PokemonQA(question106, file106, answer106));
        qB.storeQuestion(new PokemonQA(question107, file107, answer107));
        qB.storeQuestion(new PokemonQA(question108, file108, answer108));
        qB.storeQuestion(new PokemonQA(question109, file109, answer109));
        qB.storeQuestion(new PokemonQA(question110, file110, answer110));
        qB.storeQuestion(new PokemonQA(question111, file111, answer111));
        qB.storeQuestion(new PokemonQA(question112, file112, answer112));
        qB.storeQuestion(new PokemonQA(question113, file113, answer113));
        qB.storeQuestion(new PokemonQA(question114, file114, answer114));
        qB.storeQuestion(new PokemonQA(question115, file115, answer115));
        qB.storeQuestion(new PokemonQA(question116, file116, answer116));
        qB.storeQuestion(new PokemonQA(question117, file117, answer117));
        qB.storeQuestion(new PokemonQA(question118, file118, answer118));
        qB.storeQuestion(new PokemonQA(question119, file119, answer119));
        qB.storeQuestion(new PokemonQA(question120, file120, answer120));
        qB.storeQuestion(new PokemonQA(question121, file121, answer121));
        qB.storeQuestion(new PokemonQA(question122, file122, answer122));
        qB.storeQuestion(new PokemonQA(question123, file123, answer123));
        qB.storeQuestion(new PokemonQA(question124, file124, answer124));
        qB.storeQuestion(new PokemonQA(question125, file125, answer125));
        qB.storeQuestion(new PokemonQA(question126, file126, answer126));
        qB.storeQuestion(new PokemonQA(question127, file127, answer127));
        qB.storeQuestion(new PokemonQA(question128, file128, answer128));
        qB.storeQuestion(new PokemonQA(question129, file129, answer129));
        qB.storeQuestion(new PokemonQA(question130, file130, answer130));
        qB.storeQuestion(new PokemonQA(question131, file131, answer131));
        qB.storeQuestion(new PokemonQA(question132, file132, answer132));
        qB.storeQuestion(new PokemonQA(question133, file133, answer133));
        qB.storeQuestion(new PokemonQA(question134, file134, answer134));
        qB.storeQuestion(new PokemonQA(question135, file135, answer135));
        qB.storeQuestion(new PokemonQA(question136, file136, answer136));



    }

    // Print Statement of how to play the game
    @Override
    public void instructions() throws IOException {
        PokemonUtils.displayPokemon("pokemon.txt");
        System.out.println("How to play Pokemon Guessing Game: " +
                "\nPlayer will be given an Pokemon image represented in Ascii characters and 4 options," +
                "\nPlayer must select the correct name for the Pokemon to get a point." +
                "\nPlayers can compete by taking turns, the max number of players allowed at once is 5." +
                "\n Enter 1, 2, 3, or 4 as choices for your guess.");


    }

    // where the game logic will be called
    // later questions will be random, and only 10 will be asked to player, but for trial we just doing the whole List
    @Override
    public void game() throws IOException {
        // get how many users are going to play
        System.out.println("Enter the number of players: ");
        int numberOfPlayers = input.nextInt();
        while (numberOfPlayers > 5){
            System.out.println("Enter the number of players: ");
            numberOfPlayers = input.nextInt();
        }

        input.nextLine(); // to advance input from int to Line
        // add users to que
        for (int i =1; i <= numberOfPlayers; i++){
            System.out.println("Enter " +i+ "'s player name: ");
            String name = input.nextLine();
            Player newPlayer = new Player(name);
            myPlayers.addPlayer(newPlayer);
        }
        // store the player results globally
        playersResults = new Player[numberOfPlayers];
        int counter = 0;


        while (!myPlayers.isEmpty()){
            int score = 0;
            int[] randomQuestions = PokemonUtils.noRepeat(qB.listSize()-1, NUMBER_OF_PICKS); // Change
            Player currentPlayer = myPlayers.removePlayer();

            System.out.println("==================================================================================");
            System.out.println("NEXT PLAYERS TURN");
            System.out.println("Best of luck " + currentPlayer.getPlayerName());

            // Game
            for(int i =0; i< randomQuestions.length; i++){
                PokemonQA currentQuestion = qB.getQuestion(randomQuestions[i]);
                PokemonUtils.displayPokemon(currentQuestion.getFileName());
                System.out.println(currentQuestion.getQuestion());
                int answer = input.nextInt();

                // Will later be replaced with a tracker of each players score
                if(currentQuestion.checkAnswer(answer))
                {
                    System.out.println("correct");
                    score++;
                }
                else
                    System.out.println("incorrect");

            }

            // Results of players tacking or sorting use later
            System.out.println("Your score: " + score + "/" + randomQuestions.length);
            currentPlayer.setScore(score);
            playersResults[counter] = currentPlayer;
            counter++;
        }



    }

    // Scores of each player to displayed but sorted from highest to lowest
    @Override
    public void results() {
        PokemonUtils.bubbleSort(playersResults);
        PokemonUtils.displaySortedArray(playersResults);
    }
}
