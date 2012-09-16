package me.teamultimate.races;

import java.util.HashMap;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
  //Variablen
	HashMap<String,rspieler> spieler = new HashMap<String, rspieler>();
  //ende
	
 public void onEnable()
  {
    String[] spieler = this.getConfig().getString("variables.players").split(",");
    for(int i = 0 ; i < spieler.length ; i++)
     {
          	
     }
    
    System.out.println("Races 0.0.1 Enabled");
  }
 
}
