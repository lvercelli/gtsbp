package org.lvh.tsbp.auth.api.data

import javax.validation.constraints.NotNull
/**
 * Created by lvercelli on 5/29/16.
 */
class SignUpData {

    @NotNull
    String email

    @NotNull
    String password

    String firstName

    String lastName

    @Override
    public String toString() {
        "SignUpData{email=$email, firstName=$firstName, lastName=$lastName}"
    }
}
