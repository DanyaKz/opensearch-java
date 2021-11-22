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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _global.search._types.NestedSortValue
@JsonpDeserializable
public class NestedSortValue implements JsonpSerializable {
	@Nullable
	private final Query filter;

	@Nullable
	private final Integer maxChildren;

	@Nullable
	private final NestedSortValue nested;

	private final String path;

	// ---------------------------------------------------------------------------------------------

	private NestedSortValue(Builder builder) {

		this.filter = builder.filter;
		this.maxChildren = builder.maxChildren;
		this.nested = builder.nested;
		this.path = ModelTypeHelper.requireNonNull(builder.path, this, "path");

	}

	public static NestedSortValue of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public final Query filter() {
		return this.filter;
	}

	/**
	 * API name: {@code max_children}
	 */
	@Nullable
	public final Integer maxChildren() {
		return this.maxChildren;
	}

	/**
	 * API name: {@code nested}
	 */
	@Nullable
	public final NestedSortValue nested() {
		return this.nested;
	}

	/**
	 * Required - API name: {@code path}
	 */
	public final String path() {
		return this.path;
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

		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.maxChildren != null) {
			generator.writeKey("max_children");
			generator.write(this.maxChildren);

		}
		if (this.nested != null) {
			generator.writeKey("nested");
			this.nested.serialize(generator, mapper);

		}
		generator.writeKey("path");
		generator.write(this.path);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NestedSortValue}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NestedSortValue> {
		@Nullable
		private Query filter;

		@Nullable
		private Integer maxChildren;

		@Nullable
		private NestedSortValue nested;

		private String path;

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(Consumer<Query.Builder> fn) {
			Query.Builder builder = new Query.Builder();
			fn.accept(builder);
			return this.filter(builder.build());
		}

		/**
		 * API name: {@code max_children}
		 */
		public final Builder maxChildren(@Nullable Integer value) {
			this.maxChildren = value;
			return this;
		}

		/**
		 * API name: {@code nested}
		 */
		public final Builder nested(@Nullable NestedSortValue value) {
			this.nested = value;
			return this;
		}

		/**
		 * API name: {@code nested}
		 */
		public final Builder nested(Consumer<NestedSortValue.Builder> fn) {
			NestedSortValue.Builder builder = new NestedSortValue.Builder();
			fn.accept(builder);
			return this.nested(builder.build());
		}

		/**
		 * Required - API name: {@code path}
		 */
		public final Builder path(String value) {
			this.path = value;
			return this;
		}

		/**
		 * Builds a {@link NestedSortValue}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NestedSortValue build() {
			_checkSingleUse();

			return new NestedSortValue(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NestedSortValue}
	 */
	public static final JsonpDeserializer<NestedSortValue> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NestedSortValue::setupNestedSortValueDeserializer);

	protected static void setupNestedSortValueDeserializer(ObjectDeserializer<NestedSortValue.Builder> op) {

		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::maxChildren, JsonpDeserializer.integerDeserializer(), "max_children");
		op.add(Builder::nested, NestedSortValue._DESERIALIZER, "nested");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");

	}

}
