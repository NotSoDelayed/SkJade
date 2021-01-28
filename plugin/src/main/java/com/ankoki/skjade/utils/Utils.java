package com.ankoki.skjade.utils;

import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;

public class Utils {

    public static String coloured(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    /**
     * Checks the vertsion of a plugin compared too a version you want
     * it to match up with, for example, if you wanted to make sure if a plugin
     * had a version higher than 1.2, you can use versionChecker(Plugin, 1, 2);
     *
     * @param plugin Plugin is the plugin you want to check the version of, usually
     *               obtained through Bukkit.getPluginManager.getPlugin("pluginName");
     * @param major The major of the version you want to check against, if there was
     *              a version 1.2, 1 would be the major.
     * @param minor The minor of the version you want to check against, if there was
     *              a version 1.2, 2 would be the minor.
     * @return Wether the plugins version is equal to or greater than the inputted
     *         version.
     */
    public static boolean checkPluginVersion(Plugin plugin, int major, int minor) {
        major *= 10;
        int pluginVer = Integer.parseInt(plugin.getDescription().getVersion().replace(".", ""));
        int required = major + minor;
        return pluginVer >= required;
    }


    public enum SpellType {
        GENERIC,
        ENTITY,
        GENERIC_PROLONGED,
        ENTITY_PROLONGED;
    }
}
