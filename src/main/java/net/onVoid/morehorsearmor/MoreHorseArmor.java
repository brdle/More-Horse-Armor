package net.onvoid.morehorsearmor;

import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.onvoid.morehorsearmor.proxy.ClientProxy;
import net.onvoid.morehorsearmor.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("morehorsearmor")
public class MoreHorseArmor {
    public static final String MODID = "morehorsearmor";
    public static MoreHorseArmor instance;
    public static CommonProxy proxy;
    private static final Logger LOGGER = LogManager.getLogger();

    public MoreHorseArmor() {
        instance = this;

        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
        proxy.start();
    }

    public Logger getLogger() {
        return this.LOGGER;
    }
}
