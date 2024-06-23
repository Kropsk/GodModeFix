package com.github.kropsk.godmodefix.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void on(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        /*
         * Caso o jogador tenha permissão de Bypass, retornar;
         */

        if (player.hasPermission("godmodefix.bypass")) return;

        /*
         * Torna o player vulneravel a qualquer dano
         */
        player.setInvulnerable(false);
    }
}
