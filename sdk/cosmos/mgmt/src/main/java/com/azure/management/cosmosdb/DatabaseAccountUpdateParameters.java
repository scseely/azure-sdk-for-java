// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The DatabaseAccountUpdateParameters model.
 */
@JsonFlatten
@Fluent
public class DatabaseAccountUpdateParameters {
    /*
     * Tags are a list of key-value pairs that describe the resource. These
     * tags can be used in viewing and grouping this resource (across resource
     * groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key no greater than 128 characters and value no greater than
     * 256 characters. For example, the default experience for a template type
     * is set with "defaultExperience": "Cassandra". Current
     * "defaultExperience" values also include "Table", "Graph", "DocumentDB",
     * and "MongoDB".
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The location of the resource group to which the resource belongs.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The consistency policy for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.consistencyPolicy")
    private ConsistencyPolicy consistencyPolicy;

    /*
     * An array that contains the georeplication locations enabled for the
     * Cosmos DB account.
     */
    @JsonProperty(value = "properties.locations")
    private List<Location> locations;

    /*
     * Cosmos DB Firewall Support: This value specifies the set of IP addresses
     * or IP address ranges in CIDR form to be included as the allowed list of
     * client IPs for a given database account. IP addresses/ranges must be
     * comma separated and must not contain any spaces.
     */
    @JsonProperty(value = "properties.ipRangeFilter")
    private String ipRangeFilter;

    /*
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     */
    @JsonProperty(value = "properties.isVirtualNetworkFilterEnabled")
    private Boolean isVirtualNetworkFilterEnabled;

    /*
     * Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will
     * result in a new write region for the account and is chosen based on the
     * failover priorities configured for the account.
     */
    @JsonProperty(value = "properties.enableAutomaticFailover")
    private Boolean enableAutomaticFailover;

    /*
     * List of Cosmos DB capabilities for the account
     */
    @JsonProperty(value = "properties.capabilities")
    private List<Capability> capabilities;

    /*
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /*
     * Enables the account to write in multiple locations
     */
    @JsonProperty(value = "properties.enableMultipleWriteLocations")
    private Boolean enableMultipleWriteLocations;

    /*
     * Enables the cassandra connector on the Cosmos DB C* account
     */
    @JsonProperty(value = "properties.enableCassandraConnector")
    private Boolean enableCassandraConnector;

    /*
     * The cassandra connector offer type for the Cosmos DB database C*
     * account.
     */
    @JsonProperty(value = "properties.connectorOffer")
    private String connectorOffer;

    /*
     * Disable write operations on metadata resources (databases, containers,
     * throughput) via account keys
     */
    @JsonProperty(value = "properties.disableKeyBasedMetadataWriteAccess")
    private Boolean disableKeyBasedMetadataWriteAccess;

    /**
     * Creates an instance of DatabaseAccountUpdateParameters class.
     */
    public DatabaseAccountUpdateParameters() {
        connectorOffer = "Small";
    }

    /**
     * Get the tags property: Tags are a list of key-value pairs that describe
     * the resource. These tags can be used in viewing and grouping this
     * resource (across resource groups). A maximum of 15 tags can be provided
     * for a resource. Each tag must have a key no greater than 128 characters
     * and value no greater than 256 characters. For example, the default
     * experience for a template type is set with "defaultExperience":
     * "Cassandra". Current "defaultExperience" values also include "Table",
     * "Graph", "DocumentDB", and "MongoDB".
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags are a list of key-value pairs that describe
     * the resource. These tags can be used in viewing and grouping this
     * resource (across resource groups). A maximum of 15 tags can be provided
     * for a resource. Each tag must have a key no greater than 128 characters
     * and value no greater than 256 characters. For example, the default
     * experience for a template type is set with "defaultExperience":
     * "Cassandra". Current "defaultExperience" values also include "Table",
     * "Graph", "DocumentDB", and "MongoDB".
     * 
     * @param tags the tags value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the location property: The location of the resource group to which
     * the resource belongs.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the resource group to which
     * the resource belongs.
     * 
     * @param location the location value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the consistencyPolicy property: The consistency policy for the
     * Cosmos DB account.
     * 
     * @return the consistencyPolicy value.
     */
    public ConsistencyPolicy consistencyPolicy() {
        return this.consistencyPolicy;
    }

    /**
     * Set the consistencyPolicy property: The consistency policy for the
     * Cosmos DB account.
     * 
     * @param consistencyPolicy the consistencyPolicy value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        this.consistencyPolicy = consistencyPolicy;
        return this;
    }

    /**
     * Get the locations property: An array that contains the georeplication
     * locations enabled for the Cosmos DB account.
     * 
     * @return the locations value.
     */
    public List<Location> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: An array that contains the georeplication
     * locations enabled for the Cosmos DB account.
     * 
     * @param locations the locations value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the ipRangeFilter property: Cosmos DB Firewall Support: This value
     * specifies the set of IP addresses or IP address ranges in CIDR form to
     * be included as the allowed list of client IPs for a given database
     * account. IP addresses/ranges must be comma separated and must not
     * contain any spaces.
     * 
     * @return the ipRangeFilter value.
     */
    public String ipRangeFilter() {
        return this.ipRangeFilter;
    }

