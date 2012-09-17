package me.teamultimate.races;

import org.bukkit.event.Listener;

public class werwolf implements Listener {
private Main plugin;
	public werwolf(Main instance){
		this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
}
