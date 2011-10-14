/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LD.Bilko.LDQuest.API;

import LD.Bilko.LDQuest.FileManager;
import LD.Bilko.LDQuest.Quester;
import java.util.HashMap;

/**
 *
 * @author Gordon
 */
public class QuestManager {
    private HashMap<String,Quester> questers = new HashMap<String,Quester>(); //Questers that are currently online 
    private FileManager FileManager;
    
}
