package floptower.fizzlecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import floptower.fizzlecraft.blocks.BlockBauxiteOre;
import floptower.fizzlecraft.blocks.BlockCopperBlock;
import floptower.fizzlecraft.blocks.BlockCopperOre;
import floptower.fizzlecraft.blocks.BlockMagnesiumBlock;
import floptower.fizzlecraft.blocks.BlockMagnesiumOre;
import floptower.fizzlecraft.blocks.BlockMagnesiumTorch;
import floptower.fizzlecraft.blocks.BlockMercuryFlowing;
import floptower.fizzlecraft.blocks.BlockMercuryStill;
import floptower.fizzlecraft.blocks.BlockOsmiumBlock;
import floptower.fizzlecraft.blocks.BlockOsmiumOre;
import floptower.fizzlecraft.blocks.BlockUraniumBlock;
import floptower.fizzlecraft.blocks.BlockUraniumOre;
import floptower.fizzlecraft.blocks.BlockZirconiaBlock;
import floptower.fizzlecraft.blocks.BlockZirconiaOre;
import floptower.fizzlecraft.generators.WorldGenMercury;
import floptower.fizzlecraft.generators.WorldGenMineable;
import floptower.fizzlecraft.items.ItemGemZirconia;
import floptower.fizzlecraft.items.ItemIngotCopper;
import floptower.fizzlecraft.items.ItemIngotMagnesium;
import floptower.fizzlecraft.items.ItemIngotOsmium;
import floptower.fizzlecraft.items.ItemIngotUranium;

