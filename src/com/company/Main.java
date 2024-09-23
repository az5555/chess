package com.company;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Main {

    public static void main(String[] args) {
	ChessFrame chessframe = new ChessFrame("中国象棋");
        try{
            Clip clip = AudioSystem.getClip();
            File file = new File("sounds/bgm.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
            clip.open(audioInput);
            clip.loop(clip.LOOP_CONTINUOUSLY);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
