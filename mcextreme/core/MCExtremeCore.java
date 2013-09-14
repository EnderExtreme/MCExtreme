package mcextreme.core;

import java.util.Arrays;
import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

//Kodehawa: Changed version name.
@Mod(modid="MCExtremeCore", name="MC-Extreme: Core", version=MCExtremeCore.version)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class MCExtremeCore
{
    @Instance("MCExtremeCore")
    public static MCExtremeCore instance;
    
    public static final String version = "0.1.0";
    
    @EventHandler
    public void preInitialization(FMLPreInitializationEvent evt){

        /* -------------------- MCX Core METADATA DECLARATION ------------------------------ */
     	
     	ModMetadata modMeta = evt.getModMetadata();
 		modMeta.authorList = Arrays.asList(new String[] { "Rongmario", "general3214", "Kodehawa", "domi1819" ,"HoopAWolf", "warlordjones" });
 		modMeta.autogenerated = false;
 		modMeta.credits = "The MCX Modding Team";
 		modMeta.description = "Changes a lot of things in Minecraft for make it more interesting!";
 		modMeta.url = "https://github.com/EnderExtreme/MCExtreme";
 		
 		/* ---------------------------------------------------------------------- */
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event){}
    
    @EventHandler
    public void modsLoadedpostInit(FMLPostInitializationEvent event)
    {
    	FMLLog.log(Level.INFO, "MCExtreme Core Loaded!"); 
    }
}