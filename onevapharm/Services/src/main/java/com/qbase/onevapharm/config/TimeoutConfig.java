package com.qbase.onevapharm.config;

/*
 * #%L
 * OneVA Pharmacy
 * %%
 * Copyright (C) 2013 - 2014 Qbase
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
 * Class description
 *
 *
 * @version        v1.0, 2014-08-26
 * @author         Jim Horner
 */
public class TimeoutConfig {

    /** Field description */
    private int connectTimeout;

    /** Field description */
    private int requestTimeout;

    /**
     * Constructs ...
     *
     */
    public TimeoutConfig() {
        super();
    }

    /**
     * Constructs ...
     *
     *
     * @param connectTimeout
     * @param requestTimeout
     */
    public TimeoutConfig(int connectTimeout, int requestTimeout) {

        super();
        this.connectTimeout = connectTimeout;
        this.requestTimeout = requestTimeout;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public int getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public int getRequestTimeout() {
        return requestTimeout;
    }

    /**
     * Method description
     *
     *
     * @param connectTimeout
     */
    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    /**
     * Method description
     *
     *
     * @param requestTimeout
     */
    public void setRequestTimeout(int requestTimeout) {
        this.requestTimeout = requestTimeout;
    }
}
