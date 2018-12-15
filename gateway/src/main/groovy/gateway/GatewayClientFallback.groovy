package gateway

import io.micronaut.retry.annotation.Fallback
import io.reactivex.Single

@Fallback
class GatewayClientFallback implements gateway.EncryptionOperations {

    @Override
    Single encrypt( String text ) {
        return Single.just( new Message( text: "Fallback: ${text}" ) )
    }

}
