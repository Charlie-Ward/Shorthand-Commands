package info.lousyboi.shorthandcommand.Commands.gamemode;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class gmsp implements CommandExecutor, Listener{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            if (p.hasPermission("shorthandCommands.gamemodeChange")){

                if (args.length == 0) {
                    p.setGameMode(GameMode.SPECTATOR);
                    p.sendMessage(ChatColor.BLUE + "[SC] " + ChatColor.GREEN + "Your gamemode was set to " + ChatColor.YELLOW + "SPECTATOR");
                }else {
                    String player = args[0];
                    Player gameModeChange = Bukkit.getPlayer(player);
                    gameModeChange.setGameMode(GameMode.SPECTATOR);
                    p.sendMessage(ChatColor.BLUE + "[SC] " + ChatColor.GREEN + "You set " + ChatColor.YELLOW + player + ChatColor.GREEN + "'s gamemode to " + ChatColor.YELLOW + "SPECTATOR");
                }

            }else {
                p.sendMessage(ChatColor.BLUE + "[SC] " + ChatColor.RED + "You do not have correct permissions to use this feature");
            }
        }

        return true;

    }

}
