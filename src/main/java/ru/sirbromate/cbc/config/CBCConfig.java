package ru.sirbromate.cbc.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import ru.sirbromate.cbc.Main;

@Config(name = Main.MODID)
@Config.Gui.Background("minecraft:textures/block/oak_planks.png")
public class CBCConfig implements ConfigData {

    @ConfigEntry.Category(value = "startColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int sRed = 16;

    @ConfigEntry.Category(value = "startColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int sGreen = 16;

    @ConfigEntry.Category(value = "startColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int sBlue = 16;

    @ConfigEntry.Category(value = "startColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int sAlpha = 192;


    @ConfigEntry.Category(value = "endColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int eRed = 16;

    @ConfigEntry.Category(value = "endColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int eGreen = 16;

    @ConfigEntry.Category(value = "endColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int eBlue = 16;

    @ConfigEntry.Category(value = "endColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int eAlpha = 208;
}
