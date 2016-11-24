/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;

import eraser.Game;
import java.util.ArrayList;
import java.util.HashMap;
import world.Bullet;
import world.Player;

/**
 *
 * @author dorian
 */
public class Events {
    
    private final Game game;
    public ArrayList<Player> rankList;
    public HashMap<Integer, String> nameList;
    
    boolean isReceivingRanks, isReceivingList;
    
    public Events(Game game) {
        this.game = game;
        isReceivingRanks = false;
        isReceivingList = false;
        nameList = new HashMap<>();
        rankList = new ArrayList<>();
    }
    
    public void startAsId(int id) {
        // [!] start game
    }
    
    public void setWorldSize(int width, int height) {
        game.world.width = width;
        game.world.height = height;
    }

    public void updateNameList(HashMap<Integer, String> nameList) {
        this.nameList = nameList;
    }
    
    public void updateRankList(ArrayList<Player> rankList) {
        this.rankList = rankList;
    }
    
    public void loadFullRanks(ArrayList<Player> fullRanks) {
        this.rankList = fullRanks;
    }
    
    public void updateWorld(ArrayList<Player> newPlayers, ArrayList<Bullet> newBullets) {
        newPlayers.forEach((player) -> {
            String name = nameList.get(player.id);
            player.name = (name == null ? "" : name);
        });
        game.world.update(newPlayers, newBullets);
    }
    
    public void die() {
        // [!] do die
    }
}
