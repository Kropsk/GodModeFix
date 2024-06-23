package com.github.kropsk.godmodefix;

import com.github.kropsk.godmodefix.listeners.PlayerJoinListener;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GodModeFix extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);
        Bukkit.getConsoleSender().sendMessage(Component.text("[ GodModeFix ] Iniciado com sucesso!")
                .color(NamedTextColor.GREEN));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