    /**
     * Set the ipRangeFilter property: Cosmos DB Firewall Support: This value
     * specifies the set of IP addresses or IP address ranges in CIDR form to
     * be included as the allowed list of client IPs for a given database
     * account. IP addresses/ranges must be comma separated and must not
     * contain any spaces.
     * 
     * @param ipRangeFilter the ipRangeFilter value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withIpRangeFilter(String ipRangeFilter) {
        this.ipRangeFilter = ipRangeFilter;
        return this;
    }

    /**
     * Get the isVirtualNetworkFilterEnabled property: Flag to indicate whether
     * to enable/disable Virtual Network ACL rules.
     * 
     * @return the isVirtualNetworkFilterEnabled value.
     */
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled;
    }

    /**
     * Set the isVirtualNetworkFilterEnabled property: Flag to indicate whether
     * to enable/disable Virtual Network ACL rules.
     * 
     * @param isVirtualNetworkFilterEnabled the isVirtualNetworkFilterEnabled
     * value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        return this;
    }

    /**
     * Get the enableAutomaticFailover property: Enables automatic failover of
     * the write region in the rare event that the region is unavailable due to
     * an outage. Automatic failover will result in a new write region for the
     * account and is chosen based on the failover priorities configured for
     * the account.
     * 
     * @return the enableAutomaticFailover value.
     */
    public Boolean enableAutomaticFailover() {
        return this.enableAutomaticFailover;
    }

    /**
     * Set the enableAutomaticFailover property: Enables automatic failover of
     * the write region in the rare event that the region is unavailable due to
     * an outage. Automatic failover will result in a new write region for the
     * account and is chosen based on the failover priorities configured for
     * the account.
     * 
     * @param enableAutomaticFailover the enableAutomaticFailover value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        this.enableAutomaticFailover = enableAutomaticFailover;
        return this;
    }

    /**
     * Get the capabilities property: List of Cosmos DB capabilities for the
     * account.
     * 
     * @return the capabilities value.
     */
    public List<Capability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: List of Cosmos DB capabilities for the
     * account.
     * 
     * @param capabilities the capabilities value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withCapabilities(List<Capability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the virtualNetworkRules property: List of Virtual Network ACL rules
     * configured for the Cosmos DB account.
     * 
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: List of Virtual Network ACL rules
     * configured for the Cosmos DB account.
     * 
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the enableMultipleWriteLocations property: Enables the account to
     * write in multiple locations.
     * 
     * @return the enableMultipleWriteLocations value.
     */
    public Boolean enableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations;
    }

    /**
     * Set the enableMultipleWriteLocations property: Enables the account to
     * write in multiple locations.
     * 
     * @param enableMultipleWriteLocations the enableMultipleWriteLocations
     * value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations) {
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        return this;
    }

    /**
     * Get the enableCassandraConnector property: Enables the cassandra
     * connector on the Cosmos DB C* account.
     * 
     * @return the enableCassandraConnector value.
     */
    public Boolean enableCassandraConnector() {
        return this.enableCassandraConnector;
    }

    /**
     * Set the enableCassandraConnector property: Enables the cassandra
     * connector on the Cosmos DB C* account.
     * 
     * @param enableCassandraConnector the enableCassandraConnector value to
     * set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableCassandraConnector(Boolean enableCassandraConnector) {
        this.enableCassandraConnector = enableCassandraConnector;
        return this;
    }

    /**
     * Get the connectorOffer property: The cassandra connector offer type for
     * the Cosmos DB database C* account.
     * 
     * @return the connectorOffer value.
     */
    public String connectorOffer() {
        return this.connectorOffer;
    }

    /**
     * Set the connectorOffer property: The cassandra connector offer type for
     * the Cosmos DB database C* account.
     * 
     * @param connectorOffer the connectorOffer value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withConnectorOffer(String connectorOffer) {
        this.connectorOffer = connectorOffer;
        return this;
    }

    /**
     * Get the disableKeyBasedMetadataWriteAccess property: Disable write
     * operations on metadata resources (databases, containers, throughput) via
     * account keys.
     * 
     * @return the disableKeyBasedMetadataWriteAccess value.
     */
    public Boolean disableKeyBasedMetadataWriteAccess() {
        return this.disableKeyBasedMetadataWriteAccess;
    }

    /**
     * Set the disableKeyBasedMetadataWriteAccess property: Disable write
     * operations on metadata resources (databases, containers, throughput) via
     * account keys.
     * 
     * @param disableKeyBasedMetadataWriteAccess the
     * disableKeyBasedMetadataWriteAccess value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withDisableKeyBasedMetadataWriteAccess(Boolean disableKeyBasedMetadataWriteAccess) {
        this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
        return this;
    }
}
