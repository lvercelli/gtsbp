package org.lvh.tsbp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by lvercelli on 5/28/16.
 */
@SpringBootApplication
class WebApplication {

    static void main(String[] args) {
        SpringApplication app = new SpringApplication(WebApplication.class)
        app.run(args)
    }
}
