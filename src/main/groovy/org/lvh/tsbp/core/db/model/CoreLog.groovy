package org.lvh.tsbp.core.db.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table
import javax.persistence.Temporal
import javax.persistence.TemporalType

/**
 * Created by lvercelli on 5/29/16.
 */
@Entity
@Table(name = "core_log")
class CoreLog {

    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id

    @ManyToOne
    @JoinColumn(name = "core_entity_id")
    CoreEntity coreEntity

    @ManyToOne
    @JoinColumn(name = "core_transition_id")
    CoreTransition coreTransition;

    @ManyToOne
    @JoinColumn(name = "core_status_id")
    CoreStatus coreStatus;

    @Column(name = "issued_at")
    @Temporal(TemporalType.TIMESTAMP)
    Date issuedAt;

    @ManyToOne
    @JoinColumn(name = "core_process_id")
    CoreProcess coreProcess;

    @Override
    public String toString() {
        return """\
CoreLog{
    id=$id,
    coreEntity=${coreEntity?.id},
    coreTransition=${coreTransition?.id},
    coreStatus=${coreStatus?.id},
    issuedAt=$issuedAt,
    coreProcess=${coreProcess?.id},
    super=${super.toString()}
}"""
    }
}
