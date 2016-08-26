/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;


/**
 * Properties of the key backing a certificate.
 */
public class SecretProperties {
    /**
     * The media type (MIME type).
     */
    private String contentType;

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set
     * @return the SecretProperties object itself.
     */
    public SecretProperties withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

}
