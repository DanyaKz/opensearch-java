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

package co.elastic.clients.elasticsearch.indices.add_block;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: indices.add_block.IndicesBlockStatus
@JsonpDeserializable
public class IndicesBlockStatus implements JsonpSerializable {
	private final String name;

	private final boolean blocked;

	// ---------------------------------------------------------------------------------------------

	private IndicesBlockStatus(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.blocked = ModelTypeHelper.requireNonNull(builder.blocked, this, "blocked");

	}

	public static IndicesBlockStatus of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code blocked}
	 */
	public final boolean blocked() {
		return this.blocked;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("blocked");
		generator.write(this.blocked);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesBlockStatus}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndicesBlockStatus> {
		private String name;

		private Boolean blocked;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code blocked}
		 */
		public final Builder blocked(boolean value) {
			this.blocked = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesBlockStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesBlockStatus build() {
			_checkSingleUse();

			return new IndicesBlockStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesBlockStatus}
	 */
	public static final JsonpDeserializer<IndicesBlockStatus> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndicesBlockStatus::setupIndicesBlockStatusDeserializer);

	protected static void setupIndicesBlockStatusDeserializer(ObjectDeserializer<IndicesBlockStatus.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::blocked, JsonpDeserializer.booleanDeserializer(), "blocked");

	}

}
