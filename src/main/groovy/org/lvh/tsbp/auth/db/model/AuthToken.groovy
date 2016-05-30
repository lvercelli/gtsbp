package org.lvh.tsbp.auth.db.model

import org.lvh.tsbp.core.db.model.CoreEntity
import org.lvh.tsbp.core.db.model.CoreUser

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

/**
 * Created by lvercelli on 5/29/16.
 */
@Entity
@Table(name = "auth_token")
class AuthToken {

    @Id
    @GeneratedValue
    @Column(name = "id")
    Integer id

    @ManyToOne
    @JoinColumn(name = "core_entity_id")
    CoreEntity coreEntity

    @ManyToOne
    @JoinColumn(name = "core_user_id")
    CoreUser coreUser

    @Column(name = "token")
    String token

    @Override
    public String toString() {
        return """\
AuthToken{
    id=$id,
    coreEntity=${coreEntity?.id},
    coreUser=${coreUser?.id},
    token='$token',
    super=${super.toString()}
}"""
    }
}
