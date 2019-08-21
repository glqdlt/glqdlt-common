package com.glqdlt.common.guard.api.scope.pathvariable;

import com.glqdlt.common.guard.api.scope.ContextFireWall;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author Jhun
 * 2019-08-14
 */
public abstract class PathVariableFireWall implements ContextFireWall {

    private PathVariableMatchService pathVariableMatchService;
    private String regex;

    public PathVariableFireWall(PathVariableMatchService pathVariableMatchService, String regex) {
        this.pathVariableMatchService = pathVariableMatchService;
        this.regex = regex;
    }

    public abstract HttpServletRequest getRequest();

    public abstract Map<String, Object> getPathVariable();

}
