package net.alephsmp.aleph_carpet.mixins.llamaDupe;

import net.alephsmp.aleph_carpet.AlephSimpleSettings;
import net.minecraft.entity.Entity;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.network.ServerPlayerEntity;
import org.apache.logging.log4j.LogManager;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.apache.logging.log4j.Logger;

@Mixin(PlayerManager.class)
public abstract class PlayerManagerMixin{

    @Final
    @Shadow private static final Logger LOGGER = LogManager.getLogger();

    private boolean llamaDupeCase;

    @Redirect(method = "remove", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/network/ServerPlayerEntity;hasVehicle()Z"))
    private boolean llamaDupeHasVehicle(ServerPlayerEntity serverPlayerEntity){
        boolean hasVehicle = serverPlayerEntity.hasVehicle();
        llamaDupeCase = hasVehicle && AlephSimpleSettings.llamaDupeFeature;
        return hasVehicle;
    }
    @Redirect(method="remove", at = @At(value="FIELD", target = "Lnet/minecraft/entity/Entity;removed:Z", opcode = Opcodes.PUTFIELD))
    private void replaceRemove(Entity entity, boolean value) {
        entity.removed = !llamaDupeCase;
    }
}