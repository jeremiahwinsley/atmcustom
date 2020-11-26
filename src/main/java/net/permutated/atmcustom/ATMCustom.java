package net.permutated.atmcustom;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ATMCustom.MODID)
public class ATMCustom
{
    public static final String MODID = "atmcustom";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ATMCustom() {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("registering items");
        ModRegistry.register();
    }
}
