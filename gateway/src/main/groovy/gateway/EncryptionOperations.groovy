package gateway

import io.micronaut.http.annotation.Get
import io.reactivex.Single

interface EncryptionOperations {

    @Get( "/encrypt/{text}" )
    Single encrypt( String text )

}