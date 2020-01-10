package org.springframework.cloud.contract.stubrunner.provider.wiremock;

import com.github.tomakehurst.wiremock.extension.Extension;
import org.springframework.cloud.contract.verifier.dsl.wiremock.DefaultResponseTransformer;
import org.springframework.cloud.contract.verifier.dsl.wiremock.WireMockExtensions;

import java.util.List;

/**
 * Extension that registers the default transformer and the custom one
 */
class TestWireMockExtensions implements WireMockExtensions {

    @Override
    public List<Extension> extensions() {
        return List.of(
                new DefaultResponseTransformer(),
                new CustomExtension()
        );
    }

    class CustomExtension implements Extension {

        @Override
        public String getName() {
            return "foo-transformer";
        }
    }
}


