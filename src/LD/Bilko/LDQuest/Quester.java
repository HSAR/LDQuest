/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LD.Bilko.LDQuest;

import java.util.ArrayList;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 *
 * @author Gordon
 */
public class Quester {
    private Player player; //The player object this relates to
    private String filename; //Where the data is stored for this player
    
    public ArrayList<String> nextFlow; //A list of the next set open by links.
    public ArrayList<String> possible; //A list of possible options for a specific group interaction. Usually empty.
    
    public Quester(Player player, ArrayList<String> nextFlow){
        this.player = player; //Sets the player for this object
        this.filename = player.getName() + FileManager.playerPath; //sets the filename for this object
        
        this.nextFlow = nextFlow;
        this.possible = new ArrayList<String>();
        
    }


    /*
     * Information
     */
    public Player getPlayer(){
        return player;
    }
    
    public String getFilename(){
        return filename;
    }
    
    public ArrayList<String> getNext(){
        return nextFlow;
    }
    
    public ArrayList<String> getPossible(){
        return possible;
    }
    
    /*
     * Checks
     */
    public void checkPossible(Marker marker){
    }
    
    /*
    * Actions
    */
    
    public void callInteraction(String groupName){
        FileManager fm = new FileManager();
        //get the group
        Group group = fm.getGroup(groupName);
        //get the group description
        //get the group knowledge
        //compare to the player knowledge
        //get the group starting message
    }
    
    public void sendMessage(String message){
        this.player.sendMessage(message);
    }
    

}
