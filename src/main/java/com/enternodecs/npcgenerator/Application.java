package com.enternodecs.npcgenerator;

public class Application {
    public static void main(String[] args) {
        NPC npc = NPCGenerator.generate();
        System.out.println(npc);
    }
}
