package ru.sirbromate.cbc.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import ru.sirbromate.cbc.Main;

@Config(name = Main.MODID)
@Config.Gui.Background("minecraft:textures/block/oak_planks.png")
public class CBCConfig implements ConfigData {
    @ConfigEntry.Category(value = "firstColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int FRed = 16;

    @ConfigEntry.Category(value = "firstColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int FGreen = 16;

    @ConfigEntry.Category(value = "firstColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int FBlue = 16;

    @ConfigEntry.Category(value = "firstColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int FAlpha = 192;


    @ConfigEntry.Category(value = "secondColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int SRed = 16;

    @ConfigEntry.Category(value = "secondColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int SGreen = 16;

    @ConfigEntry.Category(value = "secondColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int SBlue = 16;

    @ConfigEntry.Category(value = "secondColor")
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int SAlpha = 208;
}
