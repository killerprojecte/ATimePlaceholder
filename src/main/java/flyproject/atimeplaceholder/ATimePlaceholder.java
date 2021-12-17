package flyproject.atimeplaceholder;

import org.bukkit.plugin.java.JavaPlugin;

public final class ATimePlaceholder extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("\n" +
                "    ___  _______                ____  __                __          __    __   \n" +
                "   /   |/_  __(_)___ ___  ___  / __ \\/ /___ _________  / /_  ____  / /___/ /__  _____\n" +
                "  / /| | / / / / __ `__ \\/ _ \\/ /_/ / / __ `/ ___/ _ \\/ __ \\/ __ \\/ / __  / _ \\/ ___/\n" +
                " / ___ |/ / / / / / / / /  __/ ____/ / /_/ / /__/  __/ / / / /_/ / / /_/ /  __/ /\n" +
                "/_/  |_/_/ /_/_/ /_/ /_/\\___/_/   /_/\\__,_/\\___/\\___/_/ /_/\\____/_/\\__,_/\\___/_/ \n\n" +
                "(c) Copyright 2021 FlyProject");
        // Plugin startup logic
        new Papi().register();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
