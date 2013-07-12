/*
 * Copyright 2013 Palantir Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palantir.typescript.tsbridge.syntaxhighlight;

import com.google.common.base.Preconditions;

/**
 * Corresponds to matching object from TypeScript.
 *
 * @author tyleradams
 */
public final class ClassificationInfo {

    private int length;
    private int classification;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        Preconditions.checkArgument(length >= 0);

        this.length = length;
    }

    public int getClassification() {
        return this.classification;
    }

    public void setClassification(int classification) {
        Preconditions.checkArgument(classification >= 0);

        this.classification = classification;
    }

}