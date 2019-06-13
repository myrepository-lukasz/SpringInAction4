package com.springinaction.knights;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockquest = mock(Quest.class);

        BraveKnight knight = new BraveKnight(mockquest);
        knight.embarkOnQuest();

        verify(mockquest,times(1)).embark();
    }
}