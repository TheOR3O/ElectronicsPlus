package com.theor3o.electronics_plus.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class LEDBlock extends Block {
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public LEDBlock(Properties properties) {
        super(properties);

        registerDefaultState(this.stateDefinition.any()
                .setValue(LIT, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    public static void setLit(Level level, BlockPos pos, boolean lit) {
        BlockState state = level.getBlockState(pos);

        if (state.getBlock() instanceof LEDBlock) {
            level.setBlock(
                    pos,
                    state.setValue(LIT, lit),
                    3
            );
        }
    }
}