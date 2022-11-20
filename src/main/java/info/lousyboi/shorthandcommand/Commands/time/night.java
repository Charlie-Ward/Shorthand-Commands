package info.lousyboi.shorthandcommand.Commands.time;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class night implements CommandExecutor, Listener{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            if (p.hasPermission("shorthandCommands.timeChange")){
                p.getLocation().getWorld().setTime(13000);
                p.sendMessage(ChatColor.BLUE + "[SC] " + ChatColor.GREEN + "Time set to " + ChatColor.YELLOW + "NIGHT");
            }else {
                p.sendMessage(ChatColor.RED + "This is only available to players with the correct permission");
                p.sendMessage(ChatColor.RED + "If this is a mistake please contact a server admin");
            }
        }

        return true;

    }

}