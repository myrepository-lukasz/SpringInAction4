package com.springinaction.knights;

import java.io.PrintStream;

public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Singing song before quest...");
    }

    public void singAfterQuest() {
        stream.println("Singing song after well done mission...");
    }


}
