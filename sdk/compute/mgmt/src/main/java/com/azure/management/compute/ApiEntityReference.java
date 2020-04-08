// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ApiEntityReference model.
 */
@Fluent
public final class ApiEntityReference {
    /*
     * The ARM resource id in the form of
     * /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/...
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The ARM resource id in the form of
     * /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/...
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The ARM resource id in the form of
     * /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/...
     * 
     * @param id the id value to set.
     * @return the ApiEntityReference object itself.
     */
    public ApiEntityReference withId(String id) {
        this.id = id;
        return this;
    }
}
