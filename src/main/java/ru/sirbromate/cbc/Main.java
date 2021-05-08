package ru.sirbromate.cbc;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import ru.sirbromate.cbc.config.CBCConfig;

public class Main implements ModInitializer {
    public static final CBCConfig CONFIG = AutoConfig
            .register(CBCConfig.class, GsonConfigSerializer::new).getConfig();
    public static final String MODID = "cbc";

    @Override
    public void onInitialize() {
    }
}
