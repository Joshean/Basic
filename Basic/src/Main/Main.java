package Main;

import org.bukkit.plugin.java.JavaPlugin;

import Commands.BuyCommand;
import Commands.DiscordCommand;
import Commands.RankCommand;
import Commands.StoreCommand;

public class Main extends JavaPlugin {
	
	public void onDisable() {
		System.out.println("[Basic] Enabled All Features!");
	}
	
	public void onEnable() {
		System.out.println("[Basic] Disabled All Features!");
		
		this.getCommand("Rank").setExecutor(new RankCommand());
		this.getCommand("Store").setExecutor(new StoreCommand());
		this.getCommand("Buy").setExecutor(new BuyCommand());
		this.getCommand("Discord").setExecutor(new DiscordCommand());
		
	}

}