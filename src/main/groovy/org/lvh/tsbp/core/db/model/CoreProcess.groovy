package org.lvh.tsbp.core.db.model

import javax.persistence.*
/**
 * Created by lvercelli on 5/28/16.
 */
@Entity
@Table(name = "core_process")
class CoreProcess {

    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id

    @ManyToOne
    @JoinColumn(name = "core_operation_id")
    CoreOperation coreOperation

    @ManyToOne
    @JoinColumn(name = "issued_by_core_user_id")
    CoreUser issuedBy

    @Column(name = "started_at")
    @Temporal(TemporalType.TIMESTAMP)
    Date startedAt

    @Column(name = "finished_at")
    @Temporal(TemporalType.TIMESTAMP)
    Date finishedAt

    @ManyToOne
    @JoinColumn(name = "core_operation_result_id")
    CoreOperationResult coreOperationResult

    @Column(name = "remarks", length = 255)
    String remarks

    @Column(name = "exception", length = 10000)
    String exception

    @Override
    public String toString() {
        return """\
CoreProcess{
    id=$id,
    coreOperation=${coreOperation?.id},
    issuedBy=${issuedBy?.id},
    startedAt=$startedAt,
    finishedAt=$finishedAt,
    coreOperationResult=${coreOperationResult?.id},
    remarks='$remarks',
    exception='$exception',
    super=${super.toString()}
}"""
    }
}
