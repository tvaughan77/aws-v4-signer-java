/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2016 the original author or authors.
 */
package uk.co.lucasweb.aws.v4.signer;

import org.junit.Test;

import java.net.URI;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Richard Lucas
 */
public class HttpRequestTest {

    @Test
    public void shouldGetHttpMethod() throws Exception {
        assertThat(new HttpRequest("GET", new URI("http://localhost/test")).getMethod())
                .isEqualTo("GET");
    }

    @Test
    public void shouldGetQuery() throws Exception {
        assertThat(new HttpRequest("GET", new URI("http://localhost/test?test=one&hello=world")).getQuery())
                .isEqualTo("test=one&hello=world");
    }

    @Test
    public void shouldReturnEmptyStringIfNoQuery() throws Exception {
        assertThat(new HttpRequest("GET", new URI("http://localhost/test")).getQuery())
                .isEqualTo("");
    }
}