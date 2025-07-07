/* SPDX-FileCopyrightText: 2025 Johannes Kristan
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 *  SPDX-License-Identifier: MIT
 */
package de.htw_berlin.fb4.ossd.prose.example;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {

        Sentence s1 = () -> "Haste mal ne Mark?";

        ProseBuilder builder = new ProseBuilder();
        builder.register(s1);
        builder.register(new ExampleSentence());
        String result = builder.get();

        logger.info(result);
    }
}
