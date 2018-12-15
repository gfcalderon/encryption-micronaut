package encryption.service

import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

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
            def response = encryptionClient.encrypt( "foo" ).blockingGet().text

        then:
            response == "Zm9v -> ${server.port}"
    }

}
