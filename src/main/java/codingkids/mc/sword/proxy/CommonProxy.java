package codingkids.mc.sword.proxy;

import codingkids.mc.sword.Sword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
@Mod.EventBusSubscriber
public interface CommonProxy {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModelLoader.setCustomModelResourceLocation(Sword.mySword, 0, new ModelResourceLocation(Sword.mySword.getRegistryName(), "inventory"));
        event.getRegistry().registerAll(Sword.mySword);
    }
}
