// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ServerCommunicationLinkListResult model.
 */
@Fluent
public final class ServerCommunicationLinkListResultInner {
    /*
     * The list of server communication links.
     */
    @JsonProperty(value = "value")
    private List<ServerCommunicationLinkInner> value;

    /**
     * Get the value property: The list of server communication links.
     * 
     * @return the value value.
     */
    public List<ServerCommunicationLinkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of server communication links.
     * 
     * @param value the value value to set.
     * @return the ServerCommunicationLinkListResultInner object itself.
     */
    public ServerCommunicationLinkListResultInner withValue(List<ServerCommunicationLinkInner> value) {
        this.value = value;
        return this;
    }
}
