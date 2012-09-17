package me.teamultimate.races;

import org.bukkit.event.Listener;

public class Mensch implements Listener {
private Main plugin;
	public Mensch(Main instance){
		this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
}
