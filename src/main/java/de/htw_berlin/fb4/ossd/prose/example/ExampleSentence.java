/*
 * Copyright (c) 2025 Johannes Kristan
 * SPDX-License-Identifier: MIT
 * See the LICENSE file in the root directory for more information.
 */

package de.htw_berlin.fb4.ossd.prose.example;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class ExampleSentence implements Sentence {
    @Override
    public String get() {
        return "Es steckt oft mehr Geist und Scharfsinn in einem Irrtum als in einer Entdeckung."; // (Joseph Joubert);
    }
}
