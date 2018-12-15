package encryption.service

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Single

@Controller( "/" )
class EncryptionController {

    private final EncryptionService encryptionService

    EncryptionController( EncryptionService encryptionService ) {
        this.encryptionService = encryptionService
    }

    @Get( "/encrypt/{text}" )
    Single encrypt( String text ) {
        return encryptionService.encrypt( text )
    }

}
