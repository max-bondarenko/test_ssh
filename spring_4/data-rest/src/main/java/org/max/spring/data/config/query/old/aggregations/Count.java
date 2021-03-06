package org.max.spring.data.config.query.old.aggregations;


import org.max.spring.data.config.query.old.Base;
import org.max.spring.data.config.query.old.HasParent;

import java.util.Map;

/**
 * Created by Maksym_Bondarenko on 3/4/2016.
 */
public class Count<T extends HasParent, Parent extends T> extends Base<Parent> {

    Count(Map<String, Object> b, Parent p) {
        super(b, p);
        b.put("type", "count");
    }

    public Count<T, ?> name(String name) {
        b.put("name", name);
        return this;
    }

}
