package com.glqdlt.common.guard.api.scope;

import java.util.List;

/**
 * @author Jhun
 * 2019-08-14
 */
public interface ContextFireWallProvider {
    void addFireWall(ContextFireWall fireWall);

    void removeFireWall(ContextFireWall fireWall);

    List<ContextFireWall> getFireWall();
}
