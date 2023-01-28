package com.enternodecs.npcgenerator;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        try {
            NPC npc = NPCGenerator.generate();
            System.out.println(npc);
        } catch (IOException e) {
            System.out.println("Couldn't read file.");
            e.printStackTrace();
        }
    }
}
