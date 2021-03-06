package org.max.spring.data.config.test_repos;

import org.max.spring.data.config.annotations.DruidQuery;
import org.max.spring.data.config.repository.GetRepository;

import java.util.Date;
import java.util.Map;

/**
 * Created by Maksym_Bondarenko on 2/15/2016.
 */
@DruidQuery
public interface SimpleRepo extends GetRepository<Map, String> {
    @DruidQuery(dataSource = "wikipedia")
    Map findByDate(Date weq);

    Map findInQueryAnd(String a1, int a2);
}
