/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.windowsazure.storage;

import com.microsoft.windowsazure.storage.core.BaseEvent;

/**
 * Represents an event that is fired when a response is received.
 */
public final class ResponseReceivedEvent extends BaseEvent {

    public ResponseReceivedEvent(OperationContext opContext, Object connectionObject, RequestResult requestResult) {
        super(opContext, connectionObject, requestResult);
    }

}
