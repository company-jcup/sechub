/*
 * SecHub API
 * SecHub API description
 *
 * The version of the OpenAPI document: 0.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.mercedesbenz.sechub.api.internal.gen.model;

import java.io.Serializable;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * entry point
 */
@JsonPropertyOrder({ OpenApiFalsePositivesFalsePositivesInnerMetaDataCodeStart.JSON_PROPERTY_SOURCE_CODE,
        OpenApiFalsePositivesFalsePositivesInnerMetaDataCodeStart.JSON_PROPERTY_RELEVANT_PART,
        OpenApiFalsePositivesFalsePositivesInnerMetaDataCodeStart.JSON_PROPERTY_LOCATION })

public class OpenApiFalsePositivesFalsePositivesInnerMetaDataCodeStart implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_SOURCE_CODE = "sourceCode";
    private String sourceCode;

    public static final String JSON_PROPERTY_RELEVANT_PART = "relevantPart";
    private String relevantPart;

    public static final String JSON_PROPERTY_LOCATION = "location";
    private String location;

    public OpenApiFalsePositivesFalsePositivesInnerMetaDataCodeStart() {
    }

    public OpenApiFalsePositivesFalsePositivesInnerMetaDataCodeStart sourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }

    /**
     * source code
     *
     * @return sourceCode
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SOURCE_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getSourceCode() {
        return sourceCode;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public OpenApiFalsePositivesFalsePositivesInnerMetaDataCodeStart relevantPart(String relevantPart) {
        this.relevantPart = relevantPart;
        return this;
    }

    /**
     * relevant part of source vulnerability
     *
     * @return relevantPart
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_RELEVANT_PART)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getRelevantPart() {
        return relevantPart;
    }

    @JsonProperty(JSON_PROPERTY_RELEVANT_PART)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRelevantPart(String relevantPart) {
        this.relevantPart = relevantPart;
    }

    public OpenApiFalsePositivesFalsePositivesInnerMetaDataCodeStart location(String location) {
        this.location = location;
        return this;
    }

    /**
     * location of code
     *
     * @return location
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_LOCATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getLocation() {
        return location;
    }

    @JsonProperty(JSON_PROPERTY_LOCATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Return true if this FalsePositives_falsePositives_inner_metaData_code_start
     * object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenApiFalsePositivesFalsePositivesInnerMetaDataCodeStart falsePositivesFalsePositivesInnerMetaDataCodeStart = (OpenApiFalsePositivesFalsePositivesInnerMetaDataCodeStart) o;
        return Objects.equals(sourceCode, falsePositivesFalsePositivesInnerMetaDataCodeStart.sourceCode)
                && Objects.equals(relevantPart, falsePositivesFalsePositivesInnerMetaDataCodeStart.relevantPart)
                && Objects.equals(location, falsePositivesFalsePositivesInnerMetaDataCodeStart.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceCode, relevantPart, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenApiFalsePositivesFalsePositivesInnerMetaDataCodeStart {\n");
        sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
        sb.append("    relevantPart: ").append(toIndentedString(relevantPart)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @return URL query string
     */
    public String toUrlQueryString() {
        return toUrlQueryString(null);
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        String suffix = "";
        String containerSuffix = "";
        String containerPrefix = "";
        if (prefix == null) {
            // style=form, explode=true, e.g. /pet?name=cat&type=manx
            prefix = "";
        } else {
            // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
            prefix = prefix + "[";
            suffix = "]";
            containerSuffix = "]";
            containerPrefix = "[";
        }

        StringJoiner joiner = new StringJoiner("&");

        // add `sourceCode` to the URL query string
        if (getSourceCode() != null) {
            joiner.add(String.format("%ssourceCode%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getSourceCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `relevantPart` to the URL query string
        if (getRelevantPart() != null) {
            joiner.add(String.format("%srelevantPart%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getRelevantPart()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `location` to the URL query string
        if (getLocation() != null) {
            joiner.add(String.format("%slocation%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getLocation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
