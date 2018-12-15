package gateway

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Single

@Controller( "/api/v1" )
class GatewayController implements EncryptionOperations {

    private final GatewayClient gatewayClient

    GatewayController( GatewayClient gatewayClient ) {
        this.gatewayClient = gatewayClient
    }

    @Get( "/encrypt/{text}" )
    Single encrypt( String text ) {
        return gatewayClient.encrypt( text )
    }
}
