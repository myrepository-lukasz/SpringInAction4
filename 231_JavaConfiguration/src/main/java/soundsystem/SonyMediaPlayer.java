package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SonyMediaPlayer implements MediaPlayer {

    private CompactDisc cd;

    public SonyMediaPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}