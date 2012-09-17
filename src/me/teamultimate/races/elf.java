package me.teamultimate.races;

import org.bukkit.event.Listener;

public class elf implements Listener {
private Main plugin;
	public elf(Main instance){
		this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
}
