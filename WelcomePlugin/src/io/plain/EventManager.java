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
