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

import co.elastic.clients.elasticsearch._types.EmptyObject;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_service_credentials.Response
@JsonpDeserializable
public class GetServiceCredentialsResponse implements JsonpSerializable {
	private final String serviceAccount;

	private final String nodeName;

	private final int count;

	private final Map<String, EmptyObject> tokens;

	private final Map<String, EmptyObject> fileTokens;

	// ---------------------------------------------------------------------------------------------

	private GetServiceCredentialsResponse(Builder builder) {

		this.serviceAccount = ModelTypeHelper.requireNonNull(builder.serviceAccount, this, "serviceAccount");
		this.nodeName = ModelTypeHelper.requireNonNull(builder.nodeName, this, "nodeName");
		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.tokens = ModelTypeHelper.unmodifiableRequired(builder.tokens, this, "tokens");
		this.fileTokens = ModelTypeHelper.unmodifiableRequired(builder.fileTokens, this, "fileTokens");

	}

	public static GetServiceCredentialsResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code service_account}
	 */
	public final String serviceAccount() {
		return this.serviceAccount;
	}

	/**
	 * Required - API name: {@code node_name}
	 */
	public final String nodeName() {
		return this.nodeName;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code tokens}
	 */
	public final Map<String, EmptyObject> tokens() {
		return this.tokens;
	}

	/**
	 * Required - API name: {@code file_tokens}
	 */
	public final Map<String, EmptyObject> fileTokens() {
		return this.fileTokens;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("service_account");
		generator.write(this.serviceAccount);

		generator.writeKey("node_name");
		generator.write(this.nodeName);

		generator.writeKey("count");
		generator.write(this.count);

		if (ModelTypeHelper.isDefined(this.tokens)) {
			generator.writeKey("tokens");
			generator.writeStartObject();
			for (Map.Entry<String, EmptyObject> item0 : this.tokens.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.fileTokens)) {
			generator.writeKey("file_tokens");
			generator.writeStartObject();
			for (Map.Entry<String, EmptyObject> item0 : this.fileTokens.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetServiceCredentialsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetServiceCredentialsResponse> {
		private String serviceAccount;

		private String nodeName;

		private Integer count;

		private Map<String, EmptyObject> tokens;

		private Map<String, EmptyObject> fileTokens;

		/**
		 * Required - API name: {@code service_account}
		 */
		public final Builder serviceAccount(String value) {
			this.serviceAccount = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_name}
		 */
		public final Builder nodeName(String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 */
		public final Builder tokens(Map<String, EmptyObject> value) {
			this.tokens = value;
			return this;
		}

		public final Builder tokens(
				Function<MapBuilder<String, EmptyObject, EmptyObject.Builder>, ObjectBuilder<Map<String, EmptyObject>>> fn) {
			return tokens(fn.apply(new MapBuilder<>(EmptyObject.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code file_tokens}
		 */
		public final Builder fileTokens(Map<String, EmptyObject> value) {
			this.fileTokens = value;
			return this;
		}

		public final Builder fileTokens(
				Function<MapBuilder<String, EmptyObject, EmptyObject.Builder>, ObjectBuilder<Map<String, EmptyObject>>> fn) {
			return fileTokens(fn.apply(new MapBuilder<>(EmptyObject.Builder::new)).build());
		}

		/**
		 * Builds a {@link GetServiceCredentialsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetServiceCredentialsResponse build() {
			_checkSingleUse();

			return new GetServiceCredentialsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetServiceCredentialsResponse}
	 */
	public static final JsonpDeserializer<GetServiceCredentialsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetServiceCredentialsResponse::setupGetServiceCredentialsResponseDeserializer);

	protected static void setupGetServiceCredentialsResponseDeserializer(
			ObjectDeserializer<GetServiceCredentialsResponse.Builder> op) {

		op.add(Builder::serviceAccount, JsonpDeserializer.stringDeserializer(), "service_account");
		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node_name");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::tokens, JsonpDeserializer.stringMapDeserializer(EmptyObject._DESERIALIZER), "tokens");
		op.add(Builder::fileTokens, JsonpDeserializer.stringMapDeserializer(EmptyObject._DESERIALIZER), "file_tokens");

	}

}
