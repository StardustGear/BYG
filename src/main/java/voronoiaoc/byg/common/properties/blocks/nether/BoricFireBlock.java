package voronoiaoc.byg.common.properties.blocks.nether;

import net.minecraft.block.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import voronoiaoc.byg.core.byglists.BYGBlockList;

public class BoricFireBlock extends AbstractFireBlock {

    protected BoricFireBlock(AbstractBlock.Properties properties)  {
        super(properties, 3.5F);
    }

    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        return this.isValidPosition(stateIn, worldIn, currentPos) ? this.getDefaultState() : Blocks.AIR.getDefaultState();
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        return shouldLightBoricFire(worldIn.getBlockState(pos.down()).getBlock());
    }

    public static boolean shouldLightBoricFire(Block block) {
        return block == BYGBlockList.BRIMSTONE;
    }

    protected boolean canBurn(BlockState state) {
        return true;
    }
}