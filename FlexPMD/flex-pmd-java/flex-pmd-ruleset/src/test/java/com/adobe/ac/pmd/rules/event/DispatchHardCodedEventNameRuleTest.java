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
package com.adobe.ac.pmd.rules.event;

import com.adobe.ac.pmd.rules.core.AbstractRegExpBasedRuleTest;
import com.adobe.ac.pmd.rules.core.AbstractRegexpBasedRule;
import com.adobe.ac.pmd.rules.core.ViolationPosition;

public class DispatchHardCodedEventNameRuleTest extends AbstractRegExpBasedRuleTest
{
   @Override
   protected ExpectedViolation[] getExpectedViolatingFiles()
   {
      return new ExpectedViolation[]
      { new ExpectedViolation( "com.adobe.ac.ncss.BigImporterModel.as", new ViolationPosition[]
       { new ViolationPosition( 46 ) } ),
                  new ExpectedViolation( "AbstractRowData.as", new ViolationPosition[]
                  { new ViolationPosition( 98 ),
                              new ViolationPosition( 99 ) } ) };
   }

   @Override
   protected String[] getMatchableLines()
   {
      return new String[]
      { "dispatchEvent(new Event(\"change\" ));",
                  "dispatchEvent( new Event('change') );",
                  "dispatchEvent(new Event(\"change\"));",
                  "dispatchEvent( new Event( 'selectedGroupFieldsChange' ) )" };
   }

   @Override
   protected AbstractRegexpBasedRule getRegexpBasedRule()
   {
      return new DispatchHardCodedEventNameRule();
   }

   @Override
   protected String[] getUnmatchableLines()
   {
      return new String[]
      { "var i : int = 0;",
                  "lala();",
                  "dispatchEvent( new Event( CONST ) );",
                  "dispatchEvent(new Event(Rule.CONST));" };
   }
}
