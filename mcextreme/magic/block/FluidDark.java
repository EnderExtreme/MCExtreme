package mcextreme.magic.block;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidDark extends Fluid
{
public FluidDark() {
super("FluidDark");
setDensity(10); // How tick the fluid is, affects movement inside the liquid.
setViscosity(1000); // How fast the fluid flows.
luminosity = 0;
FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)

}}
