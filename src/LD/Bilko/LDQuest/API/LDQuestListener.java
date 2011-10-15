/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LD.Bilko.LDQuest.API;

import LD.Bilko.LDQuest.LDQuest;
import org.bukkit.Bukkit;

/**
 *
 * @author Gordon
 */
public class LDQuestListener {
    protected LDQuest plugin;
    
    public LDQuestListener() {
        plugin = (LDQuest) Bukkit.getServer().getPluginManager().getPlugin("LDQuest");
        plugin.listeners.add(this);
    }
    
    public void onRewardEvent(){}
    public void onOutputEvent(){}
    public void onCheckEvent(){}
    public void onCompleteEvent(){}
    
}
