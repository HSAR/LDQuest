/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LD.Bilko.LDQuest;
import java.util.ArrayList;
import java.util.HashMap;
import org.bukkit.entity.Player;

/**
 *
 * @author Gordon
 */

public class Quester {
    public String fileName;
    public Player player;
    public String playerName;
    
    private HashMap<Quest, Integer> completedQuests = new HashMap<Quest, Integer>();
    private ArrayList<Task> completedTasks = new ArrayList<Task>();
    
    
    
    /********************************
     * Constructors
     ********************************/
    public Quester(String name){
        this.playerName = name;
        this.fileName = name;
    }
    
    
    public Quester(Player player){
        this.player = player;
        this.playerName = player.getName();
        this.fileName = playerName;
    }
    
    
    
    /********************************
     * Information Calls
     *******************************/
    
    /** Returns how many times the Quest was completed
     * @param quest The Quest to check times completed.
     * @return Integer - the number of times this quest has been completed.
     */
    public int timesComplete(Quest quest){
        if (completedQuests.containsKey(quest)){
            return completedQuests.get(quest);
        }else{
            return 0;
        }
    }
    
    
    
    /********************************
     * Setting Information
     ********************************/
    
    /** Sets this Quest complete for this Quester.
     * @param quest The quest that has been completed
     */
    public void setComplete(Quest quest){
        
        // Checks if the quest has been completed already. 
        if (completedQuests.containsKey(quest)){
            //if the quest has been completed before. Increment the count by 1, and overwrite into the HashMap
            int timesComplete = completedQuests.get(quest);
            timesComplete++;
            completedQuests.put(quest, timesComplete);
        }else{
            //if the quest has not been completed before, add a new value of 1.
            completedQuests.put(quest, 1);
        }
    }
    
    
    /** Sets this Task complete for this Quester
     * @param task The task that has been completed
     */
    public void setComplete(Task task){
        //If the task has already been set completed - return. 
        //Else, add the task to the list.
        if (completedTasks.contains(task)){
            return;
        }else{
            completedTasks.add(task);
        }
    }
    
    
    /** Removes the specified list of tasks from the completedTasks for this Quester
     * Allows repetition of Quests after completion.
     * @param taskList ArrayList of tasks  to remove
     */
    public void voidTasks(ArrayList<Task> taskList){
        completedTasks.removeAll(taskList);
    }
    
    
    /** Removes the specified task from the completedTasks for this Quester
     * Allows repetition of Quests after completion.
     * @param task the Task to remove
     */
    public void voidTask(Task task){
        completedTasks.remove(task);
    }
    
    
    
    /********************************
     * Boolean Checks
     ********************************/
    
    /** Checks if a quest has been completed by this Quester.
     * @param quest The quest to check has been completed.
     * @return True if the quest has been completed
     */
    public boolean isComplete(Quest quest){
        if (completedQuests.containsKey(quest)){
            return true;
        }else{
            return false;
        }
    }
    
    
    /** Checks if the TaskGroup is complete, task by task.
     * @param taskGroup The taskGroup to check has been completed
     * @return True if the TaskGroup has been completed
     */
    public boolean isComplete(TaskGroup taskGroup){
        ArrayList<Task> tasksList = taskGroup.Tasks; //Get the list of tasks this group needs completed
        int count = 0; //the current count of completed tasks
        int countNeeded = taskGroup.Count; //The count needed to complete the taskgroup
        
        
        for (int i=0; i<tasksList.size(); i++){
            Task task = tasksList.get(i);
           
            if (isComplete(task)){
                count++;
            }
            if (count >= countNeeded){
                return true;
            }
        }
        
        return false;
    }
    
    
    /** Checks if the specific task if complete
     * @param task The task to check has been completed
     * @return True if the task has been completed.
     */
    public boolean isComplete(Task task){
        if (completedTasks.contains(task)){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    /************************************
     * Outputs
     ************************************/
    
    public void sendMessage(){
        
    }
    
    public void doCheck(){
        
    }
    
    public void giveReward(){
        
    }
    

}
