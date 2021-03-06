package oopokemon.misc;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.nio.file.Paths;

public class MusicPlayer {

    private final MediaPlayer mediaPlayer;

    /**
     * @param namaFile is the location where the music file is located relative to the project folder
     * @param musicType is the type of music
     * @param loop true for loop, false for play only once
     */
    public MusicPlayer(String namaFile, MusicType musicType, boolean loop){
        mediaPlayer = new MediaPlayer(new Media(Paths.get(namaFile).toUri().toString()));
        if (loop) {
            mediaPlayer.setOnEndOfMedia(() -> mediaPlayer.seek(Duration.ZERO));
        }
        mediaPlayer.setVolume(musicType.volume);
    }

    public enum MusicType {
        BGM(0.5),
        SFX(0.1);
        private double volume;

        MusicType(double volume){
            this.volume = volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }
    }
    public void pause(){
        mediaPlayer.pause();
    }
    public void play(){
        mediaPlayer.play();
    }
    public void interrupt() {
        mediaPlayer.stop();
    }
}
