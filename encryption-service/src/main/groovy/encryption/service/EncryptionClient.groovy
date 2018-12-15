package encryption.service

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Single

@Client( "/" )
interface EncryptionClient {

    @Get( "/encrypt/{text}" )
    Single encrypt( String text )

}