package encryption.service

import io.micronaut.runtime.server.EmbeddedServer
import io.reactivex.Single

import javax.inject.Singleton

@Singleton
class EncryptionService {

    private final EmbeddedServer server

    EncryptionService( EmbeddedServer server ) {
        this.server = server
    }

    Single encrypt( String text ) {
        String encrypted = text.bytes.encodeBase64().toString()
        return Single.just( new Message( text: encrypted + " -> " + server.port ) )
    }

}
