/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LD.Bilko.LDQuest;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Gordon
 */
public class FileManager {
    //Path variables, can be changed here for easy maintanence
    static final String path = "/plugins/LDQuest/";
    static final String playerPath = path + "Players/";
    static final String questPath = path + "Quests/";
    static final String configPath = path;
    
    private ArrayList<Quester> questers; //a list of all existing players
    private HashMap<String, String> markers; //a map of markerUUID => marker
    private HashMap<String, String> groups;
    
    public FileManager(){
        
    }
    
    public void loadQuest(String filename){
        
    }
    
    public void loadMarker(String filename){
        
    }
    
    public Group loadGroup(String filename){
        return null;
    }
    
    public void loadQuester(String filename){
        
    }
    
    
    public Group getGroup(String groupName){
        if (!groups.containsKey(groupName)){
            Group group = new Group(groupName);
            return group;
        }
        
        String filename = groups.get(groupName);
        Group group = loadGroup(filename);
        return group;
    }

}
