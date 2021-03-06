package com.qbase.onevapharm.webapp.util;

/*
* #%L
 * * OneVA Pharmacy
 * *
 * %%
 * Copyright (C) 2013 - 2014 Qbase
 * *
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * Enum description
 *
 */
public enum OrderControlType {

    Refill("RF"), PartialFill("PF"), OrderRefilled("OF"), UnableToRefill("UF");

    /** Field description */
    private final String value;

    /**
     * Constructs ...
     *
     *
     * @param value
     */
    private OrderControlType(String value) {
        this.value = value;
    }

    /**
     * Method description
     *
     *
     * @param str
     *
     * @return
     */
    public static OrderControlType toType(String str) {

        OrderControlType result = null;

        for (OrderControlType type : OrderControlType.values()) {

            if (type.value.equals(str)) {

                result = type;

                break;
            }
        }

        return result;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public String getValue() {

        return this.value;
    }
}
