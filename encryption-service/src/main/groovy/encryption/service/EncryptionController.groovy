package encryption.service

import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.reactivestreams.Publisher

@Controller( "/" )
class EncryptionController {

    private final EncryptionService encryptionService

    EncryptionController( EncryptionService encryptionService ) {
        this.encryptionService = encryptionService
    }

    @Get( "/encrypt/{text}" )
    @SingleResult
    Publisher encrypt( String text ) {
        return encryptionService.encrypt( text )
    }

}
