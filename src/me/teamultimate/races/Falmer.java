package me.teamultimate.races;

import org.bukkit.event.Listener;

public class Falmer implements Listener {
private Main plugin;
	public Falmer(Main instance){
		this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
}
