package gateway

import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.http.annotation.Get
import org.reactivestreams.Publisher

interface EncryptionOperations {

    @Get( "/encrypt/{text}" )
    @SingleResult
    Publisher encrypt( String text )

}