package io.github.legacymoddingmc.notenoughverbosity;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationFactory;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

@MCVersion("1.7.10")
public class NotEnoughVerbosity implements IFMLLoadingPlugin {
    
    public static final Logger LOGGER = LogManager.getLogger("notenoughverbosity");

    public NotEnoughVerbosity() {
        reconfigureLog4j();
    }
    
    public static void reconfigureLog4j() {
        org.apache.logging.log4j.spi.LoggerContext ctx = LogManager.getFactory().getContext(LogManager.class.getName(), net.minecraft.launchwrapper.Launch.classLoader.getClass().getClassLoader(), false);
        if(System.getProperty(ConfigurationFactory.CONFIGURATION_FILE_PROPERTY) != null) {
            if(ctx instanceof org.apache.logging.log4j.core.LoggerContext) {
                System.clearProperty(ConfigurationFactory.CONFIGURATION_FILE_PROPERTY);
                ((org.apache.logging.log4j.core.LoggerContext)ctx).reconfigure();
                LOGGER.info("Logger reconfigured.");
            } else {
                LOGGER.warn("Logger context is of unknown type " + ctx.getClass() + ", unable to reconfigure.");
            }
        } else {
            LOGGER.info("Logger config system property is not set, not doing anything.");
        }
    }
    
    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }    
}
