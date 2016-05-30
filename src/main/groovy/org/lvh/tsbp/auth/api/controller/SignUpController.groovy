package org.lvh.tsbp.auth.api.controller

import org.apache.log4j.Logger
import org.lvh.tsbp.auth.api.data.SignUpData
import org.lvh.tsbp.auth.api.response.SignUpResponse
import org.lvh.tsbp.auth.db.model.AuthToken
import org.lvh.tsbp.core.db.model.CoreEntity
import org.lvh.tsbp.core.db.model.CoreLog
import org.lvh.tsbp.core.db.model.CoreOperationResult
import org.lvh.tsbp.core.db.model.CoreProcess
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
/**
 * Created by lvercelli on 5/29/16.
 */
@RestController
@RequestMapping("/signup")
class SignUpController {

    static final Logger log = Logger.getLogger(SignUpController.class)

    @RequestMapping(method = RequestMethod.POST)
    SignUpResponse signUp(@RequestBody @Validated SignUpData data) {
        log.info(data)
        AuthToken authToken = new AuthToken()
        authToken.id = 1
        authToken.token = "gdf69sg87f"
        authToken.coreEntity = new CoreEntity()
        authToken.coreEntity.creationCoreLog = new CoreLog()
        authToken.coreEntity.creationCoreLog.coreProcess = new CoreProcess()
        authToken.coreEntity.creationCoreLog.coreProcess.coreOperationResult = new CoreOperationResult()
        authToken.coreEntity.creationCoreLog.coreProcess.coreOperationResult.code = "0"
        authToken.coreEntity.creationCoreLog.coreProcess.coreOperationResult.message = "Usuario creado exitosamente"
        authToken.coreEntity.lastCoreLog = authToken.coreEntity.creationCoreLog

        return new SignUpResponse(authToken)
    }
}
