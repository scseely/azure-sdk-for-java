/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RetryPolicy model.
 */
public class RetryPolicy {
    /**
     * Gets or sets the retry strategy to be used. Possible values include:
     * 'None', 'Fixed'.
     */
    @JsonProperty(value = "retryType")
    private RetryType retryType;

    /**
     * Gets or sets the retry interval between retries, specify duration in ISO
     * 8601 format.
     */
    @JsonProperty(value = "retryInterval")
    private Period retryInterval;

    /**
     * Gets or sets the number of times a retry should be attempted.
     */
    @JsonProperty(value = "retryCount")
    private Integer retryCount;

    /**
     * Get the retryType value.
     *
     * @return the retryType value
     */
    public RetryType retryType() {
        return this.retryType;
    }

    /**
     * Set the retryType value.
     *
     * @param retryType the retryType value to set
     * @return the RetryPolicy object itself.
     */
    public RetryPolicy withRetryType(RetryType retryType) {
        this.retryType = retryType;
        return this;
    }

    /**
     * Get the retryInterval value.
     *
     * @return the retryInterval value
     */
    public Period retryInterval() {
        return this.retryInterval;
    }

    /**
     * Set the retryInterval value.
     *
     * @param retryInterval the retryInterval value to set
     * @return the RetryPolicy object itself.
     */
    public RetryPolicy withRetryInterval(Period retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }

    /**
     * Get the retryCount value.
     *
     * @return the retryCount value
     */
    public Integer retryCount() {
        return this.retryCount;
    }

    /**
     * Set the retryCount value.
     *
     * @param retryCount the retryCount value to set
     * @return the RetryPolicy object itself.
     */
    public RetryPolicy withRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }

}