package me.teamultimate.races;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Werwolf implements Listener {
private Main plugin;
	public Werwolf(Main instance){
		this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerDamage(EntityDamageByEntityEvent e){
		if(e.getDamager() instanceof Player){ //Ist der Angreifer ein Spieler?
			Player p = (Player) e.getDamager(); //Spieler p = Angreifer
			int random = (int) (Math.random()*100+1); //Zufallszahl zwischen 1 und 100
			if(random < 5)
			 { // wenn zufallszahl unter 5 : ca 4 %
				if(e.getEntity() instanceof Player) //Wenn der geschädigte Mensch ist...
				 {
					Player s = (Player) e.getEntity();//Spieler s = Geschädigter
					
					if(s.getHealth() > 2) //Wenn spieler mehr als 2 (damit 3 oder höher!) Leben hat.. wir wollen ihm ja 2 abziehn ^^
					{
						p.setHealth(p.getHealth() - 2); // 2 Leben abziehen
					}
				 }
			 }
		}
	}
}
