package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean(name="lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public SonyMediaPlayer sonyMediaPlayer(CompactDisc cd) {
        return new SonyMediaPlayer(cd);
    }
}