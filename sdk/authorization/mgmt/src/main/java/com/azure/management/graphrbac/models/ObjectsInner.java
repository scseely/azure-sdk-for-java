// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.management.graphrbac.GetObjectsParameters;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Objects.
 */
public final class ObjectsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ObjectsService service;

    /**
     * The service client containing this operation class.
     */
    private GraphRbacManagementClientImpl client;

    /**
     * Initializes an instance of ObjectsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ObjectsInner(GraphRbacManagementClientImpl client) {
        this.service = RestProxy.create(ObjectsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * GraphRbacManagementClientObjects to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GraphRbacManagementClientObjects")
    private interface ObjectsService {
        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Post("/{tenantID}/getObjectsByObjectIds")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DirectoryObjectListResultInner>> getObjectsByObjectIds(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, @BodyParam("application/json") GetObjectsParameters parameters, Context context);

        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Post("/{tenantID}/{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DirectoryObjectListResultInner>> getObjectsByObjectIdsNext(@HostParam("$host") String host, @PathParam(value = "nextLink", encoded = true) String nextLink, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, Context context);
    }

    /**
     * Gets the directory objects specified in a list of object IDs. You can also specify which resource collections (users, groups, etc.) should be searched by specifying the optional types parameter.
     * 
     * @param parameters Request parameters for the GetObjectsByObjectIds API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DirectoryObjectInner>> getObjectsByObjectIdsSinglePageAsync(GetObjectsParameters parameters) {
        return FluxUtil.withContext(context -> service.getObjectsByObjectIds(this.client.getHost(), this.client.getApiVersion(), this.client.getTenantID(), parameters, context))
            .<PagedResponse<DirectoryObjectInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().odataNextLink(),
                null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the directory objects specified in a list of object IDs. You can also specify which resource collections (users, groups, etc.) should be searched by specifying the optional types parameter.
     * 
     * @param parameters Request parameters for the GetObjectsByObjectIds API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DirectoryObjectInner> getObjectsByObjectIdsAsync(GetObjectsParameters parameters) {
        return new PagedFlux<>(
            () -> getObjectsByObjectIdsSinglePageAsync(parameters),
            nextLink -> getObjectsByObjectIdsNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the directory objects specified in a list of object IDs. You can also specify which resource collections (users, groups, etc.) should be searched by specifying the optional types parameter.
     * 
     * @param parameters Request parameters for the GetObjectsByObjectIds API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DirectoryObjectInner> getObjectsByObjectIds(GetObjectsParameters parameters) {
        return new PagedIterable<>(getObjectsByObjectIdsAsync(parameters));
    }

    /**
     * Gets AD group membership for the specified AD object IDs.
     * 
     * @param nextLink Next link for the list operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DirectoryObjectInner>> getObjectsByObjectIdsNextSinglePageAsync(String nextLink) {
        return FluxUtil.withContext(context -> service.getObjectsByObjectIdsNext(this.client.getHost(), nextLink, this.client.getApiVersion(), this.client.getTenantID(), context))
            .<PagedResponse<DirectoryObjectInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().odataNextLink(),
                null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}
