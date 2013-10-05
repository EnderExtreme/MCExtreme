package mcextreme.magic.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Arona please stop using messy code
 * Atte: Domi and Kodehawa.
 */
public class BlockWorldsEnd extends Block
{
    public BlockWorldsEnd(int par1, Material par2Material) 
	{
        super(par1, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setTickRandomly(true);
        this.setBlockUnbreakable();
	}
    
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("The world destroyer");
    }	

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            for (int l = 0; l < 100; ++l)
            {
                int wx = par2 + par5Random.nextInt(3) - 1;
                int wy = par3 + par5Random.nextInt(5) - 3;
                int wz = par4 + par5Random.nextInt(3) - 1;
                int l1 = par1World.getBlockId(wx, wy + 1, wz);
                               
                //Kodehawa: For now, it's better than a freaking infinite cadence of if's.
                //Kodehawa: Tested and fully working, just place more than 1, thinking in a bug.
                
                int ids = BlocksMagic.blockSolidEvil.blockID | Block.grass.blockID | Block.dirt.blockID | Block.stone.blockID |
                		Block.wood.blockID | Block.sand.blockID | Block.gravel.blockID | Block.leaves.blockID |
                		Block.waterStill.blockID | Block.waterMoving.blockID | Block.cactus.blockID | Block.waterlily.blockID |
                		Block.snow.blockID;
                
				if (par1World.getBlockId(wx, wy, wz) == ids){
					 par1World.setBlock(wx, wy, wz, this.blockID);
				}
                			
				//Air
				if (par1World.getBlockId(wx, wy, wz) == 0){
					par1World.setBlock(wx, wy, wz, this.blockID);
			    }
            }
        }
    }
    
    public void registerIcons(IconRegister iconRegistry){
    	this.blockIcon = iconRegistry.registerIcon("mcextreme:magic/worldEnd");
    }
}
