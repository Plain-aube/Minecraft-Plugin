package io.plain;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    ConsoleCommandSender console = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {
        console.sendMessage(ChatColor.AQUA+"[Plain 입장 플러그인이 활성화 중입니다.]");
        getServer().getPluginManager().registerEvents(new EventManager(), this);
    }

    @Override
    public void onDisable() {
        console.sendMessage(ChatColor.AQUA+"[Plain 입장 플러그인이 비활성화 중입니다.}");
    }

}
