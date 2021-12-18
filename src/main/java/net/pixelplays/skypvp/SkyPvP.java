package net.pixelplays.skypvp;

import com.github.juliarn.npc.NPCPool;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.pixelplays.skypvp.apis.*;
import net.pixelplays.skypvp.commands.*;
import net.pixelplays.skypvp.crates.CrateItems;
import net.pixelplays.skypvp.crates.CratePreviewInventories;
import net.pixelplays.skypvp.enchants.CustomEnchants;
import net.pixelplays.skypvp.listeners.*;
import net.pixelplays.skypvp.utils.*;
import net.pixelplays.skypvp.utils.npc.NPCUtil;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

/**
 * SkyPvP Plugin - A full SkyPvP Plugin with massive functions coded by xMonsterKing
 * @version 1.0.3
 * @author xMonsterKing
 */

public final class SkyPvP extends JavaPlugin {

    private static SkyPvP instance;

    private NPCPool npcPool;
    private NPCUtil npcUtil;

    private LocationAPI locationAPI;

    private LuckPerms luckPerms;

    private CustomEnchants customEnchants;

    private Utils utils;
    private Titles titles;
    private Inventories inventories;
    private Items items;
    private Perms perms;
    private Rewards rewards;
    private BlocksItems blocksItems;
    private CrateItems crateItems;
    private CratePreviewInventories cratePreviewInventories;

    @Override
    public void onLoad() {
        instance = this;

        locationAPI = new LocationAPI();
    }

    @Override
    public void onEnable() {

        luckPerms = LuckPermsProvider.get();

        loadNPCPool();
        registerListeners();
        loadCommands();

        customEnchants = new CustomEnchants();
        customEnchants.register();

        utils = new Utils();
        items = new Items();
        titles = new Titles();
        inventories = new Inventories();
        perms = new Perms();
        rewards = new Rewards();
        blocksItems = new BlocksItems();
        crateItems = new CrateItems();
        cratePreviewInventories = new CratePreviewInventories();

        crateItems.saveCrateItems();

        loadConfigurations();
    }

    @Override
    public void onDisable() {
    }

    private void loadNPCPool() {
        npcPool = NPCPool.builder(this).spawnDistance(50).actionDistance(25).tabListRemoveTicks(20).build();
        npcUtil = new NPCUtil();
    }

    private void loadConfigurations() {
        ConfigFile configFile = new ConfigFile();
        configFile.setStandard();
        configFile.readData();

        CoinAPI.readConfig();
        BankAPI.readConfig();
        KillDeathAPI.readConfig();
        TimeBeforeAPI.readConfig();
        SettingsAPI.readConfig();
    }

    public void registerListeners() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new BuildListener(), this);
        pm.registerEvents(new ChatListener(), this);
        pm.registerEvents(new CrateListener(), this);
        pm.registerEvents(new DropItemListener(), this);
        pm.registerEvents(new FoodLevelChangeListener(), this);
        pm.registerEvents(new GlobalMuteListener(), this);
        pm.registerEvents(new InventoryClickListener(), this);
        pm.registerEvents(new InventoryCloseListener(), this);
        pm.registerEvents(new MOTDListener(), this);
        pm.registerEvents(new NoFallDamageListener(), this);
        pm.registerEvents(new NoHitListener(), this);
        pm.registerEvents(new PlayerDeathListener(), this);
        pm.registerEvents(new PlayerInteractListener(), this);
        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new PlayerMoveListener(), this);
        pm.registerEvents(new PlayerNPCInteractListener(), this);
        pm.registerEvents(new PlayerNPCShowListener(), this);
        pm.registerEvents(new PlayerQuitListener(), this);
        pm.registerEvents(new WeatherChangeListener(), this);
    }

    public void loadCommands() {
        Objects.requireNonNull(getCommand("bank")).setExecutor(new BankCommand());
        Objects.requireNonNull(getCommand("blocks")).setExecutor(new BlocksCommand());
        Objects.requireNonNull(getCommand("broadcast")).setExecutor(new BroadCastCommand());
        Objects.requireNonNull(getCommand("build")).setExecutor(new BuildCommand());
        Objects.requireNonNull(getCommand("chatclear")).setExecutor(new ChatClearCommand());
        Objects.requireNonNull(getCommand("coins")).setExecutor(new CoinsCommand());
        Objects.requireNonNull(getCommand("crates")).setExecutor(new CratesCommand());
        Objects.requireNonNull(getCommand("feed")).setExecutor(new FeedCommand());
        Objects.requireNonNull(getCommand("fly")).setExecutor(new FlyCommand());
        Objects.requireNonNull(getCommand("gamemode")).setExecutor(new GamemodeCommand());
        Objects.requireNonNull(getCommand("globalmute")).setExecutor(new GlobalMuteCommand());
        Objects.requireNonNull(getCommand("invsee")).setExecutor(new InvSeeCommand());
        Objects.requireNonNull(getCommand("message")).setExecutor(new MessageCommand());
        Objects.requireNonNull(getCommand("reload")).setExecutor(new ReloadCommand());
        Objects.requireNonNull(getCommand("reply")).setExecutor(new ReplyCommand());
        Objects.requireNonNull(getCommand("reward")).setExecutor(new RewardCommand());
        Objects.requireNonNull(getCommand("settings")).setExecutor(new SettingsCommand());
        Objects.requireNonNull(getCommand("setup")).setExecutor(new SetupCommand());
        Objects.requireNonNull(getCommand("spawn")).setExecutor(new SpawnCommand());
        Objects.requireNonNull(getCommand("speed")).setExecutor(new SpeedCommand());
        Objects.requireNonNull(getCommand("stack")).setExecutor(new StackCommand());
        Objects.requireNonNull(getCommand("trash")).setExecutor(new TrashCommand());
        Objects.requireNonNull(getCommand("verlosung")).setExecutor(new VerlosungCommand());
        Objects.requireNonNull(getCommand("warp")).setExecutor(new WarpCommand());
    }

    public static SkyPvP getInstance() {
        return instance;
    }

    public NPCPool getNpcPool() {
        return npcPool;
    }

    public NPCUtil getNpcUtil() {
        return npcUtil;
    }

    public LocationAPI getLocationAPI() {
        return locationAPI;
    }

    public LuckPerms getLuckPerms() {
        return luckPerms;
    }

    public CustomEnchants getCustomEnchants() {
        return customEnchants;
    }

    public Utils getUtils() {
        return utils;
    }

    public Items getItems() {
        return items;
    }

    public Titles getTitles() {
        return titles;
    }

    public Inventories getInventories() {
        return inventories;
    }

    public Perms getPerms() {
        return perms;
    }

    public Rewards getRewards() {
        return rewards;
    }

    public BlocksItems getBlocksItems() {
        return blocksItems;
    }

    public CrateItems getCrateItems() {
        return crateItems;
    }

    public CratePreviewInventories getCratePreviewInventories() {
        return cratePreviewInventories;
    }
}
