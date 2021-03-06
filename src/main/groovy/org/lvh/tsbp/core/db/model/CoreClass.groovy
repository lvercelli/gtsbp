package org.lvh.tsbp.core.db.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by lvercelli on 5/28/16.
 */
@Entity
@Table(name = "core_class")
class CoreClass {

    @Id
    @Column(name = "id")
    Integer id

    @Column(name = "name", length = 255)
    String name

    @Override
    public String toString() {
        return """\
CoreClass{
    id=$id,
    name='$name',
    super=${super.toString()}
}"""
    }
}
