package com.direwolf20.justdirethings.common.items.tools;

import com.direwolf20.justdirethings.common.items.interfaces.Ability;
import com.direwolf20.justdirethings.common.items.interfaces.PoweredTool;
import com.direwolf20.justdirethings.common.items.tools.basetools.BaseSword;
import com.direwolf20.justdirethings.common.items.tools.utils.GooTier;
import net.minecraft.world.item.ItemStack;

public class EclipseAlloySword extends BaseSword implements PoweredTool {
    public EclipseAlloySword() {
        super(GooTier.ECLIPSEALLOY, new Properties().fireResistant());
        registerAbility(Ability.GLOWING);
        registerAbility(Ability.CAUTERIZEWOUNDS);
        registerAbility(Ability.DROPTELEPORT);
        registerAbility(Ability.SMOKER);
    }

    @Override
    public boolean isBarVisible(ItemStack stack) {
        return isPowerBarVisible(stack);
    }

    @Override
    public int getBarWidth(ItemStack stack) {
        return getPowerBarWidth(stack);
    }

    @Override
    public int getBarColor(ItemStack stack) {
        int color = getPowerBarColor(stack);
        if (color == -1)
            return super.getBarColor(stack);
        return color;
    }

    @Override
    public int getMaxEnergy() {
        return 500000;
    }
}
