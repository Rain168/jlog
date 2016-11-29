/*
 * Copyright 2016 JiongBull
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

package com.jiongbull.jlog.sample;

import com.jiongbull.jlog.Logger;
import com.jiongbull.jlog.util.TimeUtils;

/**
 * 测试Proguard.
 */
@SuppressWarnings({"WeakerAccess"})
public class Foo {

    /**
     * 打印当前日期.
     */
    public void now(Logger logger) {
        logger.e(TimeUtils.getCurDate(TimeUtils.ZoneOffset.N0800));
    }
}