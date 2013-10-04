package mcextreme.core;

import java.util.Arrays;
import java.util.logging.Level;

import mcextreme.core.utils.MCExtremePlayerHandler;
import mcextreme.core.utils.MCExtremeUtils;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid="MCExtremeCore", name="Minecraft to the Extreme", version=MCExtremeCore.version)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class MCExtremeCore
{
    @Instance("MCExtremeCore")
    public static MCExtremeCore instance;
    
    public static CreativeTabs tabAesthetics, tabMagic, tabTech, tabVanillaTweaks; 
    
    public static final String version = "0.2.4", mcversion = "1.6.4";
    
    @EventHandler
    public void preInitialization(FMLPreInitializationEvent event)
    {
        /* -------------------- MCX Core METADATA DECLARATION ------------------------------ */
     	
     	ModMetadata modMeta = event.getModMetadata();
 		modMeta.authorList = Arrays.asList(new String[] { "domi1819", "warlordjones", "Kodehawa", "general3214", "NukeDuck", "Rongmario", "HoopAWolf" });
 		modMeta.autogenerated = false;
 		modMeta.credits = "The MCX Modding Team";
 		modMeta.description = "Changes a lot of things in Minecraft for make it more interesting!";
 		modMeta.url = "https://github.com/EnderExtreme/MCExtreme";
 		modMeta.logoFile = "/assets/mcextreme/textures/gui/logo.png";
 		
 		/* ---------------------------------------------------------------------- */
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event) 
    { 
    	NetworkRegistry.instance().registerConnectionHandler(new MCExtremePlayerHandler());
    	FMLLog.log(Level.SEVERE, "Aw Snap, the almighty CodeBreaker, warlordjones, is here!");
    }
    
    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent event)
    {
    	MCExtremeUtils.printModInfo();
    }
}