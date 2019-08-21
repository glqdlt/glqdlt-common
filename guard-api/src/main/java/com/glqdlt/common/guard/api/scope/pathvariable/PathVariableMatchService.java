package com.glqdlt.common.guard.api.scope.pathvariable;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Jhun
 * 2019-08-12
 */
public interface PathVariableMatchService<T extends MatchingItem> {

    List<T> getItems();

    T findByItemCode(Long code);

    T findByItemName(String name);

    default List<String> getItemNameEntry() {
        return getItems().stream()
                .map(x -> (MatchingItem) x)
                .map(MatchingItem::getName)
                .collect(Collectors.toList());
    }

}