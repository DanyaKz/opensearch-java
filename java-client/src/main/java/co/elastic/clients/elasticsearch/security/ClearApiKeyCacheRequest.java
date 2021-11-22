/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: security.clear_api_key_cache.Request

public class ClearApiKeyCacheRequest extends RequestBase {
	private final List<String> ids;

	// ---------------------------------------------------------------------------------------------

	private ClearApiKeyCacheRequest(Builder builder) {

		this.ids = ModelTypeHelper.unmodifiableRequired(builder.ids, this, "ids");

	}

	public static ClearApiKeyCacheRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - A comma-separated list of IDs of API keys to clear from the cache
	 * <p>
	 * API name: {@code ids}
	 */
	public final List<String> ids() {
		return this.ids;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearApiKeyCacheRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClearApiKeyCacheRequest> {
		private List<String> ids;

		/**
		 * Required - A comma-separated list of IDs of API keys to clear from the cache
		 * <p>
		 * API name: {@code ids}
		 */
		public final Builder ids(List<String> value) {
			this.ids = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of IDs of API keys to clear from the cache
		 * <p>
		 * API name: {@code ids}
		 */
		public final Builder ids(String... value) {
			this.ids = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link ClearApiKeyCacheRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearApiKeyCacheRequest build() {
			_checkSingleUse();

			return new ClearApiKeyCacheRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.clear_api_key_cache}".
	 */
	public static final Endpoint<ClearApiKeyCacheRequest, ClearApiKeyCacheResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _ids = 1 << 0;

				int propsSet = 0;

				propsSet |= _ids;

				if (propsSet == (_ids)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/api_key");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.ids.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_clear_cache");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, ClearApiKeyCacheResponse._DESERIALIZER);
}
