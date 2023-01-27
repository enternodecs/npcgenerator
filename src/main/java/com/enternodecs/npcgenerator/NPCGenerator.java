package com.enternodecs.npcgenerator;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class NPCGenerator {
    @Contract(value = " -> new", pure = true)
    public static @NotNull NPC generate() {
        return new NPC("First Name", "Last Name", "Race", "Subrace", "Homeland");
    }
}
