package info.lousyboi.shorthandcommand.Commands.difficulty;

import org.bukkit.ChatColor;
import org.bukkit.Difficulty;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class peaceful implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if(sender instanceof Player){
            Player p = (Player) sender;

            if (p.hasPermission("shorthandCommands.difficulty")){
                p.getLocation().getWorld().setDifficulty(Difficulty.PEACEFUL);
                p.sendMessage(ChatColor.BLUE + "[SC] " + ChatColor.GREEN + "World Difficulty set to " + ChatColor.GOLD + "PEACEFUL");
            }
            else {
                p.sendMessage(ChatColor.BLUE + "[SC] " + ChatColor.RED + "You do not have correct permissions to use this feature");
            }

        }
        return true;
    }
}
