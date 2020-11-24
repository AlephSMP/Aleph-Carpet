package net.alephsmp.aleph_carpet.mixins;

import net.alephsmp.aleph_carpet.AlephSimpleSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.server.world.ServerChunkManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerChunkManager.class)
public class ServerChunkManagerMinix {
    @Inject(method = "shouldTickEntity", at = @At(value = "HEAD"), cancellable =  true)
    private void onShouldTickEntity(Entity entity, CallbackInfoReturnable<Boolean> cir){
        if(entity instanceof ProjectileEntity && AlephSimpleSettings.keepProjectilesTicked)
            cir.setReturnValue(true);
    }
}