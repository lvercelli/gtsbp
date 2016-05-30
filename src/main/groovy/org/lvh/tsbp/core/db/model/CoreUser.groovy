package org.lvh.tsbp.core.db.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
/**
 * Created by lvercelli on 5/28/16.
 */
@Entity
@Table(name = "core_user")
class CoreUser {

    @Id
    @GeneratedValue
    @Column(name = "id")
    Integer id

    @Column(name = "first_name")
    String firstName

    @Column(name = "last_name")
    String lastName

    @Override
    public String toString() {
        return """\
CoreUser{
    id=$id,
    firstName=$firstName,
    lastName=$lastName,
    super=${super.toString()}
}"""
    }
}