@Mod(modid = "floptower/fizzlecraft", name = "PlasmaticCraft", version = "0.0.2")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Fizzlecraft {
	
	public static final Block oreMagnesium = new BlockMagnesiumOre(1200, Material.rock);
	public static final Block oreOsmium = new BlockOsmiumOre(1201, Material.rock);
	public static final Block oreUranium = new BlockUraniumOre(1202, Material.rock);
	public static final Block oreZirconia = new BlockZirconiaOre(1203, Material.rock);
	public static final Block mercuryStill = new BlockMercuryStill(1205, Material.water);
	public static final Block mercuryFlowing = new BlockMercuryFlowing(1204, Material.water);
	public static final Block torchMagnesium = new BlockMagnesiumTorch(1207);
	public static final Block blockZirconia = new BlockZirconiaBlock(1208, Material.rock);
	public static final Block blockUranium = new BlockUraniumBlock(1209, Material.rock);
	public static final Block blockOsmium = new BlockOsmiumBlock(1210, Material.rock);
	public static final Block blockMagnesium = new BlockMagnesiumBlock(1211, Material.rock);
	public static final Block oreCopper = new BlockCopperOre(1212, Material.rock);
	public static final Block oreBauxite = new BlockBauxiteOre(1213, Material.rock);
	public static final Block blockCopper = new BlockCopperBlock(1214, Material.rock);
	
	
	public static final Item ingotMagnesium = new ItemIngotMagnesium(12200);
	public static final Item ingotUranium = new ItemIngotUranium(12201);
	public static final Item ingotOsmium = new ItemIngotOsmium(12202);
	public static final Item gemZirconia = new ItemGemZirconia(12203);
	public static final Item ingotCopper = new ItemIngotCopper(12204);
	
	
	@Instance("FizzleCraft")
	public static Fizzlecraft instance;

	@SidedProxy(clientSide = "floptower.fizzlecraft.client.ClientProxy", serverSide = "floptower.fizzlecraft.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		GameRegistry.registerBlock(oreMagnesium, "oreMagnesium");
		GameRegistry.registerBlock(oreOsmium, "oreOsmiridium");
		GameRegistry.registerBlock(oreUranium, "oreUranium");
		GameRegistry.registerBlock(oreZirconia, "oreZirconia");
		GameRegistry.registerBlock(mercuryStill, "mercuryStill");
		GameRegistry.registerBlock(mercuryFlowing, "mercuryFlowing");
		GameRegistry.registerBlock(torchMagnesium, "torchMagnesium");
		GameRegistry.registerBlock(blockZirconia, "blockZirconia");
		GameRegistry.registerBlock(blockUranium, "blockUranium");
		GameRegistry.registerBlock(blockOsmium, "blockOsmium");
		GameRegistry.registerBlock(blockMagnesium, "blockMagnesium");
		GameRegistry.registerBlock(blockCopper, "blockCopper");
		GameRegistry.registerBlock(oreCopper, "oreCopper");
		GameRegistry.registerBlock(oreBauxite, "oreBauxite");
		
		
		
		LanguageRegistry.addName(oreMagnesium, "Magnesium Ore");
		LanguageRegistry.addName(oreOsmium, "Osmiridium Ore");
		LanguageRegistry.addName(oreUranium, "Uranium Ore");
		LanguageRegistry.addName(oreZirconia, "Zirconia Ore");
		LanguageRegistry.addName(mercuryFlowing, "Mercury");
		LanguageRegistry.addName(ingotMagnesium, "Magnesium Ingot");
		LanguageRegistry.addName(ingotOsmium, "Osmium Ingot");
		LanguageRegistry.addName(ingotUranium, "Uranium Ingot");
		LanguageRegistry.addName(gemZirconia, "Zirconia");
		LanguageRegistry.addName(torchMagnesium, "Magnesium Torch");
		LanguageRegistry.addName(blockZirconia, "Block of Zirconia");
		LanguageRegistry.addName(blockUranium, "Block of Uranium");
		LanguageRegistry.addName(blockOsmium, "Block of Osmium");
		LanguageRegistry.addName(blockMagnesium, "Block of Magnesium");
		LanguageRegistry.addName(ingotCopper, "Copper Ingot");
		LanguageRegistry.addName(blockCopper, "Block of Copper");
		LanguageRegistry.addName(oreCopper, "Copper Ore");
		LanguageRegistry.addName(oreBauxite, "Bauxite Ore");
		
		MinecraftForge.setBlockHarvestLevel(oreMagnesium, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(oreOsmium, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(oreUranium, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(oreZirconia, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockMagnesium, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockOsmium, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockUranium, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockZirconia, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockCopper, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(oreCopper, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(oreBauxite, "pickaxe", 1);
		
		GameRegistry.addSmelting(oreMagnesium.blockID, new ItemStack(ingotMagnesium), 0.4f);
		GameRegistry.addSmelting(oreUranium.blockID, new ItemStack(ingotUranium), 0.6f);
		GameRegistry.addSmelting(oreOsmium.blockID, new ItemStack(ingotOsmium), 0.8f);
		GameRegistry.addSmelting(oreZirconia.blockID, new ItemStack(gemZirconia, 3), 0.8f);
		GameRegistry.addSmelting(oreCopper.blockID, new ItemStack(ingotCopper), 0.4f);
		
		GameRegistry.registerWorldGenerator(new WorldGenMineable());
        GameRegistry.registerWorldGenerator(new WorldGenMercury());
        
        GameRegistry.addRecipe(new ItemStack (torchMagnesium, 2),"x","y",
        		'x',new ItemStack(ingotMagnesium), 'y',new ItemStack(Item.stick));
        
        ItemStack ingotUraniumStack =  new ItemStack(ingotUranium);
        ItemStack ingotMagnesiumStack =  new ItemStack(ingotMagnesium);
        ItemStack gemZirconiaStack =  new ItemStack(gemZirconia);
        ItemStack ingotOsmiumStack =  new ItemStack(ingotOsmium);
        ItemStack ingotCopperStack =  new ItemStack(ingotCopper);
        
        GameRegistry.addShapelessRecipe(new ItemStack(blockUranium), ingotUraniumStack,ingotUraniumStack,
        		ingotUraniumStack,ingotUraniumStack,ingotUraniumStack,ingotUraniumStack,
        		ingotUraniumStack,ingotUraniumStack,ingotUraniumStack);
        GameRegistry.addShapelessRecipe(new ItemStack(blockMagnesium), ingotMagnesiumStack,ingotMagnesiumStack,
        		ingotMagnesiumStack,ingotMagnesiumStack,ingotMagnesiumStack,ingotMagnesiumStack,
        		ingotMagnesiumStack,ingotMagnesiumStack,ingotMagnesiumStack);
        GameRegistry.addShapelessRecipe(new ItemStack(blockOsmium), ingotOsmiumStack,ingotOsmiumStack,
        		ingotOsmiumStack,ingotOsmiumStack,ingotOsmiumStack,ingotOsmiumStack,
        		ingotOsmiumStack,ingotOsmiumStack,ingotOsmiumStack);
        GameRegistry.addShapelessRecipe(new ItemStack(blockOsmium), gemZirconiaStack,gemZirconiaStack,
        		gemZirconiaStack,gemZirconiaStack,gemZirconiaStack,gemZirconiaStack,
        		gemZirconiaStack,gemZirconiaStack,gemZirconiaStack);
        GameRegistry.addShapelessRecipe(new ItemStack(blockCopper),ingotCopperStack,ingotCopperStack,
        		ingotCopperStack,ingotCopperStack,ingotCopperStack,ingotCopperStack,
        		ingotCopperStack,ingotCopperStack,ingotCopperStack);
        

		
		proxy.registerRenderers();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

}