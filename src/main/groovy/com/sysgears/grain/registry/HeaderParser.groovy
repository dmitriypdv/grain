/*
 * Copyright (c) 2013 SysGears, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sysgears.grain.registry

/**
 * Interface of resource header parser
 */
interface HeaderParser {

    /**
     * Parses resource header
     *
     * @param resourceFile resource file
     *
     * @return header key -> value map
     *
     * @throws HeaderParseException in case of header parse error 
     */
    Map<String, Object> parse(File resourceFile) throws HeaderParseException

    /**
     * Parses resource header
     *
     * @param resourceFile resource file
     * @param header header content
     *
     * @return header key -> value map
     *
     * @throws HeaderParseException in case of header parse error 
     */
    Map<String, Object> parse(File resourceFile, String header) throws HeaderParseException
}
