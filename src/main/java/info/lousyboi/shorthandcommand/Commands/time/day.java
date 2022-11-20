package info.lousyboi.shorthandcommand.Commands.time;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class day implements CommandExecutor, Listener{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            if (p.hasPermission("shorthandCommands.timeChange")){
                p.getLocation().getWorld().setTime(0);
                p.sendMessage(ChatColor.BLUE + "[SC] " + ChatColor.GREEN + "Time set to " + ChatColor.YELLOW + "DAY");
            }else {
                p.sendMessage(ChatColor.BLUE + "[SC] " + ChatColor.RED + "You do not have correct permissions to use this feature");
            }
        }

        return true;

    }

}