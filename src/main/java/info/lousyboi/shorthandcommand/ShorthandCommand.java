package info.lousyboi.shorthandcommand;

import info.lousyboi.shorthandcommand.Commands.gma;
import info.lousyboi.shorthandcommand.Commands.gmc;
import info.lousyboi.shorthandcommand.Commands.gms;
import info.lousyboi.shorthandcommand.Commands.gmsp;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShorthandCommand extends JavaPlugin {

    private static ShorthandCommand plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        getCommand("gmc").setExecutor(new gmc());
        getCommand("gma").setExecutor(new gma());
        getCommand("gms").setExecutor(new gms());
        getCommand("gmsp").setExecutor(new gmsp());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
