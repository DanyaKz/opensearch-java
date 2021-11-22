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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanFirstQuery
@JsonpDeserializable
public class SpanFirstQuery extends QueryBase implements SpanQueryVariant, QueryVariant {
	private final int end;

	private final SpanQuery match;

	// ---------------------------------------------------------------------------------------------

	private SpanFirstQuery(Builder builder) {
		super(builder);

		this.end = ModelTypeHelper.requireNonNull(builder.end, this, "end");
		this.match = ModelTypeHelper.requireNonNull(builder.match, this, "match");

	}

	public static SpanFirstQuery of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * SpanQuery variant kind.
	 */
	@Override
	public SpanQuery.Kind _spanQueryKind() {
		return SpanQuery.Kind.SpanFirst;
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.SpanFirst;
	}

	/**
	 * Required - API name: {@code end}
	 */
	public final int end() {
		return this.end;
	}

	/**
	 * Required - API name: {@code match}
	 */
	public final SpanQuery match() {
		return this.match;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("end");
		generator.write(this.end);

		generator.writeKey("match");
		this.match.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanFirstQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanFirstQuery> {
		private Integer end;

		private SpanQuery match;

		/**
		 * Required - API name: {@code end}
		 */
		public final Builder end(int value) {
			this.end = value;
			return this;
		}

		/**
		 * Required - API name: {@code match}
		 */
		public final Builder match(SpanQuery value) {
			this.match = value;
			return this;
		}

		/**
		 * Required - API name: {@code match}
		 */
		public final Builder match(Consumer<SpanQuery.Builder> fn) {
			SpanQuery.Builder builder = new SpanQuery.Builder();
			fn.accept(builder);
			return this.match(builder.build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanFirstQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanFirstQuery build() {
			_checkSingleUse();

			return new SpanFirstQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SpanFirstQuery}
	 */
	public static final JsonpDeserializer<SpanFirstQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SpanFirstQuery::setupSpanFirstQueryDeserializer);

	protected static void setupSpanFirstQueryDeserializer(ObjectDeserializer<SpanFirstQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::end, JsonpDeserializer.integerDeserializer(), "end");
		op.add(Builder::match, SpanQuery._DESERIALIZER, "match");

	}

}
