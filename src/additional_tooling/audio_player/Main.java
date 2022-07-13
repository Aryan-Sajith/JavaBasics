package additional_tooling.audio_player;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // This part deals with user input for the music player
        Scanner scanner = new Scanner(System.in);
        String response = "";
        // We create an AudioInputStream object to get audio input from the music file
        File file = new File("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/audio_player/Chopin Nocturne Opus 9, Number 1.wav");
        AudioInputStream audioStream =  AudioSystem.getAudioInputStream(file);

        // We create a Clip object to read the audioStream object we created earlier
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        //This part handles user responses!
        while(!response.equalsIgnoreCase("q")) {
            System.out.println("p = play, s = stop, r = reset, q = quit");
            System.out.print("Enter your choice: ");
            response = scanner.next();
            switch (response.toLowerCase()) {
                case ("p") -> clip.start();
                case ("s") -> clip.stop();
                case ("r") -> {
                    clip.setMicrosecondPosition(0);
                    clip.start();
                }
                case ("q") -> {
                    clip.close();
                    scanner.close();
                }
                default -> System.out.println("Not a valid response ;(");
            }
        }
        System.out.println("Thank you for listening!");
    }

}
