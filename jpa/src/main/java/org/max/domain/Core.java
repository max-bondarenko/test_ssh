package org.max.domain;

import org.hibernate.annotations.SortComparator;
import org.hibernate.annotations.SortNatural;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by add on 17.06.2015.
 */
@Entity
public class Core {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    private One one;

    @ElementCollection
    @CollectionTable(name = "items")
    private List<ListItem> list;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "core_id",referencedColumnName = "id")
    @OrderBy("name")
    private Set<SetItem> set = new LinkedHashSet<>();

    public Core() {
    }


    public Set<SetItem> getSet() {
        return set;
    }

    public void setSet(Set<SetItem> set) {
        this.set = set;
    }

    public Core(One one) {
        this.one = one;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public One getOne() {
        return one;
    }

    public void setOne(One one) {
        this.one = one;
    }

    public List<ListItem> getList() {
        return list;
    }

    public void setList(List<ListItem> list) {
        this.list = list;
    }
}
