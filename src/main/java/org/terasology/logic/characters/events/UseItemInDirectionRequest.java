package org.terasology.logic.characters.events;

import org.terasology.entitySystem.EntityRef;
import org.terasology.network.Replicate;
import org.terasology.network.ServerEvent;

import javax.vecmath.Vector3f;

/**
 * A request for a player to use an item in a direction
 *
 * @author Immortius
 */
@ServerEvent(lagCompensate = true)
public class UseItemInDirectionRequest extends UseItemRequest {

    @Replicate
    private Vector3f direction = new Vector3f();

    protected UseItemInDirectionRequest() {
    }

    public UseItemInDirectionRequest(EntityRef usedItem, Vector3f direction) {
        super(usedItem);
        this.direction.set(direction);
    }

    public Vector3f getDirection() {
        return direction;
    }
}
