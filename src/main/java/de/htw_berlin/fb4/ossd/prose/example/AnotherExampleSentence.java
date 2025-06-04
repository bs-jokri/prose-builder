/*
 * Copyright (c) 2025 Johannes Kristan
 * SPDX-License-Identifier: MIT
 * See the LICENSE file in the root directory for more information.
 */
package de.htw_berlin.fb4.ossd.prose.example;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class AnotherExampleSentence implements Sentence {
    @Override
    public String get() {
        return "Die Zukunft gehört denen, die an die Schönheit ihrer Träume glauben."; // (Eleanor Roosevelt);
    }
}
