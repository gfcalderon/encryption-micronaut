package gateway

import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.reactivestreams.Publisher

@Controller( "/api/v1" )
class GatewayController implements EncryptionOperations {

    private final GatewayClient gatewayClient

    GatewayController( GatewayClient gatewayClient ) {
        this.gatewayClient = gatewayClient
    }

    @Get( "/encrypt/{text}" )
    @SingleResult
    Publisher encrypt( String text ) {
        return gatewayClient.encrypt( text )
    }
}
