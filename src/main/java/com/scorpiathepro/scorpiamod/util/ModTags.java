package com.scorpiathepro.scorpiamod.util;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_DRAGON_TOOL
                = tag("needs_dragon_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ScorpiaMod.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
