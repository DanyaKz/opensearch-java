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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.InlineGet;
import co.elastic.clients.elasticsearch.core.explain.ExplanationDetail;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.NamedDeserializer;
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
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.explain.Response
@JsonpDeserializable
public class ExplainResponse<TDocument> implements JsonpSerializable {
	private final String index;

	@Nullable
	private final String type;

	private final String id;

	private final boolean matched;

	@Nullable
	private final ExplanationDetail explanation;

	@Nullable
	private final InlineGet<TDocument> get;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private ExplainResponse(Builder<TDocument> builder) {

		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.type = builder.type;
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.matched = ModelTypeHelper.requireNonNull(builder.matched, this, "matched");
		this.explanation = builder.explanation;
		this.get = builder.get;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> ExplainResponse<TDocument> of(Consumer<Builder<TDocument>> fn) {
		Builder<TDocument> builder = new Builder<>();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code matched}
	 */
	public final boolean matched() {
		return this.matched;
	}

	/**
	 * API name: {@code explanation}
	 */
	@Nullable
	public final ExplanationDetail explanation() {
		return this.explanation;
	}

	/**
	 * API name: {@code get}
	 */
	@Nullable
	public final InlineGet<TDocument> get() {
		return this.get;
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

		generator.writeKey("_index");
		generator.write(this.index);

		if (this.type != null) {
			generator.writeKey("_type");
			generator.write(this.type);

		}
		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("matched");
		generator.write(this.matched);

		if (this.explanation != null) {
			generator.writeKey("explanation");
			this.explanation.serialize(generator, mapper);

		}
		if (this.get != null) {
			generator.writeKey("get");
			this.get.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainResponse}.
	 */
	public static class Builder<TDocument> extends ObjectBuilderBase
			implements
				ObjectBuilder<ExplainResponse<TDocument>> {
		private String index;

		@Nullable
		private String type;

		private String id;

		private Boolean matched;

		@Nullable
		private ExplanationDetail explanation;

		@Nullable
		private InlineGet<TDocument> get;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code _index}
		 */
		public final Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code _type}
		 */
		public final Builder<TDocument> type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder<TDocument> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code matched}
		 */
		public final Builder<TDocument> matched(boolean value) {
			this.matched = value;
			return this;
		}

		/**
		 * API name: {@code explanation}
		 */
		public final Builder<TDocument> explanation(@Nullable ExplanationDetail value) {
			this.explanation = value;
			return this;
		}

		/**
		 * API name: {@code explanation}
		 */
		public final Builder<TDocument> explanation(Consumer<ExplanationDetail.Builder> fn) {
			ExplanationDetail.Builder builder = new ExplanationDetail.Builder();
			fn.accept(builder);
			return this.explanation(builder.build());
		}

		/**
		 * API name: {@code get}
		 */
		public final Builder<TDocument> get(@Nullable InlineGet<TDocument> value) {
			this.get = value;
			return this;
		}

		/**
		 * API name: {@code get}
		 */
		public final Builder<TDocument> get(Consumer<InlineGet.Builder<TDocument>> fn) {
			InlineGet.Builder<TDocument> builder = new InlineGet.Builder<TDocument>();
			fn.accept(builder);
			return this.get(builder.build());
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link ExplainResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplainResponse<TDocument> build() {
			_checkSingleUse();

			return new ExplainResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for ExplainResponse
	 */
	public static <TDocument> JsonpDeserializer<ExplainResponse<TDocument>> createExplainResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> ExplainResponse.setupExplainResponseDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link ExplainResponse} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<ExplainResponse<Object>> _DESERIALIZER = createExplainResponseDeserializer(
			new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.explain.TDocument"));

	protected static <TDocument> void setupExplainResponseDeserializer(
			ObjectDeserializer<ExplainResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::matched, JsonpDeserializer.booleanDeserializer(), "matched");
		op.add(Builder::explanation, ExplanationDetail._DESERIALIZER, "explanation");
		op.add(Builder::get, InlineGet.createInlineGetDeserializer(tDocumentDeserializer), "get");

	}

}
