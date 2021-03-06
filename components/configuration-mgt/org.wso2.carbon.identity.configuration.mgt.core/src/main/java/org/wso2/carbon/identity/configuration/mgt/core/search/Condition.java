/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.carbon.identity.configuration.mgt.core.search;

import org.wso2.carbon.identity.configuration.mgt.core.search.exception.PrimitiveConditionValidationException;

/**
 * Represent the base class for {@link PrimitiveCondition} and {@link ComplexCondition}.
 */
public interface Condition {

    /**
     * Build while validating a placeholder sql query ready for a prepared statement alongside with a data array in
     * the order of how the
     * data should be inserted in to the prepared statement.
     *
     * @param primitiveConditionValidator Validator for primitive conditions.
     * @return A {@link PlaceholderSQL} object with a placeholder sql and the ordered data array.
     */
    PlaceholderSQL buildQuery(PrimitiveConditionValidator primitiveConditionValidator)
            throws PrimitiveConditionValidationException;
}
