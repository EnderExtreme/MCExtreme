package mcextreme.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Arrays;
import java.util.logging.Logger;

@Mod(modid=MCXCore.MODID, name=MCXCore.NAME, version=MCXCore.VERSION)

public class MCXCore
{
    public static final String PRE_ID = "MCExtreme";
    public static final String MODID = PRE_ID + "Core";
    public static final String NAME = "Minecraft to the Extreme";
    public static final String VERSION = "0.4A";
    public static final String MCVERSION = "1.7.10";
    public static final String ABBR = "MC-X";
    @Instance(MODID)
    public static MCXCore instance;

    public static CreativeTabs tabAesthetics, tabMagic, tabTech, tabVanillaTweaks, tabUtilities, tabTools;
    public static Logger logger = Logger.getLogger(MODID);
    public static boolean exhate;

    @EventHandler
    public void preInitialization(FMLPreInitializationEvent event)
    {
        //logger = event.getModLog();

        /* -------------------- MCX Core METADATA DECLARATION -------------------- */
     	
     	ModMetadata modMeta = event.getModMetadata();
 		modMeta.authorList = Arrays.asList(new String[] { "Rongmario", "Domi1819", "Kodehawa", "general3214", "NukeDuck", "Warlordjones", "HoopAWolf" });
 		modMeta.autogenerated = false;
 		modMeta.credits = "The MCX Modding Team";
 		modMeta.description = "Changes a lot of things in Minecraft to make it more interesting!";
 		modMeta.url = "https://github.com/EnderExtreme/MCExtreme";
 		modMeta.logoFile = "/assets/mcextreme/textures/gui/logo.png";
 		
 		/* ----------------------------------------------------------------------- */
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event) 
    { 
    }
    
    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent event)
    {
    	//MCExtremeUtils.printModInfo();
    }
}