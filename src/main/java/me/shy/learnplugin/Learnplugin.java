package me.shy.learnplugin;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Random;

import static java.lang.Math.random;

public final class Learnplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().warning("플러그인 활성화");

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().warning("플러그인 비활성화");
    }
