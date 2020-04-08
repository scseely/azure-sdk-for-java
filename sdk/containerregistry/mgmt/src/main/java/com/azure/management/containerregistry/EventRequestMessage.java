// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The EventRequestMessage model.
 */
@Fluent
public final class EventRequestMessage {
    /*
     * The content of the event request message.
     */
    @JsonProperty(value = "content")
    private EventContent content;

    /*
     * The headers of the event request message.
     */
    @JsonProperty(value = "headers")
    private Map<String, String> headers;

    /*
     * The HTTP method used to send the event request message.
     */
    @JsonProperty(value = "method")
    private String method;

    /*
     * The URI used to send the event request message.
     */
    @JsonProperty(value = "requestUri")
    private String requestUri;

    /*
     * The HTTP message version.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the content property: The content of the event request message.
     * 
     * @return the content value.
     */
    public EventContent content() {
        return this.content;
    }

    /**
     * Set the content property: The content of the event request message.
     * 
     * @param content the content value to set.
     * @return the EventRequestMessage object itself.
     */
    public EventRequestMessage withContent(EventContent content) {
        this.content = content;
        return this;
    }

    /**
     * Get the headers property: The headers of the event request message.
     * 
     * @return the headers value.
     */
    public Map<String, String> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: The headers of the event request message.
     * 
     * @param headers the headers value to set.
     * @return the EventRequestMessage object itself.
     */
    public EventRequestMessage withHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the method property: The HTTP method used to send the event request
     * message.
     * 
     * @return the method value.
     */
    public String method() {
        return this.method;
    }

    /**
     * Set the method property: The HTTP method used to send the event request
     * message.
     * 
     * @param method the method value to set.
     * @return the EventRequestMessage object itself.
     */
    public EventRequestMessage withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Get the requestUri property: The URI used to send the event request
     * message.
     * 
     * @return the requestUri value.
     */
    public String requestUri() {
        return this.requestUri;
    }

    /**
     * Set the requestUri property: The URI used to send the event request
     * message.
     * 
     * @param requestUri the requestUri value to set.
     * @return the EventRequestMessage object itself.
     */
    public EventRequestMessage withRequestUri(String requestUri) {
        this.requestUri = requestUri;
        return this;
    }

    /**
     * Get the version property: The HTTP message version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The HTTP message version.
     * 
     * @param version the version value to set.
     * @return the EventRequestMessage object itself.
     */
    public EventRequestMessage withVersion(String version) {
        this.version = version;
        return this;
    }
}
