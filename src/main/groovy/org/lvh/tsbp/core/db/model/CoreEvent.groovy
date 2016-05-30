package org.lvh.tsbp.core.db.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

/**
 * Created by lvercelli on 5/29/16.
 */
@Entity
@Table(name = "core_event")
class CoreEvent {

    @Id
    @Column(name = "id")
    Integer id

    @ManyToOne
    @JoinColumn(name = "core_entity_id")
    CoreEntity coreEntity;

    @Column(name = "message")
    String description;

    @Override
    public String toString() {
        return """\
CoreEvent{
    id=$id,
    coreEntity=${coreEntity?.id},
    message='$description',
    super=${super.toString()}
}"""
    }
}
