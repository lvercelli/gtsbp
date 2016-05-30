package org.lvh.tsbp.core.db.model

import javax.persistence.*
/**
 * Created by lvercelli on 5/29/16.
 */
@Entity
@Table(name = "auth_user_email")
class CoreUserEmail {

    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id

    @ManyToOne
    @JoinColumn(name = "core_user_id")
    CoreUser coreUser

    @Column(name = "email", length = 255)
    String email

    @Column(name = "primary")
    Boolean primary

    @Override
    public String toString() {
        return """\
CoreUserEmail{
    id=$id,
    coreUser=${coreUser?.id},
    email='$email',
    primary=$primary,
    super=${super.toString()}
}"""
    }
}
