package org.lvh.tsbp.core.api.response

import org.lvh.tsbp.core.db.model.CoreOperationResult

/**
 * Created by lvercelli on 5/29/16.
 */
class ProcessResponse extends ApiResponse {

    String code

    String message

    ProcessResponse(CoreOperationResult result) {
        this.code = result.code
        this.message = result.message
    }

    @Override
    public String toString() {
        return """\
ProcessResponse{
    code='$code',
    message='$message',
    super=${super.toString()}
}"""
    }
}
