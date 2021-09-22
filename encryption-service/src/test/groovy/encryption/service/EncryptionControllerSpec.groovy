package encryption.service

import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import reactor.core.publisher.Mono
import spock.lang.Specification

@MicronautTest
class EncryptionControllerSpec extends Specification {

    @Inject
    EncryptionClient encryptionClient

    @Inject
    EmbeddedServer server

    void "test encrypt text response"() {

        given:
            encryptionClient

        when:
            def response = Mono.from(encryptionClient.encrypt("foo" ) ).block().text

        then:
            response == "Zm9v -> ${server.port}"
    }

}
