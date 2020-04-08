// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ContainerCpuStatistics model.
 */
@Fluent
public final class ContainerCpuStatistics {
    /*
     * The cpuUsage property.
     */
    @JsonProperty(value = "cpuUsage")
    private ContainerCpuUsage cpuUsage;

    /*
     * The systemCpuUsage property.
     */
    @JsonProperty(value = "systemCpuUsage")
    private Long systemCpuUsage;

    /*
     * The onlineCpuCount property.
     */
    @JsonProperty(value = "onlineCpuCount")
    private Integer onlineCpuCount;

    /*
     * The throttlingData property.
     */
    @JsonProperty(value = "throttlingData")
    private ContainerThrottlingData throttlingData;

    /**
     * Get the cpuUsage property: The cpuUsage property.
     * 
     * @return the cpuUsage value.
     */
    public ContainerCpuUsage cpuUsage() {
        return this.cpuUsage;
    }

    /**
     * Set the cpuUsage property: The cpuUsage property.
     * 
     * @param cpuUsage the cpuUsage value to set.
     * @return the ContainerCpuStatistics object itself.
     */
    public ContainerCpuStatistics withCpuUsage(ContainerCpuUsage cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * Get the systemCpuUsage property: The systemCpuUsage property.
     * 
     * @return the systemCpuUsage value.
     */
    public Long systemCpuUsage() {
        return this.systemCpuUsage;
    }

    /**
     * Set the systemCpuUsage property: The systemCpuUsage property.
     * 
     * @param systemCpuUsage the systemCpuUsage value to set.
     * @return the ContainerCpuStatistics object itself.
     */
    public ContainerCpuStatistics withSystemCpuUsage(Long systemCpuUsage) {
        this.systemCpuUsage = systemCpuUsage;
        return this;
    }

    /**
     * Get the onlineCpuCount property: The onlineCpuCount property.
     * 
     * @return the onlineCpuCount value.
     */
    public Integer onlineCpuCount() {
        return this.onlineCpuCount;
    }

    /**
     * Set the onlineCpuCount property: The onlineCpuCount property.
     * 
     * @param onlineCpuCount the onlineCpuCount value to set.
     * @return the ContainerCpuStatistics object itself.
     */
    public ContainerCpuStatistics withOnlineCpuCount(Integer onlineCpuCount) {
        this.onlineCpuCount = onlineCpuCount;
        return this;
    }

    /**
     * Get the throttlingData property: The throttlingData property.
     * 
     * @return the throttlingData value.
     */
    public ContainerThrottlingData throttlingData() {
        return this.throttlingData;
    }

    /**
     * Set the throttlingData property: The throttlingData property.
     * 
     * @param throttlingData the throttlingData value to set.
     * @return the ContainerCpuStatistics object itself.
     */
    public ContainerCpuStatistics withThrottlingData(ContainerThrottlingData throttlingData) {
        this.throttlingData = throttlingData;
        return this;
    }
}
