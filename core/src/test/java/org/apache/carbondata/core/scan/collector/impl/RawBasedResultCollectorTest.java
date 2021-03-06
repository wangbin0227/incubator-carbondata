/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.carbondata.core.scan.collector.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RawBasedResultCollectorTest {
//
//  private static RawBasedResultCollector rawBasedResultCollector;
//  private static BlockExecutionInfo blockExecutionInfo;
//  private static KeyGenerator keyGenerator;
//
//  @BeforeClass public static void setUp() {
//    keyGenerator = new MockUp<KeyGenerator>() {
//      @SuppressWarnings("unused") @Mock long[] getKeyArray(byte[] key, int[] maskedByteRanges) {
//        return new long[] { 1, 2 };
//      }
//
//      @SuppressWarnings("unused") @Mock byte[] generateKey(long[] keys) throws KeyGenException {
//        return new byte[] { 1, 2 };
//      }
//
//    }.getMockInstance();
//
//    blockExecutionInfo = new BlockExecutionInfo();
//    KeyStructureInfo keyStructureInfo = new KeyStructureInfo();
//    keyStructureInfo.setKeyGenerator(keyGenerator);
//    keyStructureInfo.setMaxKey(new byte[] { 1, 2 });
//    keyStructureInfo.setMaskedBytes(new int[] { 1, 2 });
//    keyStructureInfo.setMaskByteRanges(new int[] { 1, 2 });
//    blockExecutionInfo.setKeyStructureInfo(keyStructureInfo);
//    AggregatorInfo aggregatorInfo = new AggregatorInfo();
//    aggregatorInfo.setMeasureOrdinals(new int[] { 10, 20, 30, 40 });
//    aggregatorInfo.setMeasureExists(new boolean[] { true, false, false, false });
//    aggregatorInfo.setDefaultValues(new Object[] { 1, 2, 3, 4 });
//    aggregatorInfo.setMeasureDataTypes(
//        new DataType[] { DataType.INT, DataType.TIMESTAMP, DataType.INT, DataType.INT });
//    QueryMeasure queryMeasure1 = new QueryMeasure("QMCol1");
//    queryMeasure1.setQueryOrder(1);
//    QueryMeasure queryMeasure2 = new QueryMeasure("QMCol2");
//    queryMeasure1.setQueryOrder(2);
//    QueryMeasure queryMeasure3 = new QueryMeasure("QMCol3");
//    queryMeasure1.setQueryOrder(3);
//    QueryMeasure queryMeasure4 = new QueryMeasure("QMCol4");
//    queryMeasure1.setQueryOrder(4);
//    QueryDimension queryDimension1 = new QueryDimension("QDCol1");
//    queryDimension1.setQueryOrder(1);
//    ColumnSchema columnSchema = new ColumnSchema();
//    queryDimension1.setDimension(new CarbonDimension(columnSchema, 0, 0, 0, 0));
//    QueryDimension queryDimension2 = new QueryDimension("QDCol2");
//    queryDimension2.setQueryOrder(2);
//    queryDimension2.setDimension(new CarbonDimension(columnSchema, 1, 1, 1, 1));
//    QueryDimension queryDimension3 = new QueryDimension("QDCol3");
//    queryDimension3.setQueryOrder(3);
//    queryDimension3.setDimension(new CarbonDimension(columnSchema, 2, 0, 0, 0));
//    QueryDimension queryDimension4 = new QueryDimension("QDCol4");
//    queryDimension4.setQueryOrder(4);
//    queryDimension4.setDimension(new CarbonDimension(columnSchema, 3, 0, 0, 0));
//    blockExecutionInfo.setQueryDimensions(
//        new QueryDimension[] { queryDimension1, queryDimension2, queryDimension3,
//            queryDimension4 });
//    blockExecutionInfo.setQueryMeasures(
//        new QueryMeasure[] { queryMeasure1, queryMeasure2, queryMeasure3, queryMeasure4 });
//    blockExecutionInfo.setFixedKeyUpdateRequired(true);
//    blockExecutionInfo.setAggregatorInfo(aggregatorInfo);
//    blockExecutionInfo.setMaskedByteForBlock(new int[] { 1, 2 });
//    blockExecutionInfo.setBlockKeyGenerator(keyGenerator);
//    rawBasedResultCollector = new RawBasedResultCollector(blockExecutionInfo);
//  }
//
//  @Test public void testToCollectData() {
//
//    new MockUp<NonFilterQueryScannedResult>() {
//      @SuppressWarnings("unused") @Mock byte[] getDictionaryKeyArray() {
//        this.getMockInstance().incrementCounter();
//        return new byte[] { 1, 2 };
//      }
//
//      @SuppressWarnings("unused") @Mock byte[][] getNoDictionaryKeyArray() {
//        return new byte[][] { { 1, 2 } };
//      }
//
//      @SuppressWarnings("unused") @Mock byte[][] getComplexTypeKeyArray() {
//        return new byte[][] { { 1, 2 }, { 1, 2 } };
//      }
//
//      @SuppressWarnings("unused") @Mock public MeasureColumnDataChunk getMeasureChunk(int ordinal) {
//        MeasureColumnDataChunk measureColumnDataChunk = new MeasureColumnDataChunk();
//        PresenceMeta presenceMeta = new PresenceMeta();
//        BitSet bitSet = new BitSet();
//        bitSet.set(1);
//        presenceMeta.setBitSet(bitSet);
//        measureColumnDataChunk.setNullValueIndexHolder(presenceMeta);
//        CarbonReadDataHolder carbonReadDataHolder = new CarbonReadDataHolder();
//        carbonReadDataHolder.setReadableLongValues(new long[] { 1 });
//        measureColumnDataChunk.setMeasureDataHolder(carbonReadDataHolder);
//        return measureColumnDataChunk;
//      }
//    };
//
//    new MockUp<QueryUtil>() {
//      @SuppressWarnings("unused") @Mock byte[] getMaskedKey(byte[] data, byte[] maxKey,
//          int[] maskByteRanges, int byteCount) {
//        return new byte[] { 1, 2 };
//      }
//    };
//
//    AbstractScannedResult abstractScannedResult =
//        new NonFilterQueryScannedResult(blockExecutionInfo);
//    abstractScannedResult.setNumberOfRows(2);
//    List<Object[]> result = rawBasedResultCollector.collectData(abstractScannedResult, 2);
//    int expectedResult = 2;
//    assertThat(result.size(), is(equalTo(expectedResult)));
//  }
}
