package org.lvh.tsbp.core.db.model

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
@Table(name = "core_transition")
class CoreTransition {

    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;

    @ManyToOne
    @JoinColumn(name = "core_event_id")
    CoreEvent coreEvent;

    @ManyToOne
    @JoinColumn(name = "prev_system_status_id")
    CoreStatus prevCoreStatus;

    @ManyToOne
    @JoinColumn(name = "post_system_status_id")
    CoreStatus postCoreStatus;

    @Override
    public String toString() {
        return """\
CoreTransition{
    id=$id,
    coreEvent=${coreEvent?.id},
    prevCoreStatus=${prevCoreStatus?.id},
    postCoreStatus=${postCoreStatus?.id},
    super=${super.toString()}
}"""
    }
}
