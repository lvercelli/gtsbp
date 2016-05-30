package org.lvh.tsbp.core.db.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

/**
 * Created by lvercelli on 5/28/16.
 */
@Entity
@Table(name = "core_operation_result")
class CoreOperationResult {

    @Id
    @Column(name = "id")
    Integer id

    @ManyToOne
    @JoinColumn(name = "core_operation_id")
    CoreOperation coreOperation

    @Column(name = "description", length = 255)
    String description

    @Column(name = "code", length = 255)
    String code

    @Column(name = "message", length = 255)
    String message

    @Override
    public String toString() {
        return """\
CoreOperationResult{
    id=$id,
    coreOperation=${coreOperation?.id},
    message='$description',
    code='$code',
    message='$message',
    super=${super.toString()}
}"""
    }
}
