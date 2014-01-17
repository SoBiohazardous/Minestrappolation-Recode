package sobiohazardous.minestrappolation.extramobdrops.tileentity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHangGlider extends ModelBase
{
  //fields
    ModelRenderer Mainstrut;
    ModelRenderer Sidestrut1;
    ModelRenderer Sidestrut2;
    ModelRenderer Bottomstrut;
    ModelRenderer Handlebar;
    ModelRenderer WingA;
    ModelRenderer WingB;
    ModelRenderer WingC;
    ModelRenderer WingD;
    ModelRenderer WingE;
    ModelRenderer WingF;
    ModelRenderer WingG;
    ModelRenderer WingH;
    ModelRenderer WingI;
    ModelRenderer WingJ;
    ModelRenderer WingK;
    ModelRenderer WingL;
    ModelRenderer WingM;
    ModelRenderer WingN;
    ModelRenderer WingO;
    ModelRenderer WingP;
  
  public ModelHangGlider()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Mainstrut = new ModelRenderer(this, 36, 3);
      Mainstrut.addBox(0F, 0F, 0F, 4, 4, 32);
      Mainstrut.setRotationPoint(-2F, -12F, -8F);
      Mainstrut.setTextureSize(128, 64);
      Mainstrut.mirror = true;
      setRotation(Mainstrut, 0F, 0F, 0F);
      Sidestrut1 = new ModelRenderer(this, 0, 0);
      Sidestrut1.addBox(0F, 0F, -30F, 3, 3, 30);
      Sidestrut1.setRotationPoint(-2F, -11.5F, 24F);
      Sidestrut1.setTextureSize(128, 64);
      Sidestrut1.mirror = true;
      setRotation(Sidestrut1, 0F, 0.5235988F, 0F);
      Sidestrut2 = new ModelRenderer(this, 0, 0);
      Sidestrut2.addBox(-3F, 0F, -30F, 3, 3, 30);
      Sidestrut2.setRotationPoint(2F, -11.5F, 24F);
      Sidestrut2.setTextureSize(128, 64);
      Sidestrut2.mirror = true;
      setRotation(Sidestrut2, 0F, -0.5235988F, 0F);
      Bottomstrut = new ModelRenderer(this, 38, 0);
      Bottomstrut.addBox(-1F, -2F, -12F, 2, 2, 12);
      Bottomstrut.setRotationPoint(0F, -8F, 24F);
      Bottomstrut.setTextureSize(128, 64);
      Bottomstrut.mirror = true;
      setRotation(Bottomstrut, 1.047198F, 0F, 0F);
      Handlebar = new ModelRenderer(this, 44, 16);
      Handlebar.addBox(-5F, -1.5F, -11.5F, 10, 1, 1);
      Handlebar.setRotationPoint(0F, -8F, 24F);
      Handlebar.setTextureSize(128, 64);
      Handlebar.mirror = true;
      setRotation(Handlebar, 1.047198F, 0F, 0F);
      WingA = new ModelRenderer(this, 0, 0);
      WingA.addBox(0F, 0F, 0F, 8, 1, 2);
      WingA.setRotationPoint(-4F, -11F, 18F);
      WingA.setTextureSize(128, 64);
      WingA.mirror = true;
      setRotation(WingA, 0F, 0F, 0F);
      WingB = new ModelRenderer(this, 0, 3);
      WingB.addBox(0F, 0F, 0F, 10, 1, 2);
      WingB.setRotationPoint(-5F, -11F, 16F);
      WingB.setTextureSize(128, 64);
      WingB.mirror = true;
      setRotation(WingB, 0F, 0F, 0F);
      WingC = new ModelRenderer(this, 0, 6);
      WingC.addBox(0F, 0F, 0F, 12, 1, 2);
      WingC.setRotationPoint(-6F, -11F, 14F);
      WingC.setTextureSize(128, 64);
      WingC.mirror = true;
      setRotation(WingC, 0F, 0F, 0F);
      WingD = new ModelRenderer(this, 0, 33);
      WingD.addBox(0F, 0F, 0F, 14, 1, 2);
      WingD.setRotationPoint(-7F, -11F, 12F);
      WingD.setTextureSize(128, 64);
      WingD.mirror = true;
      setRotation(WingD, 0F, 0F, 0F);
      WingE = new ModelRenderer(this, 0, 36);
      WingE.addBox(0F, 0F, 0F, 16, 1, 2);
      WingE.setRotationPoint(-8F, -11F, 10F);
      WingE.setTextureSize(128, 64);
      WingE.mirror = true;
      setRotation(WingE, 0F, 0F, 0F);
      WingF = new ModelRenderer(this, 0, 39);
      WingF.addBox(0F, 0F, 0F, 18, 1, 2);
      WingF.setRotationPoint(-9F, -11F, 8F);
      WingF.setTextureSize(128, 64);
      WingF.mirror = true;
      setRotation(WingF, 0F, 0F, 0F);
      WingG = new ModelRenderer(this, 0, 42);
      WingG.addBox(0F, 0F, 0F, 20, 1, 2);
      WingG.setRotationPoint(-10F, -11F, 6F);
      WingG.setTextureSize(128, 64);
      WingG.mirror = true;
      setRotation(WingG, 0F, 0F, 0F);
      WingH = new ModelRenderer(this, 0, 45);
      WingH.addBox(0F, 0F, 0F, 22, 1, 2);
      WingH.setRotationPoint(-11F, -11F, 4F);
      WingH.setTextureSize(128, 64);
      WingH.mirror = true;
      setRotation(WingH, 0F, 0F, 0F);
      WingI = new ModelRenderer(this, 0, 48);
      WingI.addBox(0F, 0F, 0F, 24, 1, 2);
      WingI.setRotationPoint(-12F, -11F, 2F);
      WingI.setTextureSize(128, 64);
      WingI.mirror = true;
      setRotation(WingI, 0F, 0F, 0F);
      WingJ = new ModelRenderer(this, 0, 51);
      WingJ.addBox(0F, 0F, 0F, 26, 1, 2);
      WingJ.setRotationPoint(-13F, -11F, 0F);
      WingJ.setTextureSize(128, 64);
      WingJ.mirror = true;
      setRotation(WingJ, 0F, 0F, 0F);
      WingK = new ModelRenderer(this, 0, 54);
      WingK.addBox(0F, 0F, 0F, 28, 1, 2);
      WingK.setRotationPoint(-14F, -11F, -2F);
      WingK.setTextureSize(128, 64);
      WingK.mirror = true;
      setRotation(WingK, 0F, 0F, 0F);
      WingL = new ModelRenderer(this, 62, 39);
      WingL.addBox(0F, 0F, 0F, 22, 1, 1);
      WingL.setRotationPoint(-11F, -11F, -3F);
      WingL.setTextureSize(128, 64);
      WingL.mirror = true;
      setRotation(WingL, 0F, 0F, 0F);
      WingM = new ModelRenderer(this, 74, 41);
      WingM.addBox(0F, 0F, 0F, 16, 1, 1);
      WingM.setRotationPoint(-8F, -11F, -4F);
      WingM.setTextureSize(128, 64);
      WingM.mirror = true;
      setRotation(WingM, 0F, 0F, 0F);
      WingN = new ModelRenderer(this, 82, 43);
      WingN.addBox(0F, 0F, 0F, 12, 1, 1);
      WingN.setRotationPoint(-6F, -11F, -5F);
      WingN.setTextureSize(128, 64);
      WingN.mirror = true;
      setRotation(WingN, 0F, 0F, 0F);
      WingO = new ModelRenderer(this, 90, 45);
      WingO.addBox(0F, 0F, 0F, 8, 1, 1);
      WingO.setRotationPoint(-4F, -11F, -6F);
      WingO.setTextureSize(128, 64);
      WingO.mirror = true;
      setRotation(WingO, 0F, 0F, 0F);
      WingP = new ModelRenderer(this, 94, 47);
      WingP.addBox(0F, 0F, 0F, 6, 1, 1);
      WingP.setRotationPoint(-3F, -11F, -7F);
      WingP.setTextureSize(128, 64);
      WingP.mirror = true;
      setRotation(WingP, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Mainstrut.render(f5);
    Sidestrut1.render(f5);
    Sidestrut2.render(f5);
    Bottomstrut.render(f5);
    Handlebar.render(f5);
    WingA.render(f5);
    WingB.render(f5);
    WingC.render(f5);
    WingD.render(f5);
    WingE.render(f5);
    WingF.render(f5);
    WingG.render(f5);
    WingH.render(f5);
    WingI.render(f5);
    WingJ.render(f5);
    WingK.render(f5);
    WingL.render(f5);
    WingM.render(f5);
    WingN.render(f5);
    WingO.render(f5);
    WingP.render(f5);
  }
  
  public void render(float f5)
  {
	    Mainstrut.render(f5);
	    Sidestrut1.render(f5);
	    Sidestrut2.render(f5);
	    Bottomstrut.render(f5);
	    Handlebar.render(f5);
	    WingA.render(f5);
	    WingB.render(f5);
	    WingC.render(f5);
	    WingD.render(f5);
	    WingE.render(f5);
	    WingF.render(f5);
	    WingG.render(f5);
	    WingH.render(f5);
	    WingI.render(f5);
	    WingJ.render(f5);
	    WingK.render(f5);
	    WingL.render(f5);
	    WingM.render(f5);
	    WingN.render(f5);
	    WingO.render(f5);
	    WingP.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}