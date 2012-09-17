package me.teamultimate.races;

import java.util.HashMap;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
  
public class Main extends JavaPlugin implements Listener{
	
  //Variablen
	HashMap<String,rspieler> rplayers = new HashMap<String, rspieler>();
  //ende
	
 public void onEnable()
  {
    String[] spieler = this.getConfig().getString("variables.players").split(",");
    new vampir(this);
    new Ork(this);
    new werwolf(this);
    new elf(this);
    new Mensch(this);
    new Falmer(this);
    for(int i = 0 ; i < spieler.length ; i++)
     {
       String rasse = this.getConfig().getString("players." + spieler[i] + ".race");
       int level = this.getConfig().getInt("players." + spieler[i] + ".level");
       int exp = this.getConfig().getInt("players." + spieler[i] + ".exp");
       this.getServer().getPluginManager().registerEvents(this, this);
       rplayers.put(spieler[i], new rspieler(rasse,exp,level));
     }
    System.out.println("Races 0.0.1 Enabled");
  }
 
}
