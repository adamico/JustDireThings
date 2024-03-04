package com.direwolf20.justdirethings.common.items.tools;

import com.direwolf20.justdirethings.common.items.tools.basetools.BaseAxe;
import com.direwolf20.justdirethings.common.items.tools.utils.GooTier;
import com.direwolf20.justdirethings.common.items.tools.utils.ToolAbility;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Set;

import static com.direwolf20.justdirethings.common.items.tools.utils.Helpers.breakBlocks;
import static com.direwolf20.justdirethings.common.items.tools.utils.Helpers.findLikeBlocks;

public class FerricoreAxe extends BaseAxe {
    public FerricoreAxe() {
        super(GooTier.FERRICORE, 7.0F, -2.5F, new Item.Properties());
        registerAbility(ToolAbility.TREEFELLER);
        registerAbility(ToolAbility.LEAFBREAKER);
    }

    @Override
    public boolean mineBlock(ItemStack pStack, Level pLevel, BlockState pState, BlockPos pPos, LivingEntity pEntityLiving) {
        if (!pLevel.isClientSide && pState.getDestroySpeed(pLevel, pPos) != 0.0F) {
            if (canUseAbility(pStack, ToolAbility.TREEFELLER) && pState.getTags().anyMatch(tag -> tag.equals(BlockTags.LOGS)) && pStack.isCorrectToolForDrops(pState)) {
                Set<BlockPos> alsoBreakSet = findLikeBlocks(pLevel, pState, pPos, 64, 2); //Todo: Balance and Config?
                for (BlockPos breakPos : alsoBreakSet) {
                    breakBlocks((ServerLevel) pLevel, breakPos, pEntityLiving, pStack, pPos);
                    pStack.hurtAndBreak(ToolAbility.TREEFELLER.getDurabilityCost(), pEntityLiving, p_40992_ -> p_40992_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
                }
            } else {
                pStack.hurtAndBreak(1, pEntityLiving, p_40992_ -> p_40992_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
            }
        }
        return true;
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level pLevel = pContext.getLevel();
        BlockPos pPos = pContext.getClickedPos();
        BlockState pState = pLevel.getBlockState(pPos);
        LivingEntity pEntityLiving = pContext.getPlayer();
        ItemStack pStack = pContext.getItemInHand();
        if (!pLevel.isClientSide && canUseAbility(pStack, ToolAbility.LEAFBREAKER)) {
            if (pState.getTags().anyMatch(tag -> tag.equals(BlockTags.LEAVES))) {
                Set<BlockPos> alsoBreakSet = findLikeBlocks(pLevel, pState, pPos, 64, 2); //Todo: Balance and Config?
                System.out.println(alsoBreakSet.size());
                for (BlockPos breakPos : alsoBreakSet) {
                    breakBlocks((ServerLevel) pLevel, breakPos, pEntityLiving, pStack, pPos);
                    pLevel.sendBlockUpdated(breakPos, pState, pLevel.getBlockState(breakPos), 3); // I have NO IDEA why this is necessary
                    if (Math.random() < 0.1) //10% chance to damage tool
                        pStack.hurtAndBreak(ToolAbility.LEAFBREAKER.getDurabilityCost(), pEntityLiving, p_40992_ -> p_40992_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
                }
            }
        }
        return super.useOn(pContext);
    }
}