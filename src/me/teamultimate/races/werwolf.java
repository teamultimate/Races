package me.teamultimate.races;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class werwolf implements Listener {
private Main plugin;
	public werwolf(Main instance){
		this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
	
	@EventHandler(priority = EventPriority.LOW)
	public void onPlayerDamage(EntityDamageByEntityEvent e){
		
	}
}
