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

package org.apache.shardingsphere.db.protocol.postgresql.packet.command.query.extended.bind.protocol;

import org.junit.jupiter.api.Test;
import org.postgresql.util.PGobject;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PostgreSQLTextBitUtilsTest {
    
    @Test
    void assertParse() {
        String textValue = "1";
        PGobject actual = PostgreSQLTextBitUtils.parse(textValue);
        assertThat(actual.getType(), is("bit"));
        assertThat(actual.getValue(), is(textValue));
    }
    
    @Test
    void assertGetTextBitValue() {
        Object jdbcBitValue = true;
        String textValue = PostgreSQLTextBitUtils.getTextValue(jdbcBitValue);
        assertThat(textValue, is("1"));
    }
}
