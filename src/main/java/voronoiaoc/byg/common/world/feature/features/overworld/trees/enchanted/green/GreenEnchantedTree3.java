package voronoiaoc.byg.common.world.feature.features.overworld.trees.enchanted.green;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class GreenEnchantedTree3 extends BYGAbstractTreeFeature<NoFeatureConfig> {

    public GreenEnchantedTree3(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn) {
        super(configIn);
    }

    protected boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn) {
        int randTreeHeight = 23 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable(pos);

        if (pos.getY() >= 1 && pos.getY() + randTreeHeight + 1 < 256) {
            BlockPos blockpos = pos.down();
            if (!isDesiredGround(worldIn, blockpos, Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.doesTreeFit(worldIn, pos, randTreeHeight)) {
                return false;
            } else {
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 0, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 1, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 2, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 3, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 4, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 5, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 6, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 7, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 8, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 9, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 10, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 11, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 12, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 13, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 14, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 15, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 16, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 17, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 18, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 19, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 20, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 21, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 22, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(3, 9, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 9, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 9, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 10, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 10, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 10, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 11, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-3, 11, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, 11, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 11, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 11, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 11, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, 14, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, 14, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 14, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 14, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 14, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 14, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(3, 14, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 14, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 14, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 17, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 17, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 18, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, 18, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 18, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 18, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 19, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 19, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 21, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 21, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 21, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 8, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 8, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 8, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 8, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 8, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 8, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 11, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 12, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 14, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 14, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 14, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 14, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 14, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 14, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 14, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 14, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 14, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 14, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 14, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 14, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 14, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 14, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 14, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 14, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 14, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 14, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 14, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 15, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 15, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 15, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 15, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 15, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 15, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 15, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 15, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 15, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 15, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 15, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 16, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 16, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 16, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 16, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 16, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 17, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 17, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 17, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 17, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 17, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 17, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 17, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 17, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 18, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 18, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 18, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 18, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 18, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 18, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 18, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 18, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 18, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, 18, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 18, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 18, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 18, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 18, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 18, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 18, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 18, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 18, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 18, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 18, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 18, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 18, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 18, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 18, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 18, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 19, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 19, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 19, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 19, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 19, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 19, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 19, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 19, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 19, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 19, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 19, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 19, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 19, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 19, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 19, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 19, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 19, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 20, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 20, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 20, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 20, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 21, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 21, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 21, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 21, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 21, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 21, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 21, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 21, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 21, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 21, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 21, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, 21, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 21, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 21, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 21, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, 21, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 21, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 21, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 21, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 21, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 21, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 21, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 21, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 22, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 22, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 22, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 22, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 22, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 22, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 23, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 23, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 23, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 23, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 23, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 24, 0), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (canTreePlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.GREEN_ENCHANTED_LOG.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (canTreePlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.GREEN_ENCHANTED_LOG.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        BlockPos.Mutable blockpos = new BlockPos.Mutable(pos);
        if (isAir(reader, blockpos)) {
            this.setFinalBlockState(blockPos, reader, blockpos,  BYGBlockList.GREEN_ENCHANTED_LEAVES.getDefaultState(), boundingBox);
        }
    }



    private boolean doesTreeFit(IWorldGenerationBaseReader reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.Mutable pos = new BlockPos.Mutable();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 2;

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canTreePlaceHere(reader, pos.setPos(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}