/*
Copyright (c) Microsoft Open Technologies, Inc.
All Rights Reserved
Apache 2.0 License
 
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
 
     http://www.apache.org/licenses/LICENSE-2.0
 
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 
See the Apache Version 2.0 License for specific language governing permissions and limitations under the License.
 */

/**
 * QueryNode.java
 */
package com.microsoft.windowsazure.mobileservices.table.query;

/**
 * Interface of a query node used to represent a row filter expression.
 */
public interface QueryNode {
    /**
     * Deep clone the QueryNode instance
     *
     * @return A cloned instance of the QueryNode
     */
    QueryNode deepClone();

    /**
     * Gets the kind of the query node.
     */
    QueryNodeKind getKind();

    /**
     * Accept a MobileServiceQueryNodeVisitor that walks a tree of QueryNode.
     *
     * @param visitor An implementation of the visitor interface.
     * @return An object whose type is determined by the type parameter of the
     * visitor.
     */
    <T> T accept(QueryNodeVisitor<T> visitor);
}
