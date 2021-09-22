package gateway

import io.micronaut.retry.annotation.Fallback
import org.reactivestreams.Publisher
import reactor.core.publisher.Mono

@Fallback
class GatewayClientFallback implements gateway.EncryptionOperations {

    @Override
    Publisher encrypt( String text ) {
        return Mono.just( new Message( text: "Fallback: ${text}" ) )
    }

}
