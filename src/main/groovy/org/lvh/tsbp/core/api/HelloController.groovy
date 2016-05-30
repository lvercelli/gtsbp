package org.lvh.tsbp.core.api

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by lvercelli on 5/28/16.
 */
@RestController
class HelloController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    Map<String, String> index() {
        Map<String, String> result = new HashMap<String, String>()
        result.put("msg", "Hola mundo")
        return result
    }
}
