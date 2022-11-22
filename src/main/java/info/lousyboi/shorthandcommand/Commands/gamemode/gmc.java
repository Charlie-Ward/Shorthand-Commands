package info.lousyboi.shorthandcommand.Commands.gamemode;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class gmc implements CommandExecutor, Listener{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            if (p.hasPermission("shorthandCommands.gamemodeChange")){

                if (args.length == 0) {
                    p.setGameMode(GameMode.CREATIVE);
                    p.sendMessage(ChatColor.BLUE + "[SC] " + ChatColor.GREEN + "Your gamemode was set to " + ChatColor.GOLD + "CREATIVE");

                }else {
                    String player = args[0];
                    Player gameModeChange = Bukkit.getPlayer(player);
                    gameModeChange.setGameMode(GameMode.CREATIVE);
                    p.sendMessage(ChatColor.BLUE + "[SC] " + ChatColor.GREEN + "You set " + ChatColor.GOLD + player + "'s" + ChatColor.GREEN + " gamemode to " + ChatColor.GOLD + "CREATIVE");
                    gameModeChange.sendMessage(ChatColor.BLUE + "[SC] " + ChatColor.GREEN + "Your gamemode was set to " + ChatColor.GOLD + "CREATIVE" + ChatColor.GREEN + " by " + ChatColor.GOLD + p.getDisplayName());
                }

            }else {
                p.sendMessage(ChatColor.BLUE + "[SC] " + ChatColor.RED + "You do not have correct permissions to use this feature");
            }
        }

        return true;

    }

}