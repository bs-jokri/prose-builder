/* SPDX-FileCopyrightText: 2025 Johannes Kristan
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 *  SPDX-License-Identifier: MIT
 *
 * 
 *  Copyright (C) 2025 Quy Ny Hoang
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package de.htw_berlin.fb4.ossd.prose.example;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        Sentence s1 = () -> "Haste mal ne Mark!";

        ProseBuilder builder = new ProseBuilder();
        builder.register(s1);
        builder.register(new ExampleSentence());
        String result = builder.get();
        System.out.println( result);
    }
}
