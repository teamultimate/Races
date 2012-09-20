package me.teamultimate.races;

public class rspieler{
	private int _level;
	private int _experience;
	private String _race;
	private Main plugin;
	private String _name;
	
	public rspieler(String name,String race,int exp,int lvl,Main instance){
		_level = lvl;
		_experience = exp;
		_race = race;
		this.plugin = instance;
		_name = name;
	}//#########
	
	public String race()
	{
	return _race;
	}//#########
	
	public int level()
	{
	return _level;
	}//#########
	
	public int exp()
	{
	return _experience;
	}//#########
	
	public void setrace(String race)
	{
	_race = race;
	this.plugin.getConfig().set("spieler." + _name + ".rasse", race);
	}//#########

	public void setlevel(int level)
	{
	_level = level;
	this.plugin.getConfig().set("spieler." + _name + ".level", level);
	}//#########
	
	public void setexp(int exp)
	{
	this.plugin.getConfig().set("spieler." + _name + ".exp", exp);
	_experience = exp;
	}//#########
}
