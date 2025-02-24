/*
 * Original Work Copyright 2018 H2O.ai.
 * Modified by Weiran Liu. Adjust the code based on Alibaba Java Code Guidelines.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package biz.k11i.xgboost.fvec;

import org.apache.commons.math3.util.Precision;

/**
 * Feature Vector Double Array.
 *
 * @author KOMIYA Atsushi, Michal Kurka, Weiran Liu
 * @date 2021/10/08
 */
class FvecDoubleArray implements Fvec {
    private static final long serialVersionUID = 5004062882376155663L;
    /**
     * double value array
     */
    private final double[] values;
    /**
     * whether treat 0 as N/A
     */
    private final boolean treatsZeroAsNa;

    FvecDoubleArray(double[] values, boolean treatsZeroAsNa) {
        this.values = values;
        this.treatsZeroAsNa = treatsZeroAsNa;
    }

    @Override
    public float featureValue(int index) {
        if (values.length <= index) {
            return Float.NaN;
        }

        final double result = values[index];
        if (treatsZeroAsNa && Precision.equals(result, 0, Double.MIN_VALUE)) {
            return Float.NaN;
        }

        return (float) result;
    }
}
