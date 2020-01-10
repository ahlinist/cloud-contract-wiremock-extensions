import org.springframework.cloud.contract.spec.Contract
import org.springframework.cloud.contract.verifier.dsl.wiremock.DefaultResponseTransformer
import org.springframework.cloud.contract.verifier.dsl.wiremock.WireMockResponseStubStrategy

Contract.make {
    request {
        method GET()
        url '/foo'
    }
    response {
        status OK()
    }
}
