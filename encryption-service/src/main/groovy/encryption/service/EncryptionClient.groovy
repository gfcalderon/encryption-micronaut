package encryption.service

import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import org.reactivestreams.Publisher


@Client( "/" )
interface EncryptionClient {

    @Get( "/encrypt/{text}" )
    @SingleResult
    Publisher encrypt( String text )

}