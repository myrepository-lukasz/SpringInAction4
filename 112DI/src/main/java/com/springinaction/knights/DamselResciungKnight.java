package com.springinaction.knights;

public class DamselResciungKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselResciungKnight() {
        this.quest  = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
