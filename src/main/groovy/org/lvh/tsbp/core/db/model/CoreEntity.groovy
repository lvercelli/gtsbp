package org.lvh.tsbp.core.db.model

import javax.persistence.*
/**
 * Created by lvercelli on 5/28/16.
 */
@Entity
@Table(name = "core_entity")
class CoreEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id

    @ManyToOne
    @JoinColumn(name = "core_class_id")
    CoreClass coreClass

    @ManyToOne
    @JoinColumn(name = "creation_core_log_id")
    CoreLog creationCoreLog

    @ManyToOne
    @JoinColumn(name = "last_system_log_id")
    CoreLog lastCoreLog

    @Override
    public String toString() {
        return """\
CoreEntity{
    id=$id,
    coreClass=${coreClass?.id},
    creationCoreLog=${creationCoreLog?.id},
    lastCoreLog=${lastCoreLog?.id},
    super=${super.toString()}
}"""
    }
}
