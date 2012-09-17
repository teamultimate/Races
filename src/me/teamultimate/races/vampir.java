package me.teamultimate.races;

import org.bukkit.event.Listener;

public class vampir implements Listener {
private Main plugin;
	public vampir(Main instance){
		this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
}
