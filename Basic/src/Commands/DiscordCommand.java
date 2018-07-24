package Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class DiscordCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("Discord")) {
			Player player = (Player) sender;
			
			player.sendMessage(ChatColor.YELLOW + "You can join our discord at: " + ChatColor.LIGHT_PURPLE + "discord.io/Gold");
		}
		
		
		return true;
		
	}
}