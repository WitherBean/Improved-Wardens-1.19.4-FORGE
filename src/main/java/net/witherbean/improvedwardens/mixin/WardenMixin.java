package net.witherbean.improvedwardens.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class WardenMixin {

    public static void onTick(Entity entity) {
        if (entity instanceof Warden) {
            Warden warden = (Warden) entity;
            Vec3 pos = warden.getPosition(1);
            double frontPos = pos.distanceTo(warden.getLookAngle());
                {
                    ((Warden) entity).setSprinting(false);
                    warden.setSpeed(0.15f);
                    warden.getXRot() = warden.xRotO + warden.getXRot();

                }
            }
        }
    }
