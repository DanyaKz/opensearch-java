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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ml.get_job_stats.Request

public class GetJobStatsRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoJobs;

	@Nullable
	private final String jobId;

	// ---------------------------------------------------------------------------------------------

	private GetJobStatsRequest(Builder builder) {

		this.allowNoJobs = builder.allowNoJobs;
		this.jobId = builder.jobId;

	}

	public static GetJobStatsRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Specifies what to do when the request:
	 * <ol>
	 * <li>Contains wildcard expressions and there are no jobs that match.</li>
	 * <li>Contains the _all string or no identifiers and there are no matches.</li>
	 * <li>Contains wildcard expressions and there are only partial matches.</li>
	 * </ol>
	 * <p>
	 * The default value is <code>true</code>, which returns an empty
	 * <code>jobs</code> array when there are no matches and the subset of results
	 * when there are partial matches. If this parameter is <code>false</code>, the
	 * request returns a <code>404</code> status code when there are no matches or
	 * only partial matches.
	 * <p>
	 * API name: {@code allow_no_jobs}
	 */
	@Nullable
	public final Boolean allowNoJobs() {
		return this.allowNoJobs;
	}

	/**
	 * Identifier for the anomaly detection job. It can be a job identifier, a group
	 * name, a comma-separated list of jobs, or a wildcard expression. If you do not
	 * specify one of these options, the API returns information for all anomaly
	 * detection jobs.
	 * <p>
	 * API name: {@code job_id}
	 */
	@Nullable
	public final String jobId() {
		return this.jobId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetJobStatsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetJobStatsRequest> {
		@Nullable
		private Boolean allowNoJobs;

		@Nullable
		private String jobId;

		/**
		 * Specifies what to do when the request:
		 * <ol>
		 * <li>Contains wildcard expressions and there are no jobs that match.</li>
		 * <li>Contains the _all string or no identifiers and there are no matches.</li>
		 * <li>Contains wildcard expressions and there are only partial matches.</li>
		 * </ol>
		 * <p>
		 * The default value is <code>true</code>, which returns an empty
		 * <code>jobs</code> array when there are no matches and the subset of results
		 * when there are partial matches. If this parameter is <code>false</code>, the
		 * request returns a <code>404</code> status code when there are no matches or
		 * only partial matches.
		 * <p>
		 * API name: {@code allow_no_jobs}
		 */
		public final Builder allowNoJobs(@Nullable Boolean value) {
			this.allowNoJobs = value;
			return this;
		}

		/**
		 * Identifier for the anomaly detection job. It can be a job identifier, a group
		 * name, a comma-separated list of jobs, or a wildcard expression. If you do not
		 * specify one of these options, the API returns information for all anomaly
		 * detection jobs.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(@Nullable String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Builds a {@link GetJobStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetJobStatsRequest build() {
			_checkSingleUse();

			return new GetJobStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_job_stats}".
	 */
	public static final Endpoint<GetJobStatsRequest, GetJobStatsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= _jobId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/_stats");
					return buf.toString();
				}
				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/_stats");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoJobs != null) {
					params.put("allow_no_jobs", String.valueOf(request.allowNoJobs));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetJobStatsResponse._DESERIALIZER);
}
