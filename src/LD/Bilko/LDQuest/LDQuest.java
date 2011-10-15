/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LD.Bilko.LDQuest;
/**
 *
 * @author Gordon McKendrick
 */

import LD.Bilko.LDQuest.API.LDQuestListener;
import java.util.HashSet;
import java.util.Set;
import org.bukkit.plugin.java.JavaPlugin;


public class LDQuest extends JavaPlugin{
    public static Set<LDQuestListener> listeners = new HashSet<LDQuestListener>();
    
    //On plugin loaded
    @Override
    public void onEnable(){
        //Load all players currently on the server
        //Load all quests currently on the server
    }
    
    //On plugin loaded
    @Override
    public void onDisable(){
        
    }
    
    
    
}
