package mcextreme.tech;

import mcextreme.tech.block.BlocksTech;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationTech
{
	public static String[] oreNames = new String[] {"Bauxite", "Cuprite", "Galena", "Garnierite", "Platinum Ore", "Acanthite", "Cassiterite", "Sphalerite", "Chromite", "Kunzite", "Celestine", "Realgar", "Uraninite", "Magnetite", "Pyrite", "Iridium", "Titanium Ore", "Tungsten Ore"};
	public static String[] storageNames = new String[] {"Block of Aluminium", "Block of Copper", "Block of Lead", "Block of Nickel", "Block of Platinum", "Block of Silver", "Block of Tin", "Block of Zinc", "Block of Uranium", "Block of Chromium", "Block of Mercury", "Block of Arsenic", "Block of Antimony", "Block of Lithium", "Block of Strontium", "Block of Iridium", "Block of Titanium", "Block of Tungsten"};
	
    public static void addNames()
    {
        LanguageRegistry lr = LanguageRegistry.instance();
        
    	for (int meta = 0; meta < oreNames.length; ++meta)
	        LanguageRegistry.addName(new ItemStack(BlocksTech.blockOre, 1, meta), oreNames[meta]);
    	
    	for (int meta = 0; meta < storageNames.length; ++meta)
	        LanguageRegistry.addName(new ItemStack(BlocksTech.blockStorage, 1, meta), storageNames[meta]);
        
    	lr.addStringLocalization("item.screwdriver.name", "Screwdriver");
    	lr.addStringLocalization("tile.blockBasicMachine.name", "Block Breaker");
    	
    	lr.addStringLocalization("itemGroup.mcx.tech", "MC-Extreme: Tech");
    }
}
