package codingkids.mc.sword;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
public class MySword extends net.minecraft.item.ItemSword {
    public MySword(ToolMaterial material) {
        super(material);
        this.setRegistryName("demo_sword");
        this.setTranslationKey("cksword.demo_sword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
