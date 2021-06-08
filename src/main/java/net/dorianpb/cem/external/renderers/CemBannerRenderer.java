package net.dorianpb.cem.external.renderers;

import net.dorianpb.cem.internal.api.CemRenderer;
import net.dorianpb.cem.internal.models.CemModelEntry.CemModelPart;
import net.dorianpb.cem.internal.models.CemModelRegistry;
import net.dorianpb.cem.internal.util.CemRegistryManager;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.BannerBlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CemBannerRenderer extends BannerBlockEntityRenderer implements CemRenderer{
	private static final Map<String, String>       partNames;
	private static final Map<String, List<String>> parentChildPairs;
	
	static{
		partNames = new LinkedHashMap<>();
		partNames.put("slate", "flag");
		partNames.put("stand", "pole"); //jojo reference?
		partNames.put("top", "bar");
	}
	
	static{
		parentChildPairs = new LinkedHashMap<>();
	}
	
	public CemBannerRenderer(BlockEntityRendererFactory.Context context){
		super(context);
		if(CemRegistryManager.hasEntity(BlockEntityType.BANNER)){
			CemModelRegistry registry = CemRegistryManager.getRegistry(BlockEntityType.BANNER);
			try{
				registry.setChildren(parentChildPairs);
				CemModelPart root = registry.prepRootPart(partNames);
				this.banner = root.getChild("flag");
				this.pillar = root.getChild("pole"); //haha demon slayer reference lol
				this.crossbar = root.getChild("bar");
				this.pillar.pivotY -= 12;
				this.crossbar.pivotY -= 12;
			} catch(Exception e){
				modelError(e);
			}
		}
	}
	
	@Override
	public String getId(){
		return BlockEntityType.BANNER.toString();
	}
}