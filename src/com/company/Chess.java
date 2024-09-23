package com.company;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

import java.io.File;

public class Chess extends JLabel {
    boolean death = false;
    Chess(Icon image){
        super(image);
    }
    public void PlaySounds(){
        try{
            Clip clip = AudioSystem.getClip();
            File file = new File("sounds/落子.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
            clip.open(audioInput);
            clip.start();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void eatSounds(){
            try{
                Clip clip = AudioSystem.getClip();
                File file = new File("sounds/吃.wav");
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
                clip.open(audioInput);
                clip.start();
            }
            catch (Exception e){
                e.printStackTrace();
            }
    }
    public boolean Dead(){
        return death;
    }
    public void beDead(){
        death = true;
    }
    public void reset(){
        death = false;
    }

}
