package org.lvh.tsbp.auth.api.response

import org.lvh.tsbp.auth.db.model.AuthToken
import org.lvh.tsbp.core.api.response.ProcessResponse
/**
 * Created by lvercelli on 5/29/16.
 */
class SignUpResponse extends ProcessResponse {

    String token

    SignUpResponse(AuthToken authToken) {
        super(authToken.coreEntity.creationCoreLog.coreProcess.coreOperationResult)
        this.token = authToken.token
    }
}
