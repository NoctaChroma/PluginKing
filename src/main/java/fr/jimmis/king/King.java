package fr.jimmis.king;

import fr.jimmis.king.commands.CommandUHC;
import org.bukkit.plugin.java.JavaPlugin;

public final class King extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("Plugin || ON !");

        getCommand("uhc").setExecutor(new CommandUHC());
        getCommand("config").setExecutor(new CommandUHC());
        getCommand("plugin").setExecutor(new CommandUHC());


    }

    @Override
    public void onDisable() {

        System.out.println("Plugin || OFF !");
    }
}
