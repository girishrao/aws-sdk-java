/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the DAX cluster that you have created.
     * </p>
     */
    private Cluster cluster;

    /**
     * <p>
     * A description of the DAX cluster that you have created.
     * </p>
     * 
     * @param cluster
     *        A description of the DAX cluster that you have created.
     */

    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * A description of the DAX cluster that you have created.
     * </p>
     * 
     * @return A description of the DAX cluster that you have created.
     */

    public Cluster getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * A description of the DAX cluster that you have created.
     * </p>
     * 
     * @param cluster
     *        A description of the DAX cluster that you have created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterResult withCluster(Cluster cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterResult == false)
            return false;
        CreateClusterResult other = (CreateClusterResult) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterResult clone() {
        try {
            return (CreateClusterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
