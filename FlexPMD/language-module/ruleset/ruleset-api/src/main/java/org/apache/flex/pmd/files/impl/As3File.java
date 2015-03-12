/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.flex.pmd.files.impl;

import org.apache.flex.pmd.files.IAs3File;

import java.io.File;

/**
 * @author xagnetti
 */
class As3File extends AbstractFlexFile implements IAs3File {
    /**
     * @param file
     * @param rootDirectory
     */
    protected As3File(final File file,
                      final File rootDirectory) {
        super(file, rootDirectory);
    }

    /*
     * (non-Javadoc)
     * @see com.adobe.ac.pmd.files.impl.AbstractFlexFile#getCommentClosingTag()
     */
    @Override
    public final String getCommentClosingTag() {
        return "*/";
    }

    /*
     * (non-Javadoc)
     * @see com.adobe.ac.pmd.files.impl.AbstractFlexFile#getCommentOpeningTag()
     */
    @Override
    public final String getCommentOpeningTag() {
        return "/*";
    }

    /*
     * (non-Javadoc)
     * @see com.adobe.ac.pmd.files.IFlexFile#getSingleLineComment()
     */
    public String getSingleLineComment() {
        return "//";
    }

    /*
     * (non-Javadoc)
     * @see com.adobe.ac.pmd.files.impl.AbstractFlexFile#isMainApplication()
     */
    @Override
    public final boolean isMainApplication() {
        return false;
    }

    /*
     * (non-Javadoc)
     * @see com.adobe.ac.pmd.files.impl.AbstractFlexFile#isMxml()
     */
    @Override
    public final boolean isMxml() {
        return false;
    }
}