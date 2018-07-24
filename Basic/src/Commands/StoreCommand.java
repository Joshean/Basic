package Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class StoreCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("Store")) {
			Player player = (Player) sender;
			
			player.sendMessage(ChatColor.YELLOW + "You can purchase a rank at: " + ChatColor.LIGHT_PURPLE + "store.goldhq.us");
		}
		
		
		return true;
		
	}
}