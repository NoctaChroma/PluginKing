package fr.jimmis.king.commands;


import fr.jimmis.king.King;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;




public class CommandUHC implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (label.equalsIgnoreCase("uhc")) {

            if (args.length == 0) {

                if (sender instanceof Player) {

                    Player player = (Player) sender;
                    player.sendMessage("-------------------------------------");
                    player.sendMessage("§cVeuillez renseigner un argument !");
                    player.sendMessage("§c/config");
                    player.sendMessage("§c/uhc op§f");
                    player.sendMessage("-------------------------------------");
                    player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
                }
            }

            return true;

        }

        if (label.equalsIgnoreCase("plugin")) {

            if (args.length == 0)

                if (sender instanceof Player) {

                    Player player = (Player) sender;

                    player.sendMessage("§fPlugins (666): §aSosur §a#Vape §aMomo §aColmanLeGrandEnPrison");
                }

        return true;

        }

        if (label.equalsIgnoreCase("config")) {

            if (args.length == 0) {

                if (sender instanceof Player) {

                    Player player = (Player)  sender;

                    World world = player.getWorld();

                    player.sendMessage("-------------------------------------");
                    player.sendMessage("§cVous êtes maintenant le host de cette partie !");
                    player.sendMessage("-------------------------------------");
                    player.chat("§cest maintenant l'host de la partie");
                    player.setGameMode(GameMode.CREATIVE);

                        return true;
                    }



    }

}

            return true;
        }

    }
