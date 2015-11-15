package org.iMCCode.LoginMSG;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LoginListener implements Listener {
	
	public LoginListener(LoginMSG plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);	
	}
	
	@EventHandler
	public void onEvent(PlayerJoinEvent e) {
		
		Player player = e.getPlayer();
		if (player.getName().equalsIgnoreCase("mathboy601"))
		  {
		      player.setPlayerListName(ChatColor.DARK_PURPLE + "mathboy601");
		      player.setDisplayName("mathboy601");
		      Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "MathBoy" + ChatColor.GRAY + ", " + ChatColor.GRAY + " is the " + ChatColor.BLUE + "Co Founder " + ChatColor.GRAY + "of " + ChatColor.DARK_PURPLE + " iMCCode Development Team");
		      Bukkit.broadcastMessage(ChatColor.GREEN + "He, and iHess, made the LoginMSG plugin!");
		  }
		      
		
		Player player = e.getPlayer();
		if (player.getName().equalsIgnoreCase("iHess"))
        {
            player.setPlayerListName(ChatColor.DARK_RED + "iHess");
            player.setDisplayName("iHess");
            Bukkit.broadcastMessage(ChatColor.DARK_RED + "iHess" + ChatColor.GRAY + "," + ChatColor.GRAY + " is the " + ChatColor.DARK_RED + "Founder " + ChatColor.GRAY + "of" + ChatColor.DARK_PURPLE + " iMCCode Development Team");
            Bukkit.broadcastMessage(ChatColor.GREEN + "He, and MathBoy, made the LoginMSG plugin!");
        }
		//If an old player (who already logged into the server) will enter with this:
		if (player.hasPlayedBefore() == true){
		e.setJoinMessage(ChatColor.GREEN + "Welcome back" + ChatColor.GRAY + ", " + ChatColor.AQUA + player.getName() + ChatColor.GRAY + " to the" + ChatColor.LIGHT_PURPLE + " Server");
		}
		//If a new player log-ins into the server, this well be announced:
		if (player.hasPlayedBefore() == false){
		e.setJoinMessage(ChatColor.GREEN + "Welcome" + ChatColor.GRAY + ", " + ChatColor.AQUA + player.getName() + ChatColor.GRAY + ", to the " + ChatColor.LIGHT_PURPLE + "Server!");
}
	}
}
