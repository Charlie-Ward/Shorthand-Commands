package info.lousyboi.shorthandcommand.Commands;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class gma implements CommandExecutor, Listener{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            if (p.hasPermission("shorthandCommands.gma")){

                if (args.length == 0) {
                    p.setGameMode(GameMode.ADVENTURE);
                }else {
                    String player = args[0];
                    Player gameModeChange = Bukkit.getPlayer(player);
                    gameModeChange.setGameMode(GameMode.ADVENTURE);
                }

            }else {
                p.sendMessage(ChatColor.RED + "This is only available to players with the correct permission");
                p.sendMessage(ChatColor.RED + "If this is a mistake please contact a server admin");
            }
        }

        return true;

    }

}
