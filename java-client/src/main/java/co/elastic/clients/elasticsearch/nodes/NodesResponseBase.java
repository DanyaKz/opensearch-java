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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch._types.NodeStatistics;
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
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: nodes._types.NodesResponseBase

public abstract class NodesResponseBase implements JsonpSerializable {
	private final NodeStatistics nodeStats;

	// ---------------------------------------------------------------------------------------------

	protected NodesResponseBase(AbstractBuilder<?> builder) {

		this.nodeStats = ModelTypeHelper.requireNonNull(builder.nodeStats, this, "nodeStats");

	}

	/**
	 * Required - Contains statistics about the number of nodes selected by the
	 * request’s node filters.
	 * <p>
	 * API name: {@code _nodes}
	 */
	public final NodeStatistics nodeStats() {
		return this.nodeStats;
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

		generator.writeKey("_nodes");
		this.nodeStats.serialize(generator, mapper);

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ObjectBuilderBase {
		private NodeStatistics nodeStats;

		/**
		 * Required - Contains statistics about the number of nodes selected by the
		 * request’s node filters.
		 * <p>
		 * API name: {@code _nodes}
		 */
		public final BuilderT nodeStats(NodeStatistics value) {
			this.nodeStats = value;
			return self();
		}

		/**
		 * Required - Contains statistics about the number of nodes selected by the
		 * request’s node filters.
		 * <p>
		 * API name: {@code _nodes}
		 */
		public final BuilderT nodeStats(Consumer<NodeStatistics.Builder> fn) {
			NodeStatistics.Builder builder = new NodeStatistics.Builder();
			fn.accept(builder);
			return this.nodeStats(builder.build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupNodesResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::nodeStats, NodeStatistics._DESERIALIZER, "_nodes");

	}

}
