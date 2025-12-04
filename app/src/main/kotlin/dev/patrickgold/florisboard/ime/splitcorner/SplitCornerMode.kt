/*
 * Copyright (C) 2025 Hemispheres Contributors
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

package dev.patrickgold.florisboard.ime.splitcorner

/**
 * Enum representing the split corner keyboard mode state.
 * When ENABLED in landscape orientation, the keyboard splits into two halves
 * positioned at the top corners of the screen.
 */
enum class SplitCornerMode {
    /** Split corner mode is disabled */
    OFF,

    /** Split corner mode is enabled */
    ENABLED;
}
