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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TotalFeatureImportance
@JsonpDeserializable
public class TotalFeatureImportance implements JsonpSerializable {
	private final String featureName;

	private final List<TotalFeatureImportanceStatistics> importance;

	private final List<TotalFeatureImportanceClass> classes;

	// ---------------------------------------------------------------------------------------------

	private TotalFeatureImportance(Builder builder) {

		this.featureName = ModelTypeHelper.requireNonNull(builder.featureName, this, "featureName");
		this.importance = ModelTypeHelper.unmodifiableRequired(builder.importance, this, "importance");
		this.classes = ModelTypeHelper.unmodifiableRequired(builder.classes, this, "classes");

	}

	public static TotalFeatureImportance of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - The feature for which this importance was calculated.
	 * <p>
	 * API name: {@code feature_name}
	 */
	public final String featureName() {
		return this.featureName;
	}

	/**
	 * Required - A collection of feature importance statistics related to the
	 * training data set for this particular feature.
	 * <p>
	 * API name: {@code importance}
	 */
	public final List<TotalFeatureImportanceStatistics> importance() {
		return this.importance;
	}

	/**
	 * Required - If the trained model is a classification model, feature importance
	 * statistics are gathered per target class value.
	 * <p>
	 * API name: {@code classes}
	 */
	public final List<TotalFeatureImportanceClass> classes() {
		return this.classes;
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

		generator.writeKey("feature_name");
		generator.write(this.featureName);

		if (ModelTypeHelper.isDefined(this.importance)) {
			generator.writeKey("importance");
			generator.writeStartArray();
			for (TotalFeatureImportanceStatistics item0 : this.importance) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.classes)) {
			generator.writeKey("classes");
			generator.writeStartArray();
			for (TotalFeatureImportanceClass item0 : this.classes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TotalFeatureImportance}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TotalFeatureImportance> {
		private String featureName;

		private List<TotalFeatureImportanceStatistics> importance;

		private List<TotalFeatureImportanceClass> classes;

		/**
		 * Required - The feature for which this importance was calculated.
		 * <p>
		 * API name: {@code feature_name}
		 */
		public final Builder featureName(String value) {
			this.featureName = value;
			return this;
		}

		/**
		 * Required - A collection of feature importance statistics related to the
		 * training data set for this particular feature.
		 * <p>
		 * API name: {@code importance}
		 */
		public final Builder importance(List<TotalFeatureImportanceStatistics> value) {
			this.importance = value;
			return this;
		}

		/**
		 * Required - A collection of feature importance statistics related to the
		 * training data set for this particular feature.
		 * <p>
		 * API name: {@code importance}
		 */
		public final Builder importance(TotalFeatureImportanceStatistics... value) {
			this.importance = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - A collection of feature importance statistics related to the
		 * training data set for this particular feature.
		 * <p>
		 * API name: {@code importance}
		 */
		public final Builder importance(
				Function<ListBuilder<TotalFeatureImportanceStatistics, TotalFeatureImportanceStatistics.Builder>, ObjectBuilder<List<TotalFeatureImportanceStatistics>>> fn) {
			return importance(fn.apply(new ListBuilder<>(TotalFeatureImportanceStatistics.Builder::new)).build());
		}

		/**
		 * Required - If the trained model is a classification model, feature importance
		 * statistics are gathered per target class value.
		 * <p>
		 * API name: {@code classes}
		 */
		public final Builder classes(List<TotalFeatureImportanceClass> value) {
			this.classes = value;
			return this;
		}

		/**
		 * Required - If the trained model is a classification model, feature importance
		 * statistics are gathered per target class value.
		 * <p>
		 * API name: {@code classes}
		 */
		public final Builder classes(TotalFeatureImportanceClass... value) {
			this.classes = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - If the trained model is a classification model, feature importance
		 * statistics are gathered per target class value.
		 * <p>
		 * API name: {@code classes}
		 */
		public final Builder classes(
				Function<ListBuilder<TotalFeatureImportanceClass, TotalFeatureImportanceClass.Builder>, ObjectBuilder<List<TotalFeatureImportanceClass>>> fn) {
			return classes(fn.apply(new ListBuilder<>(TotalFeatureImportanceClass.Builder::new)).build());
		}

		/**
		 * Builds a {@link TotalFeatureImportance}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TotalFeatureImportance build() {
			_checkSingleUse();

			return new TotalFeatureImportance(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TotalFeatureImportance}
	 */
	public static final JsonpDeserializer<TotalFeatureImportance> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TotalFeatureImportance::setupTotalFeatureImportanceDeserializer);

	protected static void setupTotalFeatureImportanceDeserializer(
			ObjectDeserializer<TotalFeatureImportance.Builder> op) {

		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::importance, JsonpDeserializer.arrayDeserializer(TotalFeatureImportanceStatistics._DESERIALIZER),
				"importance");
		op.add(Builder::classes, JsonpDeserializer.arrayDeserializer(TotalFeatureImportanceClass._DESERIALIZER),
				"classes");

	}

}
