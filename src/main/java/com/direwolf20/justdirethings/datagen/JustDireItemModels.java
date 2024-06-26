package com.direwolf20.justdirethings.datagen;

import com.direwolf20.justdirethings.JustDireThings;
import com.direwolf20.justdirethings.setup.Registration;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class JustDireItemModels extends ItemModelProvider {
    public JustDireItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, JustDireThings.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Block Items
        withExistingParent(Registration.GooSoil_Tier1.getId().getPath(), modLoc("block/goosoil_tier1"));
        withExistingParent(Registration.GooSoil_Tier2.getId().getPath(), modLoc("block/goosoil_tier2"));
        withExistingParent(Registration.GooSoil_Tier3.getId().getPath(), modLoc("block/goosoil_tier3"));
        withExistingParent(Registration.GooSoil_Tier4.getId().getPath(), modLoc("block/goosoil_tier4"));
        withExistingParent(Registration.GooBlock_Tier1_ITEM.getId().getPath(), modLoc("block/gooblock_tier1"));
        withExistingParent(Registration.GooBlock_Tier2_ITEM.getId().getPath(), modLoc("block/gooblock_tier2"));
        withExistingParent(Registration.GooBlock_Tier3_ITEM.getId().getPath(), modLoc("block/gooblock_tier3"));
        withExistingParent(Registration.GooBlock_Tier4_ITEM.getId().getPath(), modLoc("block/gooblock_tier4"));
        withExistingParent(Registration.FerricoreBlock_ITEM.getId().getPath(), modLoc("block/ferricore_block"));
        withExistingParent(Registration.RawFerricoreOre_ITEM.getId().getPath(), modLoc("block/raw_ferricore_ore"));
        withExistingParent(Registration.BlazeGoldBlock_ITEM.getId().getPath(), modLoc("block/blazegold_block"));
        withExistingParent(Registration.RawBlazegoldOre_ITEM.getId().getPath(), modLoc("block/raw_blazegold_ore"));
        withExistingParent(Registration.CelestigemBlock_ITEM.getId().getPath(), modLoc("block/celestigem_block"));
        withExistingParent(Registration.RawCelestigemOre_ITEM.getId().getPath(), modLoc("block/raw_celestigem_ore"));
        withExistingParent(Registration.EclipseAlloyBlock_ITEM.getId().getPath(), modLoc("block/eclipsealloy_block"));
        withExistingParent(Registration.RawEclipseAlloyOre_ITEM.getId().getPath(), modLoc("block/raw_eclipsealloy_ore"));
        withExistingParent(Registration.ItemCollector_ITEM.getId().getPath(), modLoc("block/itemcollector"));
        withExistingParent(Registration.BlockBreakerT1_ITEM.getId().getPath(), modLoc("block/blockbreakert1"));
        withExistingParent(Registration.BlockPlacerT1_ITEM.getId().getPath(), modLoc("block/blockplacert1"));
        withExistingParent(Registration.BlockBreakerT2_ITEM.getId().getPath(), modLoc("block/blockbreakert2"));
        withExistingParent(Registration.BlockPlacerT2_ITEM.getId().getPath(), modLoc("block/blockplacert2"));
        withExistingParent(Registration.ClickerT1_ITEM.getId().getPath(), modLoc("block/clickert1"));
        withExistingParent(Registration.ClickerT2_ITEM.getId().getPath(), modLoc("block/clickert2"));
        withExistingParent(Registration.SensorT1_ITEM.getId().getPath(), modLoc("block/sensort1"));
        withExistingParent(Registration.SensorT2_ITEM.getId().getPath(), modLoc("block/sensort2"));
        withExistingParent(Registration.DropperT1_ITEM.getId().getPath(), modLoc("block/droppert1"));
        withExistingParent(Registration.DropperT2_ITEM.getId().getPath(), modLoc("block/droppert2"));
        withExistingParent(Registration.GeneratorT1_ITEM.getId().getPath(), modLoc("block/generatort1"));
        withExistingParent(Registration.EnergyTransmitter_ITEM.getId().getPath(), modLoc("block/energytransmitter"));
        withExistingParent(Registration.RawCoal_T1_ITEM.getId().getPath(), modLoc("block/raw_coal_t1_ore"));
        withExistingParent(Registration.RawCoal_T2_ITEM.getId().getPath(), modLoc("block/raw_coal_t2_ore"));
        withExistingParent(Registration.RawCoal_T3_ITEM.getId().getPath(), modLoc("block/raw_coal_t3_ore"));
        withExistingParent(Registration.RawCoal_T4_ITEM.getId().getPath(), modLoc("block/raw_coal_t4_ore"));
        withExistingParent(Registration.CoalBlock_T1_ITEM.getId().getPath(), modLoc("block/coalblock_t1"));
        withExistingParent(Registration.CoalBlock_T2_ITEM.getId().getPath(), modLoc("block/coalblock_t2"));
        withExistingParent(Registration.CoalBlock_T3_ITEM.getId().getPath(), modLoc("block/coalblock_t3"));
        withExistingParent(Registration.CoalBlock_T4_ITEM.getId().getPath(), modLoc("block/coalblock_t4"));
        withExistingParent(Registration.BlockSwapperT1_ITEM.getId().getPath(), modLoc("block/blockswappert1"));
        withExistingParent(Registration.BlockSwapperT2_ITEM.getId().getPath(), modLoc("block/blockswappert2"));
        withExistingParent(Registration.PlayerAccessor.getId().getPath(), modLoc("block/playeraccessor"));

        //Item items
        singleTexture(Registration.Fuel_Canister.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/fuel_canister"));
        //singleTexture(Registration.Pocket_Generator.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/pocketgenerator"));
        //singleTexture(Registration.Pocket_GeneratorT2.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/pocketgenerator_t2"));
        //singleTexture(Registration.Pocket_GeneratorT3.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/pocketgenerator_t3"));
        //singleTexture(Registration.Pocket_GeneratorT4.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/pocketgenerator_t4"));
        singleTexture(Registration.RawFerricore.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_ferricore"));
        singleTexture(Registration.FerricoreIngot.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ferricore_ingot"));
        singleTexture(Registration.RawBlazegold.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_blazegold"));
        singleTexture(Registration.BlazegoldIngot.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/blazegold_ingot"));
        singleTexture(Registration.Celestigem.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/celestigem"));
        singleTexture(Registration.RawBlazegold.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_blazegold"));
        singleTexture(Registration.BlazegoldIngot.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/blazegold_ingot"));
        singleTexture(Registration.RawEclipseAlloy.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_eclipsealloy"));
        singleTexture(Registration.EclipseAlloyIngot.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/eclipsealloy_ingot"));
        singleTexture(Registration.Coal_T1.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/coal_t1"));
        singleTexture(Registration.Coal_T2.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/coal_t2"));
        singleTexture(Registration.Coal_T3.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/coal_t3"));
        singleTexture(Registration.Coal_T4.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/coal_t4"));

        singleTexture(Registration.FerricoreWrench.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/ferricore_wrench"));
        singleTexture(Registration.TotemOfDeathRecall.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/totem_of_death_recall"));
        singleTexture(Registration.BlazejetWand.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/blazejet_wand"));
        singleTexture(Registration.VoidshiftWand.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/voidshift_wand"));
        singleTexture(Registration.EclipsegateWand.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/eclipsegate_wand"));
        singleTexture(Registration.CreatureCatcher.getId().getPath() + "_base", mcLoc("item/generated"), "layer0", modLoc("item/creaturecatcher"));
        getBuilder(Registration.CreatureCatcher.getId().getPath())
                .parent(new ModelFile.UncheckedModelFile("builtin/entity"));
        //.texture("layer0", modLoc("item/creaturecatcher"));
        //withExistingParent(Registration.CreatureCatcher.getId().getPath(), mcLoc("builtin/entity"));

        //Tool Items
        registerTools();
        registerArmors();

        //Generators
        registerEnabledTextureItem(Registration.Pocket_Generator.getId().getPath());
    }

    public void registerTools() {
        for (var tool : Registration.TOOLS.getEntries()) {
            registerEnabledTextureItem(tool.getId().getPath());
        }
    }

    public void registerArmors() {
        for (var armor : Registration.ARMORS.getEntries()) {
            singleTexture(armor.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/" + armor.getId().getPath()));
        }
    }

    public void registerEnabledTextureItem(String path) {
        ResourceLocation enabledModelPath = modLoc("item/" + path + "_active"); // Path to your enabled model
        ResourceLocation defaultModelPath = modLoc("item/" + path); // Path to your default model

        // Start building your item model
        getBuilder(path) // This should match your item's registry name
                .parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", defaultModelPath)
                .override()
                .predicate(new ResourceLocation("justdirethings", "enabled"), 1.0F) // Using custom property
                .model(singleTexture(path + "_active", mcLoc("item/handheld"), "layer0", enabledModelPath))
                .end();
    }
}
