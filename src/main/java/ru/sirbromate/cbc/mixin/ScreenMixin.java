package ru.sirbromate.cbc.mixin;

import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import ru.sirbromate.cbc.Main;

@Mixin(Screen.class)
public class ScreenMixin {

    @ModifyConstant(method = "renderBackground(Lnet/minecraft/client/util/math/MatrixStack;I)V", constant = @Constant(intValue = -1072689136))
    private int startColor(int c) {
        return toInt(Main.CONFIG.sRed, Main.CONFIG.sGreen, Main.CONFIG.sBlue, Main.CONFIG.sAlpha);
    }

    @ModifyConstant(method = "renderBackground(Lnet/minecraft/client/util/math/MatrixStack;I)V", constant = @Constant(intValue = -804253680))
    private int endColor(int c) {
        return toInt(Main.CONFIG.eRed, Main.CONFIG.eGreen, Main.CONFIG.eBlue, Main.CONFIG.eAlpha);
    }

    int toInt(int r, int g, int b, int a) {
        int A = (a << 24) & 0xFF000000;
        int R = (r << 16) & 0x00FF0000;
        int G = (g << 8) & 0x0000FF00;
        int B = (b) & 0x000000FF;

        return A | R | G | B;
    }
}