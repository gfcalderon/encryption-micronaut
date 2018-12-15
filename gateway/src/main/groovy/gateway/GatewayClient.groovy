package gateway

import io.micronaut.http.client.annotation.Client

@Client( id="encryption-service" )
interface GatewayClient extends EncryptionOperations{

}