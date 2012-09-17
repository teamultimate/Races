package me.teamultimate.races;

import org.bukkit.event.Listener;

public class Ork implements Listener {
private Main plugin;
	public Ork(Main instance){
		this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
}
