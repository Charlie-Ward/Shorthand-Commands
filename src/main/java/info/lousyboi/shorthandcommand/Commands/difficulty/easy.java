package info.lousyboi.shorthandcommand.Commands.difficulty;

import org.bukkit.ChatColor;
import org.bukkit.Difficulty;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class easy implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if(sender instanceof Player){
            Player p = (Player) sender;

            if (p.hasPermission("shorthandCommands.difficulty")){
                p.getLocation().getWorld().setDifficulty(Difficulty.EASY);
                p.sendMessage(ChatColor.GREEN + "Current World Difficulty set to Easy");
            }
            else {
                p.sendMessage(ChatColor.RED + "This is only available to players with the correct permission");
                p.sendMessage(ChatColor.RED + "If this is a mistake please contact a server admin");
            }

        }
        return true;
    }
}
