package me.teamultimate.races;

import org.bukkit.event.Listener;

public class Vampir implements Listener {
private Main plugin;
	public Vampir(Main instance){
		this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
}
