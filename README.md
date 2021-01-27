# WelcomePlugin
플레이어 접속 시 안내 메세지를 띄우고, 플레이어를 반겨주는 플러그인.



########Main#########
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





##########EventManager###########
package io.plain;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventManager implements Listener {

    @EventHandler
    public void join(PlayerJoinEvent e) {
        e.setJoinMessage(ChatColor.LIGHT_PURPLE+e.getPlayer().getName()+"님이 서버에 입장하셨습니다.");
        e.getPlayer().sendTitle ("서버에 오신것을 환영합니다!", e.getPlayer().getName()+"님, 오늘도 즐거운 시간 되세요~", -1, -1, -1);
    }

}






#########plugin.yml##########
name: WelcomePlugin
version: 1.4
main: io.plain.Main
api-version: 1.16
description: Plain 입장 플러그인입니다.



