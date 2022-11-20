package info.lousyboi.shorthandcommand;

import info.lousyboi.shorthandcommand.Commands.difficulty.*;
import info.lousyboi.shorthandcommand.Commands.gamemode.*;
import info.lousyboi.shorthandcommand.Commands.time.*;
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

        getCommand("day").setExecutor(new day());
        getCommand("night").setExecutor(new night());

        getCommand("peaceful").setExecutor(new peaceful());
        getCommand("easy").setExecutor(new easy());
        getCommand("normal").setExecutor(new normal());
        getCommand("hard").setExecutor(new hard());



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static ShorthandCommand getPlugin(){return plugin;}
}
