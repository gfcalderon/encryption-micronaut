package encryption.service

import io.micronaut.runtime.server.EmbeddedServer
import jakarta.inject.Singleton
import org.reactivestreams.Publisher
import reactor.core.publisher.Mono

@Singleton
class EncryptionService {

    private final EmbeddedServer server

    EncryptionService( EmbeddedServer server ) {
        this.server = server
    }

    Publisher encrypt( String text ) {
        String encrypted = text.bytes.encodeBase64().toString()
        return Mono.just( new Message(text: encrypted + " -> " + server.port ) )
    }

}
