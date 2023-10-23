package com.foxdev.backpack.Commands;

import com.foxdev.backpack.BackPack;
import com.foxdev.backpack.DataBase;
import com.foxdev.backpack.Manager.BackPackManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BackPackCommands implements CommandExecutor {
    private DataBase database;

    public BackPackCommands(DataBase database){
        this.database = database;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(!(commandSender instanceof Player)){
            commandSender.sendMessage("Only players can use this commands!");
            return true;
        }
        Player player = (Player) commandSender;

        if(command.getName().equalsIgnoreCase("givebackpack")){
            int slots = Integer.parseInt(strings[0]);

        }


        return true;
    }

    public void giveBackpack(Player player, int slots){
        BackPackManager backPack = new BackPackManager(player.getUniqueId(), slots);



    }
}
