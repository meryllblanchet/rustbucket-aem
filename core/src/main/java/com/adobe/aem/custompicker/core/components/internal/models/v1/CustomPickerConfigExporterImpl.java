/*
 *  Copyright 2020 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.adobe.aem.custompicker.core.components.internal.models.v1;

import com.adobe.aem.custompicker.core.components.models.CustomPickerConfigExporter;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;

import javax.annotation.PostConstruct;

@Model(
    adaptables = SlingHttpServletRequest.class,
    adapters = CustomPickerConfigExporter.class)
public class CustomPickerConfigExporterImpl implements CustomPickerConfigExporter {

    @Self
    SlingHttpServletRequest request;

    @PostConstruct
    protected void postConstruct() {
        // TODO: Retrieve Firefly app data
    }

    @Override public String getUrl() {
        return "https://301276-rustbucket-stage.adobeio-static.net/index.html";
    }

    @Override public String getJavaScriptUrl() {
        return "https://301276-rustbucket-stage.adobeio-static.net/src.a2b27638.js";
    }

    @Override public String getCssUrl() {
        return "https://301276-rustbucket-stage.adobeio-static.net/src.a2b27638.css";
    }

    @Override public String getPagePath() {
        // TODO: This does not work, sling model renders empty value
        return request.getRequestPathInfo().getSuffix();
    }
}