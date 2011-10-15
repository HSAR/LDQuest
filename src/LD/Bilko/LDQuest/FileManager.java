/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LD.Bilko.LDQuest;

import java.io.File;
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
    static final String addonPath = path + "Addons/";
    static final String configPath = path;
    
    private ArrayList<Quest> Quests = new ArrayList<Quest>();
    
    /****************************************
     * Constructors
     ****************************************/
    
    public FileManager(){
        
    }

    
    
    /****************************************
     * Logic and Delegation
     ****************************************/

    
    /****************************************
     * Loading
     ****************************************/
    
    public void loadPlayer(){
    }

    
    public void loadQuest(){
    }
    
    
    public void loadConfig(){
    }
    
    
    /****************************************
     * Saving
     ****************************************/
    
    public void savePlayer(){
        
    }
    
    /****************************************
     * Logging
     ****************************************/
    
    public void Log(){
        
    }
}
