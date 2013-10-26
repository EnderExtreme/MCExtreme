package mcextreme.tech.block;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidConcrete extends Fluid
{
    public FluidConcrete() 
    {
        super("FluidConcrete");
        setDensity(100); // How tick the fluid is, affects movement inside the liquid.
        setViscosity(500); // How fast the fluid flows.
        luminosity = 0;
        FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)
    }
}
