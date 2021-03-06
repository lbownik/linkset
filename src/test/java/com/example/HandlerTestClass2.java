// -----------------------------------------------------------------------------
//    LinkSet
//    Copyright: 2010 Lukasz Bownik (lukasz.bownik@gmail.com)
//
//    This file is part of LinkSet.
//
//    LinkSet is free software; you can redistribute it and/or modify
//    it under the terms of the Lesser GNU General Public License as published by
//    the Free Software Foundation; either version 2 of the License, or
//    (at your option) any later version.
//
//    LinkSet is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    Lesser GNU General Public License for more details.
//
//    You should have received a copy of the Lesser GNU General Public License
//    along with LinkSet; if not, write to the Free Software
//    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
// -----------------------------------------------------------------------------
package com.example;

import org.linkset.*;

/*******************************************************************************
 * The handler test class
 *
 * @author Łukasz Bownik (lukasz.bownik@gmail.com)
 ******************************************************************************/
public final class HandlerTestClass2 {

    /***************************************************************************
     *
     **************************************************************************/
    @MethodId("method2")
    private void method2() {

        System.out.println("Method2 invoked.");
    }
    /***************************************************************************
     *
     **************************************************************************/
    @MethodId("staticMethod2")
    private static void staticMethod2() {

        System.out.println("staticMethod2 invoked.");
    }
}
