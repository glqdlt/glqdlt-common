package com.glqdlt.common.guard.api.scope;

import java.util.List;

/**
 * @author Jhun
 * 2019-08-14
 */
public class ContextAuthenticationExecutorDefaultsImpl implements ContextAuthenticationExecutor {
    private ContextFireWallProvider contextFireWallProvider;

    public ContextAuthenticationExecutorDefaultsImpl(ContextFireWallProvider contextFireWallProvider) {
        this.contextFireWallProvider = contextFireWallProvider;
    }

    @Override
    public boolean isAuthenticated() {
        List<ContextFireWall> filters = contextFireWallProvider.getFireWall();
        return filters.stream()
                .allMatch(ContextFireWall::isAllow);
    }
}
