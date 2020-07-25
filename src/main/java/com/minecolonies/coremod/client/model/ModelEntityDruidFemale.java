package com.minecolonies.coremod.client.model;// Made with Blockbench 3.5.1
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import com.minecolonies.api.client.render.modeltype.CitizenModel;
import com.minecolonies.api.entity.citizen.AbstractEntityCitizen;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ModelEntityDruidFemale extends CitizenModel<AbstractEntityCitizen>
{
    private final ModelRenderer headDetail;
    private final ModelRenderer hair;
    private final ModelRenderer hat;
    private final ModelRenderer cape;
    private final ModelRenderer chest;

    public ModelEntityDruidFemale()
    {
        textureWidth = 128;
        textureHeight = 64;

        bipedLeftLeg = new ModelRenderer(this);
        bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        bipedLeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        bipedHead = new ModelRenderer(this);
        bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, true);

        headDetail = new ModelRenderer(this);
        headDetail.setRotationPoint(0.0F, 0.0F, 1.0F);
        bipedHead.addChild(headDetail);
        headDetail.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

        hair = new ModelRenderer(this);
        hair.setRotationPoint(-3.5F, 1.5F, 0.0F);
        bipedHead.addChild(hair);
        hair.setTextureOffset(63, 47).addBox(7.5F, -3.5F, -0.625F, 0.5F, 1.75F, 4.625F, 0.0F, false);
        hair.setTextureOffset(60, 38).addBox(7.5F, -4.25F, -1.0F, 0.5F, 0.75F, 5.0F, 0.0F, false);
        hair.setTextureOffset(55, 52).addBox(7.5F, -5.0F, -2.0F, 0.5F, 0.75F, 6.0F, 0.0F, false);
        hair.setTextureOffset(46, 50).addBox(7.5F, -5.875F, -2.75F, 0.5F, 0.875F, 6.75F, 0.0F, false);
        hair.setTextureOffset(50, 38).addBox(7.5F, -9.5F, -4.25F, 0.5F, 3.625F, 8.25F, 0.0F, false);
        hair.setTextureOffset(21, 38).addBox(-1.0F, -3.5F, -0.625F, 0.5F, 2.0F, 4.625F, 0.0F, false);
        hair.setTextureOffset(10, 52).addBox(0.25F, -3.5F, 3.75F, 6.5F, 6.125F, 1.0F, 0.0F, false);
        hair.setTextureOffset(0, 52).addBox(-1.0F, -9.5F, -4.25F, 0.5F, 3.625F, 8.25F, 0.0F, false);
        hair.setTextureOffset(23, 40).addBox(-1.0F, -9.875F, -4.25F, 9.0F, 0.375F, 8.25F, 0.0F, false);
        hair.setTextureOffset(27, 50).addBox(-1.0F, -9.875F, 4.0F, 9.0F, 11.875F, 0.25F, 0.0F, false);
        hair.setTextureOffset(0, 53).addBox(-1.0F, -9.875F, -4.375F, 3.5F, 1.625F, 0.125F, 0.0F, false);
        hair.setTextureOffset(0, 48).addBox(4.5F, -9.875F, -4.375F, 3.5F, 1.75F, 0.125F, 0.0F, false);
        hair.setTextureOffset(0, 51).addBox(2.5F, -9.875F, -4.375F, 2.0F, 1.25F, 0.25F, 0.0F, false);
        hair.setTextureOffset(0, 57).addBox(-1.0F, -8.25F, -4.375F, 2.0F, 2.125F, 0.125F, 0.0F, false);
        hair.setTextureOffset(0, 55).addBox(1.0F, -8.25F, -4.375F, 1.25F, 1.375F, 0.25F, 0.0F, false);
        hair.setTextureOffset(0, 46).addBox(5.375F, -8.125F, -4.375F, 2.625F, 0.875F, 0.125F, 0.0F, false);
        hair.setTextureOffset(0, 42).addBox(6.5F, -7.25F, -4.375F, 1.5F, 2.875F, 0.125F, 0.0F, false);
        hair.setTextureOffset(0, 38).addBox(6.5F, -5.875F, -4.25F, 1.5F, 2.375F, 0.875F, 0.0F, false);
        hair.setTextureOffset(47, 51).addBox(6.5F, -5.875F, -3.375F, 1.5F, 1.5F, 0.625F, 0.0F, false);
        hair.setTextureOffset(5, 44).addBox(-1.0F, -5.875F, -2.75F, 0.5F, 0.875F, 6.75F, 0.0F, false);
        hair.setTextureOffset(13, 43).addBox(-1.0F, -5.0F, -2.0F, 0.5F, 0.75F, 6.0F, 0.0F, false);
        hair.setTextureOffset(4, 38).addBox(-1.0F, -4.25F, -1.0F, 0.5F, 0.75F, 5.0F, 0.0F, false);

        hat = new ModelRenderer(this);
        hat.setRotationPoint(0.0F, -2.5F, 3.5F);
        bipedHead.addChild(hat);
        setRotationAngle(hat, -0.1745F, 0.0F, 0.0F);
        hat.setTextureOffset(83, 28).addBox(-5.375F, -6.375F, -9.25F, 11.0F, 2.375F, 11.125F, 0.0F, false);
        hat.setTextureOffset(48, 27).addBox(-4.75F, -7.5F, -8.375F, 10.0F, 1.125F, 9.5F, 0.0F, false);
        hat.setTextureOffset(93, 18).addBox(-4.375F, -8.125F, -7.5F, 9.125F, 1.875F, 8.0F, 0.0F, false);
        hat.setTextureOffset(92, 11).addBox(-5.375F, -4.0F, -3.875F, 11.0F, 0.875F, 5.75F, 0.0F, false);
        hat.setTextureOffset(88, 5).addBox(-5.375F, -3.125F, -2.5F, 11.0F, 1.25F, 4.375F, 0.0F, false);
        hat.setTextureOffset(84, 0).addBox(-5.375F, -1.875F, -1.125F, 11.0F, 2.125F, 3.0F, 0.0F, false);
        hat.setTextureOffset(56, 19).addBox(-4.0F, -8.7771F, -6.9944F, 8.375F, 1.25F, 7.125F, 0.0F, false);
        hat.setTextureOffset(64, 11).addBox(-3.625F, -9.3926F, -6.3529F, 7.625F, 1.25F, 5.875F, 0.0F, false);
        hat.setTextureOffset(64, 5).addBox(-3.125F, -9.9986F, -5.82F, 6.75F, 0.625F, 4.875F, 0.0F, false);
        hat.setTextureOffset(64, 0).addBox(-2.5F, -10.6141F, -5.4285F, 5.625F, 0.625F, 4.0F, 0.0F, false);

        bipedRightLeg = new ModelRenderer(this);
        bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        bipedRightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

        bipedLeftArm = new ModelRenderer(this);
        bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        bipedLeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

        bipedRightArm = new ModelRenderer(this);
        bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        bipedRightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        bipedBody = new ModelRenderer(this);
        bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, true);

        cape = new ModelRenderer(this);
        cape.setRotationPoint(0.0F, 7.5F, 2.0F);
        bipedBody.addChild(cape);
        cape.setTextureOffset(74, 42).addBox(-5.125F, -7.875F, -4.5F, 11.0F, 0.25F, 6.25F, 0.0F, false);
        cape.setTextureOffset(75, 49).addBox(-5.125F, -7.625F, 1.375F, 11.0F, 14.25F, 0.375F, 0.0F, false);
        cape.setTextureOffset(98, 49).addBox(-5.125F, 6.625F, 1.375F, 11.0F, 6.5F, 0.375F, 0.0F, false);

        chest = new ModelRenderer(this);
        chest.setRotationPoint(0.0F, 2.875F, -2.125F);
        bipedBody.addChild(chest);
        setRotationAngle(chest, 0.7854F, 0.0F, 0.0F);
        chest.setTextureOffset(0, 32).addBox(-3.0F, -1.2322F, -1.466F, 6.0F, 3.0F, 3.0F, 0.0F, false);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
