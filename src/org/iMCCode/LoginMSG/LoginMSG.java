package org.iMCCode.LoginMSG;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class LoginMSG extends JavaPlugin {

	@Override
	public void onEnable() {
		new LoginListener(this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("loginmsg")){
			 
			player.sendMessage(ChatColor.AQUA + "Login" + ChatColor.DARK_RED + "MSG");
			player.sendMessage(ChatColor.DARK_RED + "Created by" + ChatColor.GRAY + ": " + ChatColor.GREEN + "iHess§7,§a MathBoy§7, and the §5iMCCode Development Team");
			player.sendMessage(ChatColor.YELLOW + "'When a player logins, the LoginMSG plugin will add a cool touch to their welcome message motd'");
			return true;
			
		}
		return false;	
		
	}
	
}
