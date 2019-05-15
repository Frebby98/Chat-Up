package com.google.firebase.frebby.mychatapp;


import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;


import org.junit.Rule;
import org.junit.runner.RunWith;

/**
 * Copyright Google Inc. All Rights Reserved.
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


@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    private class ActivityTestRule<T> {
        public ActivityTestRule(Class<T> mainActivityClass) {
        }
    }


    // Add instrumentation test here
}
